/**
  * Created by ryota on 2016/11/08.
  */
object q9_q10 {
  //Todo 理由 -> Stringが(だいたい)Seq[Char]が扱われるため
  val l = List(List("hello", "world"), List("good", "morning"))
  l.flatMap(_.mkString(" ").toUpperCase)

  def splitDot(str: String): Array[String] = {
    str.split('.')
  }
}
