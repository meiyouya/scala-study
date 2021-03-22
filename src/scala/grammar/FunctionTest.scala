package grammar

/**
 * 函数是Scala的核心，定义在类中的函数，就叫做方法
 */
object FunctionTest {

    def main(args: Array[String]): Unit = {
        delayed(time())
    }

    def time(): Long = {
        println("调用了获取当前时间的方法")
        System.nanoTime()
    }

    // 增加 =>   声明为传名调用
    def delayed(t: => Long): Unit = {
        println("已经进入了delayed方法")
        println("delayed方法获取到的参数：" + t)
        // 返回t的时候还会调用一次time方法
        t
    }
}
