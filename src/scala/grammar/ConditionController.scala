package grammar

class ConditionController {
    def main(args: Array[String]): Unit = {
        var x = 10;
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
        }
    }

    def call(): String = {
        return "I am scala"
    }
}
