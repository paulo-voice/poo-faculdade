package poo;
import java.util.Scanner;
import utilities.poo.Decrescente;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Decrescente decr = new Decrescente();
		int a=23;
		int b=343;
		int c=53;
		System.out.println("Imprimindo em ordem decrescente:");
		decr.comparacao(a, b, c);
		scanner.close();
	}
}
