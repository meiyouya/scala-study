package grammar

object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("hello world")
        var a = "Hi, I am A for now"
        println(a)
        val b = "Hi, I have always been B"
        println(b)
        a = "Hi, I am C for now"
        println(a)
        // 元组
        val tuple = (123, "123")
        println(tuple.getClass)
    }

}
