import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//java7 :  date is not thread safe   synchronized nhi hoti he
		Date d=new Date();
		System.out.println(d);
		
		//java8  - synchronized hoti he
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		
		LocalDateTime d2=LocalDateTime.now();
		System.out.println(d2);
	}

}
