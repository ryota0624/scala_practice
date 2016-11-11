/**
  * Created by ryota on 2016/11/07.
  */
object q5_q8 {
  //Q5
  def listToMap(): Map[Int, String] = {
    val list = List((1, "one"), (2, "two"))
    list.toMap[Int, String]
  }

  //Q6
  def separateList(): (List[Int], List[Int]) = {
    val list = List(1, 2, 3, 4, 5)
    val (evens: List[Int], odds: List[Int]) = list.partition(_ % 2 == 0)
    (evens, odds)
  }

  //Q7
  def listToMapWithIndex(): Map[Int, String] = {
    val list = List("zero", "one", "two")
    list.zipWithIndex.map(_.swap).toMap[Int, String]
  }

  //Q8
  def distScore(): Seq[(String, Int)] = {
    val scores = Map(
      "ichiro" -> Map("math" -> 82, "english" -> 99),
      "jiro" -> Map("japanese" -> 100, "social" -> 88),
      "saburo" -> Map("math" -> 76, "english" -> 80),
      "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66)
    )

    (for {
      (name, score) <- scores
      math <- score.get("math")
      english <- score.get("english")
      average = (math + english) / 2 if average > 80
    } yield {
      (name, average)
    }).toSeq
  }
}
