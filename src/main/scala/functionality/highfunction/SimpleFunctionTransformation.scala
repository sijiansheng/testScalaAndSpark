package functionality.highfunction

/**
  * Created by sijiansheng on 2016/12/20.
  */
case class Person(age: Int, height: Double)

object SimpleFunctionTransformation {

  type ageFilter = Person => Boolean

  def judgePersonByAge(person: Person, judgeGist: ageFilter): (Person, String) = {

    if (judgeGist(person)) {
      (person, "符合条件")
    } else {
      (person, "不符合条件")
    }

  }

  val conformsWithGists: List[Person] => ageFilter =
    gs =>
      person => gs.contains(person)
  val notConformsWithGists: List[Person] => ageFilter =
    gs =>
      person => !gs.contains(person)

  def main(args: Array[String]) {

    def judge(person: Person): Boolean = {
      person.age > 20
    }

    val result1 = judgePersonByAge(new Person(11, 12.0), judge)
    println(result1._2)

    val result2 = judgePersonByAge(new Person(11, 12.0), conformsWithGists(List(new Person(11, 12.0))))
    println(result2._2)
  }
}
