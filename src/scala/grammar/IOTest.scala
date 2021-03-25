package grammar

import scala.io.Source

object IOTest {

    def main(args: Array[String]): Unit = {
        // 写入文件
//        val writer = new PrintWriter(new File("test.txt"))
//        writer.println("Scala用起来比Java爽一点")
//        writer.write("Scala用起来比Java爽一点2")
//        writer.close()

        // 读取文件
        Source.fromFile("test.txt").foreach{
            print
        }

        // 读取用户输入
//        println("What's is your name?")
//        val line = StdIn.readLine()
//        println("Oh, nice to meet you " + line + "!")

    }
}
