package grammar

object ArrayTest {

    def main(args: Array[String]): Unit = {
        // 两种声明数组的方式
//        var arr1: Array[String] = new Array[String](3)
//        var arr2 = new Array[String](5)
//        var arr3 = Array("apple", "orange", "banana")
//        println(arr3.mkString("Array(", ", ", ")"))
        // 基本的遍历方法
//        for (item <- arr3) {
//            println(item)
//        }
        // 索引遍历，有三种写法
//        for (index <- 0 to (arr3.length - 1)) {
//            println(arr3(index))
//        }
//        for (index <- 0 until arr3.length) {
//            println(arr3(index))
//        }
//        for (index <- arr3.indices) {
//            println(arr3(index))
//        }

        // 多维数组
//        var twoDimensional = Array.ofDim[Int](3, 3)
//        for (i <- 0 until 3;j <- 0 until 3) {
//            twoDimensional(i)(j) = i * j
//        }
//        for (i <- 0 until 3;j <- 0 until 3) {
//            println("第" + i + "行，第" + j + "列：" + twoDimensional(i)(j))
//        }

        // 合并数组
//        var arr1 = Array(1, 3, 5)
//        var arr2 = Array(2, 4, 6)
//        var arr3 = Array.concat(arr1, arr2)
//        println(arr1.mkString("Array(", ", ", ")"))
//        println(arr2.mkString("Array(", ", ", ")"))
//        println(arr3.mkString("Array(", ", ", ")"))

        // range创建数组，这个和Python基本一样，三个参数分别代表，起始（包含），结束（不包含），步长
        var arr1 = Array.range(1, 10, 1)
        println(arr1.mkString("Array(", ", ", ")"))
        var arr2 = Array.range(1, 10, 2)
        println(arr2.mkString("Array(", ", ", ")"))
    }
}
