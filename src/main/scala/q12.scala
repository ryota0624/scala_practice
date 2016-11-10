/**
  * Created by ryota on 2016/11/08.
  */
object Hoge {
  def foo(n: Int): Int = {
    println(s"input = $n")
    val r = n * 3
    println(s"result = $r")

    r
  }

  def bar(s: String): String = {
    println(s"input = $s")
    var r = s * 2
    println(s"result = $r")

    r
  }
}

object HogeRefactoring {
  def inout[T, U](in: T, fn: (T) => U):U = {
    println(s"input = ${in}")
    val out = fn(in)
    println(s"result = ${out}")
    out
  }
  def foo(n: Int): Int = {
    inout[Int, Int](n, _ * 2)
  }

  def bar(s: String): String = {
    inout[String, String](s, _ * 3)
  }
}

