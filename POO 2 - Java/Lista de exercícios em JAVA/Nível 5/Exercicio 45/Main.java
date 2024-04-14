package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros: ");
		int tam = scanner.nextInt();
		int[] num = new int[tam];
		
		System.out.println("Digite os numeros: ");
		for(int i = 0; i<tam; i++) {
			num[i]=scanner.nextInt();
		}
		System.out.println("Numeros inversos: ");
		for(int i = tam-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
		scanner.close();
	}
}
