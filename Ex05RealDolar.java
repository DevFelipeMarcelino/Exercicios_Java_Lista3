package lista3;

import java.util.Scanner;


public class Ex05RealDolar {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a cota��o atual de d�lares:");
				float cotacao = sc.nextFloat();
				
				System.out.println("Digite a quantidade de reais que possu�:");
				float reais = sc.nextFloat();
				
				float dolares = reais / cotacao;
				
				System.out.println("Ent�o voc� possu�: US$"+dolares);
				
				sc.close();
				
			}

}
