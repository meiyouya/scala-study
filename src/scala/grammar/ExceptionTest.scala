package grammar

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionTest {

    def main(args: Array[String]): Unit = {
        try {
            val reader = new FileReader("a.txt")
        } catch {
            case fileNotFound: FileNotFoundException => println("文件不存在")
            case io: IOException => println("读取时发生异常")
        } finally {
            println("I will exits no matter what happend")
        }
    }
}
