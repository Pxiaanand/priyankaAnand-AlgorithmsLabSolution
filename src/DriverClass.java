package CurrencyDenomination;

public class DriverClass {


	public static void main(String[] args) {
		
			CurrencyInput ci = new CurrencyInput();
			CurrencyCalculator cc = new CurrencyCalculator();
			int[] sorted_currencies=ci.Denomination();
			cc.calc(sorted_currencies);

	}

}
