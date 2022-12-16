package lista03;

import java.util.Scanner;

public class _01_SomaEMultiplicacao {
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

		int abs = a + b;
		int acs = a + c;
		int ads = a + d;
		int bcs = b + c;
		int bds = b + d;
		int cds = c + d;

		int abm = a * b;
		int acm = a * c;
		int adm = a * d;
		int bcm = b * c;
		int bdm = b * d;
		int cdm = c * d;
		
		System.out.println(a+" + "+b+" = "+abs);
		System.out.println(a+" + "+c+" = "+acs);
		System.out.println(a+" + "+d+" = "+ads);
		System.out.println(b+" + "+c+" = "+bcs);
		System.out.println(b+" + "+d+" = "+bds);
		System.out.println(c+" + "+d+" = "+cds);
		
		System.out.println("");
		
		System.out.println(a+" * "+b+" = "+abm);
		System.out.println(a+" * "+c+" = "+acm);
		System.out.println(a+" * "+d+" = "+adm);
		System.out.println(b+" * "+c+" = "+bcm);
		System.out.println(b+" * "+d+" = "+bdm);
		System.out.println(c+" * "+d+" = "+cdm);
		
		
		
		sc.close();

	}
}
