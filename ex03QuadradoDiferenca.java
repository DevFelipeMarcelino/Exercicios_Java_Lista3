package lista3;

import java.util.Scanner;

public class ex03QuadradoDiferenca {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o valor de A:");
				int a = sc.nextInt();
				
				System.out.println("Digite o valor de B:");
				int b = sc.nextInt();
				
				int QuadradoDiferenca = (a-b) * (a-b);
				
				System.out.println("O quadrado da diferença de A e B é igual a: "+QuadradoDiferenca);
				
				sc.close();
				
			}

}
