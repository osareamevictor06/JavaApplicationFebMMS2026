import java.util.Random;
// Write a java program to generate an 8 digit student id containing(STU + 5digit)

public class IdGenerator{
	public static void main(String[] args){
	
	Random random = new Random();
	
	int number = 10000 + random.nextInt(90000);
	
	String studentID = "STU" + number;
	
	System.out.println("StudentID: " + studentID);
	}
}