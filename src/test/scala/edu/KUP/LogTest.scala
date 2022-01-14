package edu.KUP

import org.scalatest.funsuite.AnyFunSuite


class LogTest extends AnyFunSuite {

  val log = new Log
   //case 1
  test("Test Log Case 1.") {
   val temp =s"[INFO]:My name is Khan."
    assert(log.log("My name is Khan.") === temp)
  }
   //case 2
  test("Test Log Case 2.") {
    val temp =s"[INFO]:Nice to Meet You"
    assert(log.log("Nice to Meet You") === temp)
  }





}
