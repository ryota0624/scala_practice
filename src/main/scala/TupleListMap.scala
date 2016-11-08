/**
  * Created by ryota on 2016/11/07.
  */
object TupleListMap {
  def listToMap(): Map[Int, String] = {
    val list = List((1, "one"), (2, "two"))
    list.foldLeft(Map[Int, String]()) { (m, tup) =>
      tup match {
        case (number, str) => m.updated(number, str)
      }
    }
  }

  def separateList(): (List[Int], List[Int]) = {
    val list = List(1, 2, 3, 4, 5)
    list.partition(_ % 2 == 0)
  }

  def listToMapWithIndex(): Map[Int, String] = {
    val list = List("zero", "one", "two")
    list.zipWithIndex.foldLeft(Map[Int, String]()) { (m, tup) =>
      tup match {
        case (str, number) => m.updated(number, str)
      }
    }
  }

  def distScore(): Seq[(String, Int)] = {
    val scores = Map(
      "ichiro" -> Map("math" -> 82, "english" -> 99),
      "jiro" -> Map("japanese" -> 100, "social" -> 88),
      "saburo" -> Map("math" -> 76, "english" -> 80),
      "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66)
    )

    scores.collect({ case (name, score) if score.isDefinedAt("math") && score.isDefinedAt("english") =>
      score.get("math").flatMap(math => score.get("english").map(english => (math + english) / 2))
        .collect( { case average if average > 80 => (name, average) })
    }).collect({ case Some(r) => r }).toList


    //    val filterEngMath: Map[String, Int] => Boolean = { (score) =>
//      score.contains("math") && score.contains("english")
//    }

//    val average: Map[String, Int] => Int = { (score) =>
//      score.foldLeft(0) { (amount, detail) => amount + detail._2 } / score.size
//    }

    //    scores.filter( { case (_, score) =>  score.contains("math") && score.contains("english") } )
    //    scores.filter(filterEngMath)
    //    scores.filter( { case (_, score) =>  score.contains("math") && score.contains("english") &&  } )
    //    scores.filter({ case(name, score) => filterEngMath(score) })
    //      .map({ case(name, score) => (name, average(score)) })

//    scores.filter({ case (name, score) => filterEngMath(score) && average(score) > 80 })

  }
}
