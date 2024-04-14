package poo;
import java.util.Scanner;
import estoque.estoquemedio;

public class Main {
	
	public static void main (String[] args) {
		estoquemedio estq = new estoquemedio();
		System.out.println(estq.estoque_Medio(10, 30));
		
	}
}
