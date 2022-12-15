package lista3;

import java.util.Scanner;

public class Ex01OperacoesAritmeticas {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = sc.nextInt();
		
		System.out.println("Digite o valor de D:");
		int d = sc.nextInt();
		
		int SomaAB = a+b;
		int MultiplicacaoAB = a*b;
		
		int SomaAC = a+c;
		int MultiplicacaoAC = a*c;
		
		int SomaAD = a+d;
		int MultiplicacaoAD = a*d;
		
		int SomaBC = c+b;
		int MultiplicacaoBC = c*b;
		
		int SomaBD = d+b;
		int MultiplicacaoBD = d*b;
		
		int SomaCD = d+c;
		int MultiplicacaoCD = d*c;
		
		
		System.out.println("A soma e a multiplicão dos valores A e B são respectivamente: "+SomaAB+" e "+MultiplicacaoAB);
		System.out.println("A soma e a multiplicão dos valores A e C são respectivamente: "+SomaAC+" e "+MultiplicacaoAC);
		System.out.println("A soma e a multiplicão dos valores A e D são respectivamente: "+SomaAD+" e "+MultiplicacaoAD);
		System.out.println("A soma e a multiplicão dos valores B e C são respectivamente: "+SomaBC+" e "+MultiplicacaoBC);
		System.out.println("A soma e a multiplicão dos valores B e D são respectivamente: "+SomaBD+" e "+MultiplicacaoBD);
		System.out.println("A soma e a multiplicão dos valores C e D são respectivamente: "+SomaCD+" e "+MultiplicacaoCD);
		
		sc.close();
	}

}
