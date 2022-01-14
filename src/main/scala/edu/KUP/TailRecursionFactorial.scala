package edu.KUP

import scala.annotation.tailrec

class TailRecursionFactorial {
  def factorial(num: Int): Int = {
    @tailrec
    def fact_help(acc: Int, num: Int): Int = num match {
      case 0 => acc
      case _ => fact_help(acc * num, num - 1)
    }

    fact_help(1, num)
  }
}

