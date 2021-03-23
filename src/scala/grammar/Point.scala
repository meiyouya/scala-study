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

// 测试伴生对象
// 私有构造方法，这样其它地方就无法创建其对象，只有伴生对象可以
class Marker private(color: String) {
    println("创建对象：" + this)

    // 私有一个num成员，别的地方也无法访问到这个成员，只有伴生对象可以
    private var num: Int = 1

    override def toString: String = "标记的颜色为：" + color
}

// 和类同名的object就是这个类的伴生对象
// 伴生对象可以访问类的私有属性和私有方法，使用上来说就是Java中static的替代品
object Marker {
    def main(args: Array[String]): Unit = {
        val marker = new Marker("red")
        println(marker.num)
        println(marker.toString)
    }
}