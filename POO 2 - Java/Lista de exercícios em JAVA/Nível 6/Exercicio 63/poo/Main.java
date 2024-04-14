package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num=scanner.nextInt();
		Utils.VERIFICA(num);
		
		scanner.close();
	}
}
