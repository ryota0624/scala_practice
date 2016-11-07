/**
  * Created by ryota on 2016/11/08.
  */
class User private(val name: String, val age: Int) {
}

object User {
  def apply(name: String, age: Int): User = new User(name, age)
}
