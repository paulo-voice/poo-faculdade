package dolar;

public class CDolar {
	double cotacao_Atual=5.12;
	double valor=0;
	double valor_Real=0;
	
	public double conversao(double valor) {
		double cotacao_Atual=5.12;
		valor_Real=cotacao_Atual*valor;
		return valor_Real;
	}
}
