package exercicios_Bradesco;

import java.util.Scanner;

public class Ex13_ordem_decrescente {

	public static void main(String[] args) {
		
		
		int[] numero = new int[2];
		
		Scanner tc = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Numero: ");
			numero[i] = tc.nextInt();
		}
		
		for (int i = (numero.length -1); i >= 0; i--) {
			System.out.println("Numero: " + numero[i]);
			
		}
		

		tc.close();

	}

}
