package grammar

object MatchTest {

    def main(args: Array[String]): Unit = {
        println(matchInt(4))
        println(matchAny("two"))
    }

    def matchInt(x: Int): String = x match {
        case 1 => "one"
        case 2 => "two"
        case 3 => "three"
        // 不加这一行，如果传入的值不存在会报MatchError错误
        case _ => "zero"
    }

    def matchAny(x: Any): Any = x match {
        case 1 => "one"
        case "two" => 2
        case a: Int => "数字： " + a
        case _ => "nothing"
    }
}

object CaseTest {
    def main(args: Array[String]): Unit = {
        val zhangsan = Person("zhangsan", 23)
        val lisi = Person("lisi", 24)
        val wangwu = Person("wangwu", 25)

        for (p <- List(zhangsan, lisi, wangwu)) {
            p match {
                case Person("zhangsan", 23) => println("hi zhangsan")
                case Person("lisi", 24) => println("hi lisi")
                case Person(name, age) => println("hi " + name + "，age " + age + "?")
            }
        }
    }
    // 样例类是Scala特有的类，它是经过优化，专门用于模式匹配的
    // case类默认做了以下几件事：
    // 1. 构造器的每个参数都会默认被声明为val，除非你显示的声明为var，但是并不建议你这么做
    // 2. 其伴生对象会自动提供apply方法，所以不需要使用new关键字就可以创建对象
    // 3. 默认提供了unapply方法使模式匹配可以工作
    // 4. 自动生成了toString,equals,hashCode和copy方法，除非显示的给出这些方法的定义
    case class Person(name: String, age: Int)
}
