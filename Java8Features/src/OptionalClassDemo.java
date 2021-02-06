import java.util.Optional;

//optional class is used to check null value , prevent from NullPointer exception
public class OptionalClassDemo {

	void convertUpperCase(String s)
	{
//		Optional<String> noNull=Optional.ofNullable(s);
//		if(noNull.isPresent())
//		{
//			System.out.println(s.toUpperCase());	
//		}	
//		else {
//			System.out.println("Null value is there");
//		}
		 
		if(s==null)
			System.out.println("Null value is there");
		else
			System.out.println(s.toUpperCase());
	}
	
	
	public static void main(String[] args) {
			
		OptionalClassDemo o=new OptionalClassDemo();
		String s=null;
		o.convertUpperCase(s);

	}

}
