package utilities.poo;

public class Validacao {

	/*public int[] lerValores(int a, int b, int c) {
		int [] valores = {a, b, c};
		if(a==0 || b==0 || c==0) {
			System.out.println("Valores menores ou iguais a zero são inválidos!");
			return null;
		}else {
			return valores;
		}
	}*/
	
	public int calculando_Multi(int a, int b, int c) {
		int menorValor = Math.min(Math.min(a, b), c);
        int maiorValor = Math.max(Math.max(a, b), c);
        int produto = menorValor * maiorValor;
        return produto;
	}
	
	public double calculando_Div(int a, int b, int c) {
		int menorValor = Math.min(Math.min(a, b), c);
        int maiorValor = Math.max(Math.max(a, b), c);
		double divisao = (double)maiorValor / menorValor;
		return divisao;
	}
}
		