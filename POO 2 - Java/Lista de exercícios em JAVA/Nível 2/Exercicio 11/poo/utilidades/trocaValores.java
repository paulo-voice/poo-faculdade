package poo.utilidades;

public class trocaValores {
	
	public void troquei(int varA, int varB) {
		varA=varA+varB;
		varB=varA-varB;
		varA=varA-varB;
		System.out.println("Valores trocados:");
		System.out.println("a = " + varA);
		System.out.println("b = " + varB);
	}
	

}
