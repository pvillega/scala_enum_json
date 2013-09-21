package com.perevillega.enums

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.PrivateMethodTester
import play.api.libs.json.Json

/**
 * Tests for EnumCaseClass
 * User: pvillega
 */
class EnumCaseClassTest extends FunSpec with ShouldMatchers with PrivateMethodTester {

  import EnumType1._
  import EnumType2._

  describe("A EnumCaseClass object") {

    it("should load a EnumCaseClass from JSON") {
      val json = """{"name":"Example","enum1":"A","enum2":"OPTION_A"}"""
      val enumCaseClass = EnumCaseClass.fromJson(Json.parse(json))


      enumCaseClass.name should be("Example")
      enumCaseClass.enum1 should be(A)
      enumCaseClass.enum2 should be(OPTION_A)
    }

    it("should convert a EnumCaseClass to JSON") {
      val enumCaseClass = EnumCaseClass("Example", EnumType1.A, EnumType2.OPTION_A)
      val json = EnumCaseClass.toJson(enumCaseClass)

      (json \ "name").as[String] should be("Example")
      (json \ "enum1").as[String] should be("A")
      (json \ "enum2").as[String] should be("OPTION_A")
    }

  }

  describe("A EnumCaseClass class") {

    // Empty

  }

}

