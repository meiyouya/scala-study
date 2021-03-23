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
        shopping("张三", "白菜", "紫菜", "萝卜")
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

    def shopping(buyerName: String, goods: String*) = {
        println("购买者：" + buyerName)
        for (item <- goods) {
            println("购买了：" + item)
        }
    }
}
