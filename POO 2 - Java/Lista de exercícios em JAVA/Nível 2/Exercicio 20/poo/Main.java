package poo;
import java.util.Scanner;
import utilities.poo.Validacao;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		Validacao validacao = new Validacao();
		
		System.out.println("Digite o primeiro número: ");
		int a = scanner.nextInt();
		if(a <= 0) {
			System.out.println("Valores menores ou iguais a zero são inválidos!");
			a = scanner.nextInt();
		}
		
		System.out.println("Digite o segundo número: ");
		int b = scanner.nextInt();
		if(b <= 0) {
			System.out.println("Valores menores ou iguais a zero são inválidos!");
			b = scanner.nextInt();
		}
		
		System.out.println("Digite o terceiro número: ");
		int c = scanner.nextInt();
		if(c <= 0) {
			System.out.println("Valores menores ou iguais a zero são inválidos!");
			c = scanner.nextInt();
		}
		
		System.out.println("Valores lidos: \n"+ a + ", " + b + ", " + c);
		System.out.println("Multiplicação do menor com o maior: "+validacao.calculando_Multi(a, b, c));
		System.out.println("Maior dividido pelo menor: "+validacao.calculando_Div(a, b, c));
		
		/*int[] valores = validacao.lerValores(a, b, c);
		if(valores!=null) {
			System.out.println("Valores lidos: ");
			for(int i = 0; i < valores.length; i++) {
				System.out.println(valores[i]);
			}
		}*/
		
		scanner.close();
	}
}
