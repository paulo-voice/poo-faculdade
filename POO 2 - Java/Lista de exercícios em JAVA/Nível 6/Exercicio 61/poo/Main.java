package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Digite seu salário: ");
			double salario=scanner.nextDouble();
			System.out.println("Digite o indice de reajuste (%): ");
			double indice=scanner.nextDouble();
			
			double salarioAtt=Utils.REAJUSTE(salario, indice);
			System.out.println("Salário atualizado: R$ "+salarioAtt);
		
		scanner.close();
	}
}
