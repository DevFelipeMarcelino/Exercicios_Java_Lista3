package lista3;

import java.util.Scanner;

public class Ex06SomaQuadrado3Valores {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o valor de A:");
				float A = sc.nextFloat();
				
				System.out.println("Digite o valor de B:");
				float B = sc.nextFloat();
				
				System.out.println("Digite o valor de C:");
				float C = sc.nextFloat();
				
				float SomaQuadrado = (B*B) + (A*A) + (C*C);
				
				System.out.println("A soma dos quadrados dos três valores"+SomaQuadrado);
				
				sc.close();
				
			}
}
