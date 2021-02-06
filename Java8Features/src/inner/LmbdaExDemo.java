package inner;

@FunctionalInterface
interface ITest
{
  // void display();
   // int findLength(String s);

int add(int x,int y);
}


public class LmbdaExDemo {

	public static void main(String[] args) {
//		ITest i=() -> {System.out.println("Display Called by Lambda Expression");};//Ctrl+1
//		i.display();
		
//		ITest i=(s)->s.length();
//		int x=i.findLength("Nitin asdfsdafassfsfdfsd");
//		System.out.println(x); 
	
        ITest i=(a,b)->a+b;
        int sum=i.add(10,20);
        System.out.println(sum);
	}
	

}
