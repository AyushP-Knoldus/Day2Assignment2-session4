# Day2Assignment2-session4
## Problem Statement
Create a class with a annotated method fibonacci that takes an integer n as a parameter and returns the nth Fibonacci number.  

Annotate the fibonacci method with the @tailrec annotation to indicate that the method uses tail recursion.  

Call the fibonacci method inside the Main Object, passing in a positive integer n.  

Print the result returned by the fibonacci method.  

Input:  10  
Output: 55  

## Code
class Fibonacci {  
  def nthElementFibonacci(number: Int): Int = {  
    val result = Try {  
      if (number < 0) {  
        throw new IllegalArgumentException("Input number should be positive, found negative")  
      }  
      @annotation.tailrec  
      def nthElementFibonacciHelper(nthElement: Int, previousElement: Int, currentElement: Int): Int = {  
        nthElement match {  
          case 0 => previousElement  
          case _ => nthElementFibonacciHelper(nthElement - 1, currentElement, previousElement + currentElement)  
        }  
      }  
      nthElementFibonacciHelper(number, 0, 1)  
    }  
    result match {  
      case Success(value) => value  
      case Failure(_) => -1  
    }  
  }  
}  


