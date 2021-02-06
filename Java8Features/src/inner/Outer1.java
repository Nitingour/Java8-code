package inner;

import inner.Outer.Inner;

//Nested Class
public class Outer1 {

	static int x=10;

	static class Inner1
	{
		  
	    void display()
	    {   
	    	System.out.println("Display Inner ");
	    }
		
	}
	
	public static void main(String[] args) {
	//	Outer.Inner obj=new Outer().new Inner();
		
		Outer1.Inner1 obj=new Outer1.Inner1();
		obj.display();

		//		     System.out.println(x);
//		     System.out.println(new Outer1().x);
//		     System.out.println(Outer1.x);
	}

}