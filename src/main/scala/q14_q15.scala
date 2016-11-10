import scala.annotation.tailrec
import scala.concurrent.{Future, Promise}

/**
  * Created by ryota on 2016/11/08.
  */
object Saiki {
  def foo(n: Int, count: Int): Int = {
    var i = 0
    var sum = 0
    while(i < count) {
      sum += n
      i += 1
    }

    sum
  }

  @tailrec
  def fooRefactoring(n: Int, count: Int, acc: Int = 0): Int = {
    if (count == 0) acc
    else fooRefactoring(n , count - 1, acc + n)
  }

  def firstOf[T](v1: Future[T], v2: Future[T]): Future[T] = {
    val promise = Promise[T]()
    promise.tryCompleteWith(v1)
    promise.tryCompleteWith(v2)
    promise.future
  }
}
