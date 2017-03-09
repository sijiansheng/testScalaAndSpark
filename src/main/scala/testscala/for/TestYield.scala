package testscala

/**
  * Created by sijiansheng on 2016/10/26.
  */
object TestYield extends App {

  //  def gameResults(): Seq[(String, Int)] =
  //    ("Daniel", 3500) :: ("Melissa", 13000) :: ("John", 7000) :: Nil
  //  def hallOfFame = for {
  //    result <- gameResults()
  //    (name, score) = result
  //    if score > 5000
  //  } yield name
  //
  //  hallOfFame.foreach(println)

  val reuslts = List(("1", 2), ("2", 3), ("3", 4))

  val newResult = for {
    result <- reuslts
    if result._2 > 2
  } yield
    result._1

  newResult.foreach(println)
}


