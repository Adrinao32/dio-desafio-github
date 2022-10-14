package exercicios_Bradesco;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		int[] gabarito = new int[10];
		int[] resposta = new int[10];
		
		int contador = 0; 
		
		Scanner tc = new Scanner(System.in);
		
		for(int i = 0; i < gabarito.length; i++) {
			System.out.printf("Gabarito da questão %d/10: ", (i + 1));
			gabarito[i] = tc.nextInt();
		}
		
		for(int i = 0; i < resposta.length; i++) {
			System.out.printf("Resposta da questão %d/10: ", (i + 1));
			resposta[i] = tc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if(resposta[i] == gabarito[i]) {
				contador = contador + 1;
			}
			
		}
		System.out.println();
		System.out.printf("O candidato acertou %d resposta de 10", contador);
		
		
		tc.close();

	}

}
