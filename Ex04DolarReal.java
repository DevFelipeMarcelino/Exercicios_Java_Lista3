package lista3;

import java.util.Scanner;

public class Ex04DolarReal {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a cota��o atual de d�lar:");
				float cotacao = sc.nextFloat();
				
				System.out.println("Digite a quantidade de d�lares que possu�:");
				float dolares = sc.nextFloat();
				
				float reais = dolares * cotacao;
				
				System.out.println("Ent�o voc� possu�: R$"+reais);
				
				sc.close();
				
			}

}
