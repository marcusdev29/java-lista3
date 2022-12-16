package lista03;

import java.util.Scanner;

public class _08_AComCeBComD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int a = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int b = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int c = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int d = sc.nextInt();

		int p = a * c;
		int s = b + d;

		System.out.println("Soma: " + s);
		System.out.println("Multiplicação: " + p);

		sc.close();

	}

}
