package edu.KUP

class RecursionFactorial {
  def factorial(num: Int): Int ={
    if (num<=1) 1
    else num * factorial(num - 1)
  }
}


