package lista03;

import java.util.Scanner;

public class _10_EleicaoSindical {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do candidato A: ");
		String a = sc.nextLine();

		System.out.println("Digite o nome do candidato B: ");
		String b = sc.nextLine();

		System.out.println("Digite o nome do candidato C: ");
		String c = sc.nextLine();

		System.out.println("");

		System.out.println("Digite o total de eleitores: ");
		int eleitores = sc.nextInt();

		System.out.println("Digite a quantidade de votos nulos: ");
		int nulos = sc.nextInt();

		System.out.println("Digite a quantidade de votos em branco: ");
		int branco = sc.nextInt();

		System.out.println("");

		System.out.println("Digite a quantidade de votos válidos para " + a + ":");
		int validosA = sc.nextInt();

		System.out.println("Digite a quantidade de votos válidos para " + b + ":");
		int validosB = sc.nextInt();

		System.out.println("Digite a quantidade de votos válidos para " + c + ":");
		int validosC = sc.nextInt();

		float prtgA = validosA * 100 / eleitores;
		float prtgB = validosB * 100 / eleitores;
		float prtgC = validosC * 100 / eleitores;

		float prtgNulos = nulos * 100 / eleitores;
		float prtgBranco = branco * 100 / eleitores;
		
		System.out.println("");
		
		System.out.println("Total de eleitores: " + eleitores);
		
		System.out.println("");
		
		System.out.println("Percentual de votos em " + a +": " + prtgA + "%, com: " + validosA + " Votos.");
		
		System.out.println("Percentual de votos em " + b +": " + prtgB + "%, com: " + validosB + " Votos.");
		
		System.out.println("Percentual de votos em " + c +": " + prtgC + "%, com: " + validosC + " Votos.");
		
		System.out.println("");
		
		System.out.println("Percentual de votos em branco: " + prtgNulos +"%.");
		
		System.out.println("Percentual de votos nulos: " + prtgBranco +"%.");
		
		
		sc.close();

	}

}
