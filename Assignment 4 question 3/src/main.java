import java.text.NumberFormat;
import java.util.Locale;

public class main {

	/*
	 * 3. Answer the following questions:
	 * a. Write the code to format number 12345.678 in the United Kingdom locale. Keep two digits after the decimal point.
	 * b. Write the code to format number 12345.678 in U.S. currency.
	 * c. Write the code to parse '12,345.678' into a number.
	 */
	
	public static void main(String[] args) {
		
		// a
		NumberFormat aNumberFormat = NumberFormat.getInstance(Locale.UK);
		aNumberFormat.setMaximumFractionDigits(2);
		System.out.println("A : " + aNumberFormat.format(12345.678));
		
		// b
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("B : " + currencyFormat.format(12345.678));
		
		// c
		NumberFormat cNumberFormat = NumberFormat.getInstance(Locale.US);
			try {
			  Number number = cNumberFormat.parse("12,345.678");
			  System.out.println("C : " + number.doubleValue());
			}
			catch (java.text.ParseException ex) {
			  System.out.println("C : " + "Parse failed");      
			}
	}
	
}
