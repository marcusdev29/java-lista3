package lista03;

import java.util.Scanner;

public class _04_DolarParaReal {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em dolar: ");
		float dolar = sc.nextFloat();
		System.out.println("Digite a cotação atual: ");
		float cotacao = sc.nextFloat();

		float real = dolar * cotacao;

		System.out.println("Conversão: R$" + real);

		sc.close();
	}
}
