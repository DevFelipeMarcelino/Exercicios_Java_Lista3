package lista3;

import java.util.Scanner;


public class Ex09PercentualReajuste {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite o valor atual do seu sal�rio:");
				float SalarioAtual = sc.nextFloat();
				
				System.out.println("Digite o percentual de reajuste:");
				float PercentualReajuste = sc.nextFloat();
				
				float SalarioNovo = SalarioAtual + (SalarioAtual / PercentualReajuste);
				
				System.out.println("O seu novo sal�rio ser�: 	R$"+SalarioNovo);
				
				sc.close();
				
	}

}
