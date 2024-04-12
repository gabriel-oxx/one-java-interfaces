import studies.br.com.converter.CoinConverter;

public class Main {
	public static void main(String[] args) {
		                      double dollar;
		dollar = 250;
		CoinConverter converter = new CoinConverter();
		double real = converter.convertDollarToReal(dollar);
		System.out.println(dollar + " dólares equivalem a " + real + " reais");
	}
}
