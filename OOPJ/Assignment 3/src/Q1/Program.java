package Q1;
import java.util.Arrays;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] arr = new int [sc.nextInt()];
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array element at "+i);
			arr [i]= sc.nextInt();
			sum += arr[i];	
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The sum of all the elements in the array is 	: "+sum);
		System.out.println("The average of all the elements in the array is : "+sum/arr.length);
		Arrays.sort(arr);
		System.out.println("The largest element in the array is 		: "+arr[arr.length-1]);
		System.out.println("The smallest element in the array is		: "+arr[0]);
		System.out.println("The sorted array in ascending order 		: "+Arrays.toString(arr));
		

	}

}
