import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/08.
  */
class OptionQuestionSpec extends FunSuite {
  test("get First Char") {
    assert(q1_q4.getFirstChar(Some("hogehoge")) == "h" )
    assert(q1_q4.getFirstChar(None) == "")
  }

  test("translate") {
    assert(q1_q4.translate(Some(1)).contains("one"))
    assert(q1_q4.translate(None).isEmpty)
  }
}
