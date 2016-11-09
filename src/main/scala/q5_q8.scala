/**
  * Created by ryota on 2016/11/07.
  */
object q5_q8 {
  //Q5
  def listToMap(): Map[Int, String] = {
    val list = List((1, "one"), (2, "two"))
    list.foldLeft(Map[Int, String]()) { case (map, (number, str)) =>
      map.updated(number, str)
    }
  }

  //Q6
  def separateList(): (List[Int], List[Int]) = {
    val list = List(1, 2, 3, 4, 5)
    list.partition(_ % 2 == 0)
  }

  //Q7
  def listToMapWithIndex(): Map[Int, String] = {
    val list = List("zero", "one", "two")
    list.zipWithIndex.foldLeft(Map[Int, String]()) { case (map, (str, number)) =>
        map.updated(number, str)
    }
  }

  //Q8
  def distScore(): Seq[(String, Int)] = {
    val scores = Map(
      "ichiro" -> Map("math" -> 82, "english" -> 99),
      "jiro" -> Map("japanese" -> 100, "social" -> 88),
      "saburo" -> Map("math" -> 76, "english" -> 80),
      "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66)
    )

    scores.collect({ case (name, score) if score.isDefinedAt("math") && score.isDefinedAt("english") =>
      score.get("math")
        .flatMap(math => score.get("english").map(english => (math + english) / 2))
        .collect( { case average if average > 80 => (name, average) })
    }).flatten.toSeq
  }
}
