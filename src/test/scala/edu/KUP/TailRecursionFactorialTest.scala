package edu.KUP
import org.scalatest.funsuite.AnyFunSuite
class TailRecursionFactorialTest extends AnyFunSuite {
  val obj = new TailRecursionFactorial
  //case 1
  test(" Test TailRecursionFactorialTest Case 1."){
    val temp:Int=24
    assert(obj.factorial(4)===temp)
  }
  //case 2
  test(" Test TailRecursionFactorialTest Case 2."){
    val temp:Int=479001600

    assert(obj.factorial(12)===temp)
  }

}
