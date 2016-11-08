/**
  * Created by ryota on 2016/11/08.
  */
object StringQuestion {
  //Todo 理由
//  val l = List(List("hello", "world"), List("good", "morning"))
//  l.flatMap(_.mkString(" ").toUpperCase)

  def splitDot(str: String): Array[String] = {
    str.split('.')
  }
}
