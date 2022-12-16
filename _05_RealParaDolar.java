package lista03;

import java.util.Scanner;

public class _05_RealParaDolar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: R$");
		float real = sc.nextFloat();
		System.out.println("Digite a cotação atual: ");
		float cotacao = sc.nextFloat();
		
		float dolar = real / cotacao;
		
		System.out.println("Valor em dolar: $" + dolar);
		
		sc.close();

	}

}
