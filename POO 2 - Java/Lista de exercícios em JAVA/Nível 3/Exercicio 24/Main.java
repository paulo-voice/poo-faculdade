package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro:");
		int a = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		int b = scanner.nextInt();
		
		int escolha;
		
		do{
			System.out.println("Digite:");
			System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro");
			System.out.println("2 - Verificar se os dois números lidos são pares");
			System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
			System.out.println("4 - Sair");
			escolha = scanner.nextInt();
			if(escolha == 1) {
				if(a%b==0 || b%a==0) {
					System.out.println("Os números são múltiplos");
				}else {
					System.out.println("Os números não são múltiplos");
				}
			}else if(escolha == 2) {
				if(a%2==0 && b%2==0) {
					System.out.println("Os números são pares");
				}else {
					System.out.println("Pelo menos um dos numeros não é par");
				}
			}else if(escolha == 3) {
				double media = (a+b)/2;
				if(media >= 7) {
					System.out.println("A média é maior ou igual a 7");
				}else {
					System.out.println("A média é menor que 7");
				}
			}
		}while(escolha != 4);
		
		scanner.close();
	}
}
