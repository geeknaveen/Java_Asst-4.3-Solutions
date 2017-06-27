/*Write a program in java to demonstrate the use of final keyword with class, with the method, with 
the constructor, and with a variable.*/  

package asst4_3;

// A Final method cannot be overridden

//Super class methods can be overridden by subclass with its own functionality. That is, subclass uses the same method name of super class and 
//gives different output. This is called "method overriding”, a feature Java supports.

//Sometimes, the super class can impose a restriction on subclass saying that its methods (may be one or all) cannot be overridden by subclass. 
//Then, the super class simply adds "final" to its method declaration. By adding final to its method, super class prevents subclass to override. 
//That is, final methods of super class cannot be overridden by subclass. As usual, non-final methods can be overridden at the choice of the 
//subclass.

// Final keyword can be used to make method non overridable. We can't override final method.
class Test
{
  public final void display() 		// final method and CANNOT be overridden; else compilation error
  {				        // but can be called or used by subclass
    System.out.println("From super class Test display() method");
  }  
  public void show() 			// non-final method and CAN be overridden
  {				        // it is not compulsion; at the liberty of subclass it can be overridden
    System.out.println("From super class Test show() method");
  }  
}
public class FinalMethodDemo extends Test
{
  // public void display() {  }		// raises error as final display() or Test cannot be overridden
 
  public void show() 			// as show() is non-final in Test, it can be overridden
  {	
    System.out.println("From sub class Demo show() method");
  }  
  public static void main(String args[])
  {
	  FinalMethodDemo d1 = new FinalMethodDemo();
    d1.display();			// subclass can make use of super class final method by composition
    d1.show();			        // calls subclass own show() method
  }
}

