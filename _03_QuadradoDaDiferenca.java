package lista03;

import java.util.Scanner;

public class _03_QuadradoDaDiferenca {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();

		double resultado = Math.pow((valor1 - valor2), 2);

		System.out.println("Resultado: " + resultado);

		sc.close();
	}
}
