// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String number = args[0];

		int intNum = Integer.parseInt(number);
		int hundreds = intNum / 100 ;
		int tens = (intNum / 10) % 10;
		int ones = intNum % 10;
		
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


	}
}
