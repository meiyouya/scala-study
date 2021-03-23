package grammar

class ConditionController {
    def main(args: Array[String]): Unit = {
        /*var x = 10;
        if (x < 20) {
            println(x)
        } else if (x < 10) {
            println(2 * x)
        } else {
            println(x)
        }
        while (x < 20) {
            println(x)
            x = x + 1
        }*/

        // 1 to 10  包含1和10
        /*for (x <- 1 to 10) {
            println(x)
        }*/
        // 1 until 10 包含1不包含10
        /*for (x <- 1 until 10) {
            println(x)
        }*/
        // 指定多个迭代区间，会得到他们的笛卡尔积
        /*for (x <- 1 until 5; y <- 9 to 11) {
            println("x = " + x + "，y = " + y)
        }*/
        // 遍历集合等可迭代的数据结构也是同样的写法，无法特殊处理
        /*val numList = List(1, 3, 6 ,7)
        for (num <- numList) {
            println(num)
        }*/
        // 通过if指定过滤条件，只有if返回true才会进入for循环，否则将被跳过
        /*for (x <- 1 to 10;if x != 5;if x != 9) {
            println(x)
        }*/
        // 使用yield将for的结果存储在一个list中，注意这个地方for的格式有点不同，没有小括号，循环的元素无法进行其他操作
        val evenList = for {x <- 1 to 10; if x % 2 == 0}yield x
        for (even <- evenList) {
            println(even)
        }
    }

    def call(): String = {
        return "I am scala"
    }
}
