package exercicios_Bradesco;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] numero = new int [3][3];
		
		Scanner tc = new Scanner(System.in);
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.println("Digite numeros: ");
				numero[i][j] = tc.nextInt();
			}
		}
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.println("Digite numeros: " + numero[i][j]);
				
			}
		}
		
		
		tc.close();

	}

}
