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

class Location(xInit: Int, yInit: Int, zInit: Int) extends Point(xInit, yInit) {

    var z: Int = zInit

    def move(xAdd: Int, yAdd: Int, zAdd: Int): Unit = {
        x += xAdd
        y += yAdd
        z += zAdd
        println("移动后的坐标：(" + x + ", " + y + ", " + z + ")")
    }
}

object Test {
    def main(args: Array[String]): Unit = {
        val point = new Point(10, 10)
        point.move(5, 10)
        val location = new Location(5, 5, 5)
        location.move(1, 2)
        location.move(3, 4, 5)
    }
}
