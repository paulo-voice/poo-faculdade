package poo;
import java.util.Scanner;
import poo.utilidades.trocaValores;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		trocaValores troca = new trocaValores();
		
		int a = 10;
		int b = 25;
		
		System.out.println("Valores antes da troca:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		troca.troquei(a, b);
		scanner.close();
	}
}
