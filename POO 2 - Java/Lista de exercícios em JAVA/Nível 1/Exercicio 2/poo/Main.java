package poo;
import java.util.Scanner;
import dolar.CDolar;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		CDolar doleta = new CDolar();
		System.out.print("Digite o valor em dolar pra converter pra real: ");
		double numero = scanner.nextDouble();
		System.out.println("Você digitou " +numero);
		System.out.println("O valor em dolar é: " + doleta.conversao(numero));
		scanner.close();
	}
}
