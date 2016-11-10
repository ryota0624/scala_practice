import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/11.
  */
class QSpec extends FunSuite {
  test("getFirstChar") {
    assert(q1_q4.getFirstChar(Some("hogehoge")) == "h")
    assert(q1_q4.getFirstChar(Some("")) == "")
  }
}


//
//@inline final def collect[B](pf: PartialFunction[A, B]): Option[B] =
//  if (!isEmpty) pf.lift(this.get) else None