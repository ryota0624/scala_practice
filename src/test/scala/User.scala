import org.scalatest.FunSuite

/**
  * Created by ryota on 2016/11/08.
  */
class UserSuite extends FunSuite {
  test("user has name") {
    val user = User("name", 15)
    assert(user.name == "name")
  }
}