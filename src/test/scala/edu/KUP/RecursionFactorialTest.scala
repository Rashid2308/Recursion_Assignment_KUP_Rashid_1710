package edu.KUP
import org.scalatest.funsuite.AnyFunSuite
class RecursionFactorialTest extends AnyFunSuite {
  val obj = new RecursionFactorial
  //case 1
  test("RecursionFactorialTest Case 1."){
    val temp:Int=24
    assert(obj.factorial(4)== temp)

  }
  //case 2
  test("RecursionFactorialTest Case 2."){
    val temp:Int=120
    assert(obj.factorial(5)== temp)

  }


}
