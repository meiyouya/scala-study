package grammar

import scala.util.matching.Regex

object RegexTest {
    def main(args: Array[String]): Unit = {
        // 基础用法，可以通过 .r  直接获取到Regex对象
        val pattern = "Scala".r
        val str = "Scala is Scalable and cool"
        println(pattern.findAllIn(str).mkString(","))

        // 也可以使用new Regex获取对象
        val p2 = new Regex("(S|s)cala")
        val str2 = "Scala is scalable and cool"
        println(p2.findAllIn(str2).mkString(","))

        // 正则替换
        val str3 = pattern.replaceAllIn(str2, "Java")
        val str4 = p2.replaceAllIn(str2, "Java")
        println(str2)
        println(str3)
        println(str4)
    }
}
