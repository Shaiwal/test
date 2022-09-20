package test;

import java.util.Currency;
import java.util.Locale;


public class CurrencyTest {
	
	public static void main(String args[]) {
		
		 Locale l = new Locale("", "DE");
		 Currency c = Currency.getInstance(l);
		 System.out.println(c.getCurrencyCode());
		 System.out.println(c.getSymbol());
		 System.out.println("bechtle (de)".split("\\(")[0]);
		 System.out.println(105%50 > 40);
		 
		 int index = 100 & 15;
		 System.out.println(index);
		
	}

}
