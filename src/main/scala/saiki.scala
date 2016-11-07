import scala.concurrent.{Future, Promise}

/**
  * Created by ryota on 2016/11/08.
  */
class saiki {
  def foo(n: Int, count: Int): Int = {
    var i = 0
    var sum = 0
    while(i < count) {
      sum += n
      i += 1
    }

    sum
  }

  def fooRefactoring(n: Int, count: Int): Int = {
    if(n == 0) 0 else n + fooRefactoring(n, count - 1)
  }

  def firstOf[T](v1: Future[T], v2: Future[T]): Future[T] = {
    val promise = Promise[T]()
    promise.tryCompleteWith(v1)
    promise.tryCompleteWith(v2)
    promise future
  }
}
