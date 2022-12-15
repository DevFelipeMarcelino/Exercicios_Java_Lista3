package lista3;

import java.util.Scanner;

public class Ex02VolumeCaixa {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa retângular:");
		int comprimento = sc.nextInt();
		
		System.out.println("Digite também a largura:");
		int largura = sc.nextInt();
		
		System.out.println("Digite também a altura:");
		int altura = sc.nextInt();
		
		int volume = largura * comprimento * altura;
		
		System.out.println("O volume da caixa é igual a: "+volume);
		
		sc.close();
		
	}

}
