```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) {
      _age = newAge
    } else {
      throw new IllegalArgumentException("Age cannot be negative")
    }
  }
}

object Main extends App{
  val myObject = new MyClass("John")

  //Explicitly set age and prevent implicit conversions
  myObject.age = 30
  println(myObject.age) // prints 30
  myObject.age = -5 // throws IllegalArgumentException
}
```