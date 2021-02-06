//Garbage collection

//final , finally, finalize 
public class Demo {

	public static void main(String[] args) {
		
		Demo d1=new Demo();//1
		Demo d2=new Demo();//2
		Demo d3=new Demo();//3
		Demo d4=new Demo();//4
		Demo d5=new Demo();//5
		
		d1=d2;    // 1 lost
		d2=d3;   //2 lost
		d3=d4;  //3 lost
		d5=d1;  // 5 lost gain d2
		d1=null;     
		d2=null;
		d3=null;
		System.gc();
	
	//at line number 14 how many objects are ready for garbage collection
		
	}
    public void finalize()
    {
    	System.out.println("object is garbage collected...");
    }
	
    	
}
