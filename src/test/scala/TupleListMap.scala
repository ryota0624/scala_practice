import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/08.
  */
class TupleListMapSpec extends FunSuite {
  test("listToMap") {
    val map = q5_q8.listToMap()
    assert(map.isDefinedAt(1))
    assert(map.isDefinedAt(2))
  }

  test("separate list") {
    q5_q8.separateList() match {
      case (evens, odds) => {
        assert(evens.equals(List(2, 4)))
        assert(odds.equals(List(1, 3, 5)))
      }
    }
  }

  test("listToMapWithIndex") {
    assert(q5_q8.listToMapWithIndex().equals(Map(0 -> "zero", 1 -> "one", 2 -> "two")))
  }

  test("dist score") {
    assert(q5_q8.distScore().map({ case (name, _) => name }).equals(List("ichiro", "hanako")))
  }
}
