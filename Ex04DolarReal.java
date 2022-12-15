package lista3;

import java.util.Scanner;

public class Ex04DolarReal {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite a cotação atual de dólar:");
				float cotacao = sc.nextFloat();
				
				System.out.println("Digite a quantidade de dólares que possuí:");
				float dolares = sc.nextFloat();
				
				float reais = dolares * cotacao;
				
				System.out.println("Então você possuí: R$"+reais);
				
				sc.close();
				
			}

}
