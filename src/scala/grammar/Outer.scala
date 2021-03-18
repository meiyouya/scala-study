package grammar

/**
 * scala中 private比Java严格的多，只有自己可以访问
 * protected也严格的多，只有自己和子类可以访问，Java同包下也可以
 * public就一样了
 * Scala默认是public，不像Java有个default
 */
class Outer {
    private var a = 123;
    private def getA: Int = {
        a;
    }
    class Inner {
        private var b = 456;
        private def getB: Int = {
            b;
        }
    }
    def test(): Unit = {
        val inner = new Inner
        // 外部类也无法访问内部类的私有成员
//        println(inner.getB)
        // 内部类无法访问外部的private 成员
//        print(inner.getA())
    }

}
