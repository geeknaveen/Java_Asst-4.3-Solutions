/*Write a program in java to demonstrate the use of final keyword with class, with the method, with 
the constructor, and with a variable.*/  

package asst4_3;

/*A final variable cannot be reassigned

Java does not support constant keyword of C/C++. In its place, in Java, final keyword is used. Once a final variable is given a value, 
it cannot be changed again. final variable value is fixed.*/

/*Final keyword can be used to make constant variables. We can't initialize final variable more than once or we can't re-initialize 
final variable.*/

class FinalVariableDemo
{
	 public static void main(String args[])
	  {
	    int x = 10;		        // non-final and CAN be changed (or reassigned)
	    System.out.println("The original value of x is :" +x);	// prints 10
	    x = 20;			// reassigned
	    System.out.println("The reassigned value of x is :"+x);	// prints 20
	 
	    final int y = 100;		// final and CANNOT be changed
	    System.out.println("The original value of y is :" +y);	// prints 100
	    //y = 200;		        // Gives compilation error as y cannot be reassigned
	    //System.out.println("The reassigned value of y is :" +y);
	  }
	}