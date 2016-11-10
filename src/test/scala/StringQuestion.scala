import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/08.
  */
class StringQuestionSpec extends FunSuite {
  test("split dot") {
    assert(q9_q10.splitDot("hello.world").toList.equals(Array("hello", "world").toList))
  }
}
