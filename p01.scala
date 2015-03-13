// example:
//scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8

object last {
  def main(l: List[Int]) {
    println(l.last)
  }
  def foo(l: List[Int]) {
  	println(l.reverse.head)
  }
  def bar(l: List[Int]) {
  	println(l(l.length - 1))
  }
}

