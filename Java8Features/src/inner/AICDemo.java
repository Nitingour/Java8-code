package inner;

class Test
{
   void display()
   {
	   System.out.println("Display from Test class");
   }
}


class Emp{}
public class AICDemo extends Emp 
{
	  Test t=new Test() {
		  void display()
		   {
			   System.out.println("Display from AICDemo class outside main");
		   }   
	     };
	
	public static void main(String[] args) {
//1) class create 2)inherit Test class 3) override display method 4) object creation
//5) calling display method using object		
		AICDemo a=new  AICDemo();
		   a.t.display();
		
		//AICDemo a=new AICDemo(); a.display();  //Inheritance
		// Test t=new Test(); t.display();  //Delegation
		
//		   Test t=()->System.out.println("Display from AICDemo class outside main");
//		   t.display();
		   
		   
		
	}

}
