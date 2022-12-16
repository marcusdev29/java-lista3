package lista03;

import java.util.Scanner;

public class _02_VolumeDaCaixaRetangular {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa: ");
		float comprimento = sc.nextFloat();
		System.out.println("Digite a largura da caixa: ");
		float largura = sc.nextFloat();
		System.out.println("Digite a altura da caixa: ");
		float altura = sc.nextFloat();
		
		float volume = comprimento * altura * largura;
		
		System.out.println("Volume da caixa: "+volume);
		
		
		sc.close();
	}
}
