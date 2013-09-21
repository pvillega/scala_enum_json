package com.perevillega.enums

import play.api.libs.json.{JsValue, Json, Writes, Reads}
import com.perevillega.enums.EnumType2.EnumType2
import com.perevillega.enums.EnumType1.EnumType1

/**
 * Enum sample #1
 */
object EnumType1 extends Enumeration {
  type EnumType1 = Value

  val N = Value("N")
  val D = Value("D")
  val A = Value("A")
  val C = Value("C")
  val L = Value("L")
  val P = Value("P")

  implicit val enumReads: Reads[EnumType1] = EnumUtils.enumReads(EnumType1)

  implicit def enumWrites: Writes[EnumType1] = EnumUtils.enumWrites

}

/**
 * Enum sample #2
 */
object EnumType2 extends Enumeration {
  type EnumType2 = Value

  val OPTION_A = Value("OPTION_A")
  val OPTION_B = Value("OPTION_B")
  val OPTION_C = Value("OPTION_C")
  val OPTION_D = Value("OPTION_D")
  val OPTION_E = Value("OPTION_E")
  val OPTION_F = Value("OPTION_F")

  implicit val enumReads: Reads[EnumType2] = EnumUtils.enumReads(EnumType2)

  implicit def enumWrites: Writes[EnumType2] = EnumUtils.enumWrites
}

/**
 * Case class that uses enums
 */
case class EnumCaseClass(name: String, enum1: EnumType1, enum2: EnumType2)

object EnumCaseClass {
  /**
   * Support object to convert EnumCaseClass to Json using Play-JSON
   * Automatically generates the Reads and Writes methods requires for the Case class
   * NOTE: Needs to be above classes that require it for the macro to work
   */
  implicit val fmt = Json.format[EnumCaseClass]

  /**
   * Constructs a EnumCaseClass from its Json version
   * @param json Json value that contains a EnumCaseClass
   * @return a EnumCaseClass object built from the json parameter
   */
  def fromJson(json: JsValue): EnumCaseClass = Json.fromJson[EnumCaseClass](json).get

  /**
   * Creates a json version of the EnumCaseClass
   * @param enumCaseClass the EnumCaseClass object to convert to json
   * @return a JsValue with the EnumCaseClass
   */
  def toJson(enumCaseClass: EnumCaseClass): JsValue = Json.toJson(enumCaseClass)
}
