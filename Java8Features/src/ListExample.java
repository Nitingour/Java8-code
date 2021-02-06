import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {

	public static void main(String[] args) {
		
		String names[]= {"ramesh","ram","", "suresh","raj","ved","", "rajesh"};
		
//1 count empty string 
//2 count names of 3 letter 
//3 print all names		
//		ArrayList<String> ar=new ArrayList<>();		
//		for(int i=0;i<names.length;i++)
//			ar.add(names[i]);
		
	ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
//	System.out.println(list);
//	//java7 using iterators	  
//	Iterator<String>it=list.iterator();
//		  while(it.hasNext()){
//			  System.out.println(it.next());
//		  }
		//java8 using Stream API  is used to process objects from collection framework
		  //class its uses less memory as compare to iterators
/*		 Stream  st=list.stream();
		 st.forEach(x->System.out.println(x));//using lambda expression
		 
		 //java5 enhanced for loop
		 int count=0;
		for(String name:list)
		{
			 if(name.isEmpty())   //(name=="")
				 count++;
		}
		System.out.println("Total Empty String is="+count);
	*/
	
	  long count = list.stream().filter(s->s.isEmpty()).count();
		System.out.println("Empty String="+count);
	
			long count3 = list.stream().filter(s->s.length()==3).count();
			System.out.println("3 letter String is="+count3);
		
  List<String> newList = list.stream().filter(s->s.length()==3).collect(Collectors.toList());
			System.out.println("3 letter String is="+newList);
	
	
		 
		 
		 
    
    
		
		
		

	}

}
