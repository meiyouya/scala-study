package grammar

object ExtractorTest2 {

    def main(args: Array[String]): Unit = {
        val x = ExtractorTest2(5)
        // x是apply方法的返回值，所以x=10
        println(x)
        // 抽取器执行match语句是，会自动执行unapply方法
        x match {
            // unapply的返回值是5，所以num是5
            case ExtractorTest2(num) => println(x + "是" + num + "的两倍")
            case _ => println("超出计算范围")
        }
    }

    def apply(x: Int): Int = x * 2

    def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z/2) else None
}
