package lista03;

import java.util.Scanner;

public class _07_QudradoDaSoma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		float a = sc.nextFloat();
		System.out.println("Digite outro valor: ");
		float b = sc.nextFloat();
		System.out.println("Digite outro valor: ");
		float c = sc.nextFloat();

		double soma = Math.pow((a + b + c), 2);

		System.out.println("Soma dos quadrados: " + soma);

		sc.close();
	}

}
