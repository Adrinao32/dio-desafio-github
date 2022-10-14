package exercicios_Bradesco;

import java.util.Scanner;

public class Ex10_Preco_custo {

	public static void main(String[] args) {
		
		float custo_produto, valor_venda, percentual_custo; 
				
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Valor de custo do produto: ");
		custo_produto = tc.nextFloat();
		
		System.out.println("Percentual de custo: ");
		percentual_custo = tc.nextFloat();
		
		
		valor_venda = custo_produto + (custo_produto * percentual_custo);
		
		
		System.out.println("Valor da venda: " + valor_venda);
		
		
		tc.close();

	}

}
