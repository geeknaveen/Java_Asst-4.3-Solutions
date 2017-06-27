/*Write a program in java to demonstrate the use of final keyword with class, with the method, with 
the constructor, and with a variable.*/  
package asst4_3;

/*When a class is inherited, the subclass inherits the methods and variables of super class but not constructors. For this reason, 
constructors are not members of class; only variables and methods are members of a class. As members are inherited, they are permitted by
subclass to override with its own functionality.

When constructors are not inherited, no meaning of overriding the constructors. In Java, final is used by super class not to inherit its 
members by subclass. When constructor is not inherited (and subclass cannot override), then why a constructor should be declared final. 
Already, internally a constructor property is final. 
If final, compiler raises error.

Finally to say, a constructor cannot be final as it is never inherited.*/

/*public final class FinalDemoConstructor	// observe, final class
{
   public final FinalDemoConstructor() {  }  // observe, final constructor
}*/

public class FinalDemoConstructor
{
  final FinalDemoConstructor()   {    
	  
  }		   // Final constructor; constructor can have any access specifier
}