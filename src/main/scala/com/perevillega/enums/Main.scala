package com.perevillega.enums

/**
 * Support main object, to see output of some methods in terminal
 * User: pvillega
 */
object Main  extends App {

  // a sample case class
  val enumCaseClass = EnumCaseClass("Example", EnumType1.A, EnumType2.OPTION_A)
  Console.println(s"Sample case class with enums: $enumCaseClass")

  // to JSON
  val json = EnumCaseClass.toJson(enumCaseClass)
  Console.println(s"To JSON: $json")

  // from JSON
  val caseClass =  EnumCaseClass.fromJson(json)
  Console.println(s"From JSON: $caseClass")
}
