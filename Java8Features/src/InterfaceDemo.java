
interface A
{
 void showA();
default void display()
 {  test();
	 System.out.println("Display from A");
 }

   static void call() {
	   System.out.println("Static Call in A interface");
   }

   private void test()//java9
   {
	System.out.println("Private method in interface");   
   }
   
   
}
interface B
{
 void showA();
 default void display()
 {
	 System.out.println("Display from B");
 }


}


public class InterfaceDemo implements A,B{

	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.showA();
		i.display();
		A.call();
	}
	
	public void display()
	 {   A.super.display();
	     B.super.display();
		 System.out.println("Display from Class");
	 }
	

	@Override
	public void showA() {
		System.out.println("Show from Class");
	}
	

}
