/**
  * Created by ryota on 2016/11/07.
  */
object q1_q4 {
  //Q1
  def show(optionStr: Option[String]): Unit = {
    optionStr.foreach(println)
  }
  //Q2
  def getFirstChar(optionStr: Option[String]): String = {
    optionStr.flatMap(_.headOption.map(_.toString)).getOrElse("")
  }

  //Q3
  private val dictionary = Map(1 -> "one", 2 -> "two", 3 -> "three")
  def translate(num: Option[Int]): Option[String] = {
    num collect dictionary
  }

  //Q4
  def notCompileError(): Unit = {
    //Todo 理由 optionのgetには ラップされた値がかえるメソッド-> この時getの宣言が() のついてないメソッドなので Option[Map] でget(hoge) を呼ぶと Mapの方のgetが呼ばれるため
    val m = Map(1 -> "one", 2 -> "two", 3 -> "three")
    val mOpt: Option[Map[Int, String]] = Some(m)
    mOpt.get(1)

  }
}
