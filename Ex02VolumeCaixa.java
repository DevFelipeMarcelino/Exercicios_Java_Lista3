package lista3;

import java.util.Scanner;

public class Ex02VolumeCaixa {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o comprimento da caixa ret�ngular:");
		int comprimento = sc.nextInt();
		
		System.out.println("Digite tamb�m a largura:");
		int largura = sc.nextInt();
		
		System.out.println("Digite tamb�m a altura:");
		int altura = sc.nextInt();
		
		int volume = largura * comprimento * altura;
		
		System.out.println("O volume da caixa � igual a: "+volume);
		
		sc.close();
		
	}

}
