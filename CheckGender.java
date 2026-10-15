public class CheckGender{
	public static void main(String[] args){
		scanner scan new Scanner(System.in);
		
		char choice ;
		
		System.out.print("Enter your name: ");
			String name = scan.nextline();
		do{		
			System.out.print("Are you a female?: ");
		choice = scan.next().charAt(0);
			
		}while(choice == 'Y' || choice == 'y');
		System.out.println("Sorry you are not a female",name);
	}
}