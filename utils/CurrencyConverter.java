package cursoJavaUdemy.utils;

public class CurrencyConverter {
	
	public static final Double TAX = 6.0/100.0;
	
	public static Double total(Double quant, Double dolarValue) {
		return ((dolarValue*quant) * TAX )+(dolarValue*quant);
	}

}
