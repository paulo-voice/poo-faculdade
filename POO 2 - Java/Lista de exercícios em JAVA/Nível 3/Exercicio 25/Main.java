package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua altura:");
		double altura = scanner.nextDouble();
		System.out.println("Digite 1 para homem e 2 para mulher:");
		int sexo = scanner.nextInt();
		if(sexo == 1) {
			double peso_Ideal=(72.7*altura)-58;
			System.out.println("Seu peso ideal é: "+peso_Ideal);
		}else if(sexo == 2) {
			double peso_Ideal=(62.1*altura)-44.7;
			System.out.println("Seu peso ideal é: "+peso_Ideal);
		}else {
			System.out.println("Entrada inválida");
		}
		scanner.close();
	}
}
