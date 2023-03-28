package com.knoldus

import scala.util.{Failure, Success, Try}

/*The following code is used to calculate and return the nth element of the fibonacci series using tail recursion.
*                                                                                           -Ayush Pathak*/

class Fibonacci {
  def nthElementFibonacci(number: Int): Int = {
    //Exception handling is used to keep a check on number parameter,should handle the exception if negative number is passed
    val result = Try {
      if (number < 0) {
        throw new IllegalArgumentException("Input number should be positive, found negative")
      }

      //Helper method which takes 3 parameters
      @annotation.tailrec
      def nthElementFibonacciHelper(nthElement: Int, previousElement: Int, currentElement: Int): Int = {
        //Check if nth element is 0 otherwise recursively call the helper method with decreased value of nth element
        nthElement match {
          case 0 => previousElement
          case _ => nthElementFibonacciHelper(nthElement - 1, currentElement, previousElement + currentElement)
        }
      }

      nthElementFibonacciHelper(number, 0, 1)
    }
    //Calling recursive helper method with initial values 0 and 1 which are first and second element of series
    result match {
      case Success(value) => value
      case Failure(_) => -1
    }
  }
}


