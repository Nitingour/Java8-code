package inner;

import java.util.ArrayList;
import java.util.stream.Stream;

class Student
{
  String fname;
  String lname;
  
public Student() {
	super();
}

public Student(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

@Override
public String toString() {
	return "Student [fname=" + fname + ", lname=" + lname + "]";
}
  
  
}

public class StreamDemo {

	public static void main(String[] args) {
	ArrayList<Student> list=new ArrayList<>();
	list.add(new Student("Ram","Kumar"));
	list.add(new Student("Amit","Sharma"));
	list.add(new Student("Rajesh","Gupta"));
	list.add(new Student("Varun","Verma"));

	
	Stream st=list.stream();
	st.forEach(s->System.out.println(s));
	
	System.out.println("\nName starts with R  ");
	//java 7
//	  for(Student s:list)
//	  {
//		   if(s.getFname().startsWith("R"))
//			   System.out.println(s);
//	  }

	     Stream st1=list.stream().filter(s->s.getFname().startsWith("R"));
	     st1.forEach(System.out::println);
	
	
	
	}

}
