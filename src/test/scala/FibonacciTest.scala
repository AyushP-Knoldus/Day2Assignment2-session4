package com.knoldus

class FibonacciTest extends org.scalatest.funsuite.AnyFunSuite {
  val fibonacciObject = new Fibonacci

  //Test to check if the method returns correct element if positive number is passed.
  test("nthElementFibonacci method should return the nth element if positive number is passed") {
    assert(fibonacciObject.nthElementFibonacci(10) == 55)
  }

  //Test to check if the method returns default value -1 if negative number is passed.
  test("nthElementFibonacci method should return -1 if negative number is passed") {
    assert(fibonacciObject.nthElementFibonacci(-22) == -1)
  }
}
