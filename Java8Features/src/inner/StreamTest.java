package inner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(12);list.add(1);list.add(9);list.add(5);list.add(16);
		list.add(2);list.add(120);list.add(60);
/*
ArrayList<Integer> newList=(ArrayList<Integer>)list.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(newList);

	
	
ArrayList<Integer> newList1=(ArrayList<Integer>)list.stream().map(i->i+10).collect(Collectors.toList());
System.out.println(newList1);

ArrayList<Integer> newList2=(ArrayList<Integer>)list.stream().filter(i->i%2==0).map(i->i+5).sorted().collect(Collectors.toList());
System.out.println(newList2);
*/
		
		ArrayList<Integer> newList1=(ArrayList<Integer>)list.stream().sorted().collect(Collectors.toList());
		System.out.println(newList1);		
		
		ArrayList<Integer> newList2=(ArrayList<Integer>)list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(newList2);		
				
		
		
		
	
	}

}
