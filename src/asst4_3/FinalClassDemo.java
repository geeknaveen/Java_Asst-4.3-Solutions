/*Write a program in java to demonstrate the use of final keyword with class, with the method, with 
the constructor, and with a variable.*/  
package asst4_3;

//A final class cannot be extended

//Sometimes, a class may not be willing to be inherited by other classes. That is, other classes cannot extend. To achieve this, 
// the class simply adds final its class declaration.

//Final keyword can be used to make class non-inheritable. We can't inherit final class.

final class Test			// observe, Test is declared as final
{				            // so, no other class can extend
  public void display() 		
  {				
    System.out.println("From super class final Test display() method");
  }  
}
public class FinalClassDemo  // extends Test	// gives compilation error if comments are removed
{
  public static void main(String args[])
  {
    Test t1 = new Test();	        // this is called composition	
    t1.display();			
  }
}