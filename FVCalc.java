// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		String rate = args[1];
		String years = args[2];

		System.out.println(currentValue);
		System.out.println(rate);
		System.out.println(years);

		double doubleCurrentValue = Integer.parseInt(currentValue);
		int intYears = Integer.parseInt(years);
		Double doubleRate = Double.parseDouble(rate);
		doubleRate = doubleRate / 100 ;
		
		double futureValue = doubleCurrentValue * Math.pow(1 + doubleRate, intYears);


		System.out.println("After " + years + " years, $" + currentValue + " saved at " + ( doubleRate * 100 ) + "% will yield $" + (int)futureValue );		

	}
}
