package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Randomizando um número...");
		double gerandoNum=Math.random();
		int num_Random = (int) (gerandoNum*100);
		System.out.println("Número de 1 a 100 gerado, agora tente adivinhar: ");
		int tentativa=0;
		int escolha=0;
		do {
			escolha = scanner.nextInt();
			if(escolha == num_Random) {
				System.out.println("Você acertou!!!");
				System.out.println("Número de tentativas: "+tentativa);
			}else if(escolha < num_Random) {
				System.out.println("Você errou! O número é maior!");
				tentativa++;
			}else if(escolha > num_Random) {
				System.out.println("Você errou! O número é menor!");
				tentativa++;
			}
		}while(escolha!=num_Random);
		scanner.close();
	}
}
