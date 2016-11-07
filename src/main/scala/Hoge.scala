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
  def inout[T](in: T, out: T):T = {
    println(s"input = $in\nresult = ${out}")
    out
  }
  def foo(n: Int): Int = {
    inout(n, n*3)
  }

  def bar(s: String): String = {
    inout(s, s*2)
  }
}

