// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String number = args[0];
		if (number.length() == 3){
			System.out.println(number.charAt(0) + " hundreds, " + number.charAt(1) + " tens, and " + number.charAt(2) + " ones."  );
		}
		if (number.length() == 2){
			System.out.println("0 hundreds, " + number.charAt(0) + " tens, and " + number.charAt(1) + " ones."  );
		}

		if (number.length() == 1){
			System.out.println("0 hundreds, 0 tens, and " + number.charAt(0) + " ones."  );
		}
	}
}
