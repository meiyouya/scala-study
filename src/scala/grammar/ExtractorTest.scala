package grammar

object ExtractorTest {

    def main(args: Array[String]): Unit = {
        println(apply("zhang", "lawliet.com"))
        println(unapply("zhang@lawliet.com"))
        println(unapply("zhang lawliet.com"))
        // 通过这种方式。会直接得到apply的返回值
        val extractor1 = ExtractorTest("lisi", "lawliet.com")
        // 输出返回值的类型是java.lang.String
        println(extractor1.getClass)
    }

    /**
     * apply方法的参数可以在创建对象的时候以构造函数的方式传入，并且会返回apply方法的返回值
     * @param user
     * @param domain
     * @return
     */
    def apply(user: String, domain: String): String = {
        user + "@" + domain
    }

    def unapply(email: String): Option[(String, String)] = {
        val emailArr = email.split("@")
        if (emailArr.length == 2) {
            Some(emailArr(0), emailArr(1))
        } else {
            None
        }
    }
}
