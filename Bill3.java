// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String strTotalSum = args[3];

		double doubleTotalSum = Double.parseDouble(strTotalSum);
		double personalAmount = Math.ceil(doubleTotalSum / 3);
		System.out.println("Dear "+ name1 + ", " + name2 + ", and " + name3 + ": pay " + personalAmount + " Shekels each.");

	    // Replace this comment with the rest of your code   
	}
}
