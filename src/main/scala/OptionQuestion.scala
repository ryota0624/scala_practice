/**
  * Created by ryota on 2016/11/07.
  */
object OptionQuestion {
  def show(optionStr: Option[String]): Unit = {
    optionStr.foreach(str => println(str))
  }

  def getFirstChar(optionStr: Option[String]): String = {
    optionStr.map(_.head.toString).getOrElse("")
  }

  private val dictionary = Map(1 -> "one", 2 -> "two", 3 -> "three")
  def translate(num: Option[Int]): Option[String] = {
    num.flatMap { n => dictionary.get(n) }
  }

  def notCompileError(): Unit = {
    //Todo 理由
    val m = Map(1 -> "one", 2 -> "two", 3 -> "three")
    val mOpt: Option[Map[Int, String]] = Some(m)
    mOpt.get(1)
  }
}
