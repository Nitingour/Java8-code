package inner;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
			list.add(12);list.add(1);list.add(9);list.add(5);list.add(16);
			list.add(2);list.add(120);list.add(60);
/*			
    System.out.println("Using  Stream");

	Stream st=list.stream();	
	st.forEach(i->System.out.println(i));
	
	System.out.println("\nUsing Parallel Stream");
	
	Stream st1=list.parallelStream();	
	st1.forEach(i->System.out.println(i));
	
	 System.out.println("\nUsing  Stream with Method reference :: ");

		Stream st2=list.stream();	
		st2.forEach(System.out::println);
		
		System.out.println("\nUsing  List with ForEach  ");
		list.forEach(i->System.out.println(i));
		//list.forEach(System.out::println);
		
		System.out.println("\nUsing  Spliterator ");
		Spliterator<Integer> it=list.spliterator();
		it.forEachRemaining(x->System.out.println(x));
		//it.forEachRemaining(System.out::println);
	*/	
	//get first object
		int first = list.stream().findFirst().get();
		System.out.println("First="+first);
		int any = list.stream().findAny().get();
		System.out.println("Any="+any);
	}

}
