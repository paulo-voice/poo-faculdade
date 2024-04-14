package poo;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número :");
		int a = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int b = scanner.nextInt();

		int escolha;
		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Adição ");
			System.out.println("2 - Subtração ");
			System.out.println("3 - Multiplicação ");
			System.out.println("4 - Divisão ");
			escolha = scanner.nextInt();
			if(escolha == 1) {
				System.out.println(a+b);
			}else if(escolha == 2) {
				System.out.println(a-b);
			}else if(escolha == 3) {
				System.out.println(a*b);
			}else if(escolha == 4) {
				System.out.println(a/b);
			}else {
				System.out.println("Valor inválido");
			}
		}while(escolha != 0);
		
		
		scanner.close();
	}
}
