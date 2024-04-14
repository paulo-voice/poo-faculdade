package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		int contando=101;
		System.out.println("100 até 0 em decrescente:\n");
		for(int i = 100; i>=0; i--) {
			contando--;
			System.out.println(contando);
		}
	}
}
