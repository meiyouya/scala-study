package grammar

/**
 * 函数是Scala的核心，定义在类中的函数，就叫做方法
 */
object FunctionTest {

    def main(args: Array[String]): Unit = {
        /**
         * 函数调用有2种方式：
         * 1. 传值调用：将表达式计算完毕后当做一个值传递到函数内部
         * 2. 传名调用：将表达式直接传递到函数内部，每次引用是都会重新计算一次表达式的值作为此次调用的记过
         */
//        delayed(time())
//        shopping("张三", "白菜", "紫菜", "萝卜")
//        println(factorial(5))
//        getAge(name = "李四")
//        println(apply(f1, 3))
//        println(apply(getAge, 3, "王五"))
//        println(sum(5))
//        println(increment(4))
//        println(inc(6))
//        println(userDir())
//        test()
//        println(add1(2, 3))
//        println(add2(2)(3))
        println(grow(2))
        println(grow(3))
    }

    def time(): Long = {
        println("调用了获取当前时间的方法")
        System.nanoTime()
    }

    // 增加 =>   声明为传名调用
    def delayed(t: => Long): Unit = {
        println("已经进入了delayed方法")
        // 每次引用t时都会调用time()方法，并得到其返回值
        println("delayed方法获取到的参数：" + t)
        // 所以两次输出的t的值是不同的
        println("delayed方法获取到的参数：" + t)
        // 返回t的时候还会调用一次time方法，返回的值和前两次调用的t也是不同的
        t
    }

    // 方法的最后一个参数加 *   可以定义为可变参数
    def shopping(buyerName: String, goods: String*): Unit = {
        println("购买者：" + buyerName)
        for (item <- goods) {
            println("购买了：" + item)
        }
    }

    // 使用阶乘模拟递归调用
    def factorial(x : Int): BigInt = {
        if (x <= 1) {
            1
        } else {
            x * factorial(x - 1)
        }
    }

    // 定义有默认值的方法，定义了有默认值的参数在调用时可以不传递
    // 但是如果使用按顺序传递的话，无法只传递第二个参数，只能使用按key传递才能值传递第二个参数
    def getAge(age: Int = 18, name: String): String = {
        name + "的年龄是：" + age
    }

    // 高阶函数可以使用其他函数作为参数或返回值
    def apply(f: Int => String, v: Int) = f(v)
    def apply(f: (Int, String) => String, age: Int, name: String) = f(age, name)

    def f1(v: Int): String = {
        "值为：" + v
    }

    // 嵌套函数
    def sum(max: Int): Int = {
        def total(max: Int, base: Int): Int = {
            if (max <= 0) {
                return base
            }
            if (base < 0) {
                total(max - 1, max)
            } else {
                total(max - 1, max + base)
            }
        }
        total(max, 1)
    }

    // 匿名函数
    var increment = (base: Int) => base + 1
    var userDir = () => System.getProperty("user.dir")
    // 上面的匿名函数就是下面这种的简写，Scala提供了Function0到Function22共23个trait用于创建函数，建议用上面的方式
    var inc = new Function1[Int, Int] {
        def apply(base: Int): Int = base + 1
    }

    // 偏应用函数，这个东西有点类似于Java带默认值的方法重载，但又不完全相同
    def test() = {
        println(eat("张三", "苹果"))
        println(eat("张三", "香蕉"))
        println(eat("张三", "梨"))
        println(eat("张三", "橘子"))
        // 上面四次调用，name参数是不变的，所以可以优化为name固定为张三
        // 换做Java里，就需要提供一个eat的重载方法并制定name的值，如果name有多个，name就要提供多个重载方法
        // Scala就灵活的多，通过下划线占位，指定该参数暂时不传
        // 每个调用者都可以根据自己的需要定义偏应用函数，而不是像Java中一样，要重载很多方法放在一个类里面
        val zhangSanEat = eat("张三", _: String)
        println(zhangSanEat("苹果"))
        println(zhangSanEat("香蕉"))
        println(zhangSanEat("梨"))
        println(zhangSanEat("橘子"))
    }
    def eat(name: String, foods: String): String = {
        name + "吃：" + foods
    }

    // 函数柯里化，柯里化就是把多参数函数变为只有一个参数的普通函数依次调用，直至返回结果
    // 这是一个常规的函数，调用时  add(2, 3)就可以得到5
    def add1(x: Int, y: Int): Int = x + y
    // 这是一个柯里化后的函数，调用时  add(2)(3)也可以得到5
    def add2(x: Int)(y: Int): Int = x + y

    // 闭包，也是一个函数
    var factor = 3
    // 这个函数依赖了一个外部变量，factor，每次执行的时候都要捕获外部的factor的值，拿到函数内部来执行，这样的函数就叫做闭包
    var grow = (i: Int) => i * factor
}
