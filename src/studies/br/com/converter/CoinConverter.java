package studies.br.com.converter;

import studies.br.com.converter.FinancialConversion;

public class CoinConverter implements FinancialConversion {
	@java.lang.Override
	public double convertDollarToReal(double dollar) {

		return dollar * 5.12;
	}

}
