package binarySearchTree

object Main {
    def main(args: Array[String]): Unit = {
        scala.util.Random.setSeed(42 * 42)

        val a = Node(42, Leaf, Leaf)
        val a1 = a.add(41)
        val a2 = a1.add(scala.util.Random.nextInt % 100)
        val a3 = a2.add(scala.util.Random.nextInt % 100)
        val a4 = a3.add(scala.util.Random.nextInt % 100)
        val a5 = a4.add(scala.util.Random.nextInt % 100)
        val a6 = a5.add(scala.util.Random.nextInt % 100)
        val a7 = a6.add(scala.util.Random.nextInt % 100)

        println(a.height)
        println(a1.height)
        println(a2.height)
        println(a3.height)
        println(a4.height)
        println(a5.height)
        println(a6.height)
        println(a7.height)
        
        println(a7.contains(42))
        println(a7.contains(-6))
        println(a7.contains(456))
    }
}