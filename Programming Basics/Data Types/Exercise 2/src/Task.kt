// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:

  val sumNum = int + double
  val sumStringChar = string + character

  println("The type that can be combined " +
    "with every other type using '+':")
 // println("The addition of int a doubles " + sumNum + "\n" + "String and characters" + sumStringChar + "\n" )
  println("String")

  // Can't be combined:

//  println("The type that can be combined " +
//          "with every other type using '+':")
//  println("boolean" + "\n" + "sumStringChar" + "\n" )

}