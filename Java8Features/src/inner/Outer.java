package inner;
//Inner Class
public class Outer {

	private int y=100;
	//inner class can access private member of outer class
	class Inner
	{
		  int x=10;
		  
	    void display()
	    {   
	    	System.out.println("Display Inner "+x +"    "+y);
	    }
		
	}
	
	public static void main(String[] args) {
//	Outer o=new Outer();
//	Outer.Inner i=o.new Inner(); 
	Outer.Inner obj=new Outer().new Inner();
	obj.display();
	}

}
