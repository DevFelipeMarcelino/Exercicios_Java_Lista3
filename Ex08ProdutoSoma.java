package lista3;

import java.util.Scanner;

public class Ex08ProdutoSoma {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o valor de A:");
				float A = sc.nextFloat();
				
				System.out.println("Digite o valor de B:");
				float B = sc.nextFloat();
				
				System.out.println("Digite o valor de C:");
				float C = sc.nextFloat();
				
				System.out.println("Digite o valor de D:");
				float D = sc.nextFloat();
				
				float produto = A * C;
				float soma = B + D;
				
				System.out.println("O produto do primeiro com o terceiro valor é: "+produto);
				System.out.println("A soma do segundo com o quarto valor é: "+soma);
				
				sc.close();
				
	}

}
