/**
  * Created by ryota on 2016/11/07.
  */
object TupleListMap {
  def listToMap() {
    val list = List((1, "one"), (2, "two"))
    list.foldLeft(Map[Int, String]()){ (m, tup) => tup match {
      case (number, str) => m.updated(number, str)
      }
    }
  }

  def separateList(): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val sliceL = list.partition(_ % 2 == 0) match {
      case (evens, odds) => {
        println(evens)
        println(odds)
      }
    }
  }

  def listToMapWithIndex(): Unit = {
    val list = List("zero", "one", "two")
    list.zipWithIndex.foldLeft(Map[Int, String]()) { (m, tup) => tup match {
      case (str, number) => m.updated(number, str)
      }
    }
  }

  def distScore(): Unit ={
    val scores = Map(
      "ichiro" -> Map("math" -> 82, "english" -> 99),
      "jiro" -> Map("japanese" -> 100, "social" -> 88),
      "saburo" -> Map("math" -> 76, "english" -> 80),
      "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66)
    )

    val filterEngMath: Map[String, Int] => Boolean = { (score) =>
      score.contains("math") && score.contains("english")
    }

    val average: Map[String, Int] => Int = { (score) =>
//      score.toList.forall{ case (_, num) => num > 80 }
      score.foldLeft(0) { (amount, detail) => amount + detail._2} / score.size
    }

//    scores.filter( { case (_, score) =>  score.contains("math") && score.contains("english") } )
//    scores.filter(filterEngMath)
//    scores.filter( { case (_, score) =>  score.contains("math") && score.contains("english") &&  } )
//    scores.filter({ case(name, score) => filterEngMath(score) })
//      .map({ case(name, score) => (name, average(score)) })

    scores.filter({ case(name, score) => filterEngMath(score) && average(score) > 80})
      .foreach({ case(name, score) => println(name, average(score))})

  }
}
