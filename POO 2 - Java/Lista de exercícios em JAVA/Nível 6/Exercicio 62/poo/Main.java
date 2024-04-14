package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		double base = scanner.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double altura = scanner.nextDouble();
		System.out.println("O valor da hipotenusa é: "+Utils.HIPOTENUSA(base, altura));
		scanner.close();
	}
}
