package example

object Main extends App {
  val name = "Egor"
  println(s"Hello Scala! This is $name")
  def greet(name:String, greeting:String = "Hello") = println(s"$greeting Scala! This is $name.")
  greet(name)
  val hipGs = Vector("Yo", "Sup")
  greet(name, hipGs(0))
  greet(name, hipGs(1))
  val eman = name.reverse
  greet(eman, hipGs(0))
  greet(eman, hipGs(1))
}

