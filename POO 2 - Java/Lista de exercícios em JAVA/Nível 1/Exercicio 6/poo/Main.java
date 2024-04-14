package poo;
import java.util.Scanner;
import Temp.temperatura;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		temperatura temp = new temperatura();
		System.out.print("Digite a temperatura em Celsius: ");
		double numero = scanner.nextDouble();
		System.out.println("Celsius: "+numero);
		System.out.println("Conversão para Fahrenheit: " + temp.conversao_Temp(numero) );
		scanner.close();
	}
}
