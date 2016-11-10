import org.scalatest.FunSuite

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by ryota on 2016/11/08.
  */
class saikiSpec extends FunSuite {
  test("saiki") {
    assert(Saiki.fooRefactoring(10, 3).equals(Saiki.foo(10, 3)))
  }

  test("firstOf") {
    val f1 = Saiki.firstOf(Future{ Thread.sleep(10); 1}, Future{ Thread.sleep(1000); 2})
    val f1re = Await.result(f1, Duration.Inf)
    assert(f1re == 1)

    val f2 = Saiki.firstOf(Future{ Thread.sleep(1000); 1}, Future{ Thread.sleep(10); 2})
    val f2re = Await.result(f2, Duration.Inf)
    assert(f2re == 2)
  }
}
