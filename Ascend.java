// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Arrays;
public class Ascend {
	public static void main(String[] args) {

		int a = (int)(Math.random() * 11 ); // generates a random number in the range of 0 - 10
		int b = (int)(Math.random() * 11 + 5 ); // generates a random number in the range of 5 - 15
		int c = (int)(Math.random() * 101 + 10 );// generates a random number in the range of 10 - 110

		int[] myArray = { a , b , c };
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));



		
	}


	}
