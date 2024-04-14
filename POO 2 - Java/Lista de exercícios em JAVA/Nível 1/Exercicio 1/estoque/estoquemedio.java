package estoque;

public class estoquemedio {
	double estoque_Medio=0;
	double qtd_Min=0, qtd_Max=0;
	
	public double estoque_Medio(double qtd_Min,double qtd_Max) {
		estoque_Medio=(qtd_Min+qtd_Max)/2;
		return estoque_Medio;
	}

}
