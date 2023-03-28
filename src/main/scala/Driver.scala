package com.knoldus
//Driver object in which new object of Fibonacci is created and nthElementFibonacci method is called
//Print statement is used to display the nth element
object Driver {
  def main(args: Array[String]): Unit = {
    val fibonacciObject = new Fibonacci
    println(fibonacciObject.nthElementFibonacci(10))
    val result=fibonacciObject.nthElementFibonacci(-10)
    if(result == -1)
      println("The inputted number is negative , expected positive number")
  }
}

