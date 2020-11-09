object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T<: Animal](animals: List[T]){
    def +[A >: T <: Animal](newAnimal: A): Shelter[Animal] = Shelter[Animal](animals ++ List(newAnimal))
    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = Shelter[A](animals ++ shelter.animals)
    def getNames(): List[String] = for (animal <- animals) yield animal.name
  }


  trait Food[-T <: Animal] {
    val name = ""
    def feed (animal: T) = s"${animal.name} eats ${this.name}"
  }

  case object Meat extends Food[Animal] {override val name: String ="meat"}

  case object Milk extends Food[Cat] {override val name: String ="milk"}

  case object Bread extends Food[Dog] {override val name: String ="bread"}
}
