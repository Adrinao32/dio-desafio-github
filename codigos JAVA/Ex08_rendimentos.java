package exercicios_Bradesco;

import java.util.Scanner;

public class Ex08_rendimentos {

	public static void main(String[] args) {
		
		float valor, rendimento_mensal = (float)0.05, rendimento_mes, valor_atual;
		
		Scanner tc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		valor = tc.nextFloat();
		
		rendimento_mes = valor * rendimento_mensal;
		
		valor_atual = valor + rendimento_mes;
		
		System.out.println("O valor apos um mes de rendimento é: " + valor_atual);
		
		tc.close();
		

	}

}
