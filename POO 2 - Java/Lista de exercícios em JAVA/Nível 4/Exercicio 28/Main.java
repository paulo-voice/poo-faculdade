package poo;
import java.util.Scanner;
import utilities.Utils;

public class Main {
	
	public static void main (String[] args) {
		System.out.println("Imprimindo só os ímpares de 100 a 200:\n");
		for(int i = 100; i<=200;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
