package grammar

object ETH {

    def main(args: Array[String]): Unit = {
        var a = 0.6
        var i = 1
        while (i <= 30) {
            a = a + (a * 0.1 * 0.3)
            println(s"第$i 次：$a")
            i = i + 1
        }
    }
}
