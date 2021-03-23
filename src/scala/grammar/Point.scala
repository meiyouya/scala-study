package grammar

class Point(xInit: Int, yInit: Int) {

    // 初始值等于创建对象时候的值
    var x: Int = xInit
    var y: Int = yInit

    def move(xAdd: Int, yAdd: Int): Unit = {
        x += xAdd
        y += yAdd
        println("移动后的坐标：(" + x + ", " + y + ")")
    }

}

object Test {
    def main(args: Array[String]): Unit = {
        val point = new Point(10, 10)
        point.move(5, 10)
    }
}
