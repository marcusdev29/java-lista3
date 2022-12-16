package lista03;

import java.util.Scanner;

public class _09_SalarioMensal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário atual: R$");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste: ");
		float reajuste = sc.nextFloat();

		float novoSalario = salario + salario * (reajuste / 100);

		System.out.println("Novo salário: R$" + novoSalario);

		sc.close();

	}

}
