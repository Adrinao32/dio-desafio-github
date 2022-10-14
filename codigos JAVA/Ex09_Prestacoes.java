package exercicios_Bradesco;

import java.util.Scanner;

public class Ex09_Prestacoes {

	public static void main(String[] args) {
		
		float valor_venda, prestacoes = 0;
		
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite o valor da venda: ");
		valor_venda = tc.nextFloat();
		
		for(int i = 0; i < 5; i++) {
			prestacoes = valor_venda / 5;
			
			System.out.printf("Prestações %d/5 : %.2f \n", (i+1), prestacoes);
		}
			
		tc.close();

	}

}
