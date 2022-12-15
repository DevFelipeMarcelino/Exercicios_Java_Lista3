package lista3;

import java.util.Scanner;


public class Ex05RealDolar {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a cotação atual de dólares:");
				float cotacao = sc.nextFloat();
				
				System.out.println("Digite a quantidade de reais que possuí:");
				float reais = sc.nextFloat();
				
				float dolares = reais / cotacao;
				
				System.out.println("Então você possuí: US$"+dolares);
				
				sc.close();
				
			}

}
