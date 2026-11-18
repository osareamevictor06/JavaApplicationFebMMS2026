import java.time.LocalDate;

public class UsingLocalDate{
	public static void main(String[] args){
		LocalDate currentDate = LocalDate.now();
		
		System.out.printf("Today's Date is %s%n",currentDate);
	}
}