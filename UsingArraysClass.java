import java.util.Arrays;
public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers = {5,19,25,6,3,1,30,7,50,61};
		
		int[] a = {3,4,8,9,5};
		int[] b = {3,4,8,7,5};
		
		Arrays.sort(numbers);
		System.out.println("-----------sorting arrays-----------");
		for(int num : numbers){
			System.out.println(num);
		}
		System.out.println("---------------------");
		
		int index = Arrays.binarySearch(numbers,25);
		System.out.println("Index of element 25 is " + index);
		
		boolean check = Arrays.equals(a,b);
		System.out.println("is " + a +"=="+ b + check);
	}
}