package inner;
//Method inner class
public class Outer3 {

	private int x=10;
	void display()
	{
		  int y=100;
		System.out.println("display");
		  class Inner3
		   {
			  private int z=1000;
			     void show()
			     {
			    	 System.out.println("Show from Inner3"+x+"  "+y+"  "+z);
			    	 
			     }
		   }
		 Inner3 i=new Inner3();
		 i.show();
		 
	}
	
	public static void main(String[] args) {
	
		Outer3 o=new Outer3();
		o.display();
		
	}

}
