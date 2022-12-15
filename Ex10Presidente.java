package lista3;

import java.util.Scanner;

public class Ex10Presidente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
				System.out.println("Digite quantidae de votos recebidas pelo candidato A:");
				float CandidatoA = sc.nextFloat();
				
				System.out.println("Digite quantidae de votos recebidas pelo candidato B:");
				float CandidatoB = sc.nextFloat();
				
				System.out.println("Digite quantidae de votos recebidas pelo candidato C:");
				float CandidatoC = sc.nextFloat();
				
				System.out.println("Digite quantidae de votos brancos:");
				float brancos = sc.nextFloat();
				
				System.out.println("Digite quantidae de votos nulos:");
				float nulos = sc.nextFloat();
				
				float TotalEleitores = CandidatoA + CandidatoB + CandidatoC + brancos + nulos;
				float TotalValidos =  ((CandidatoA + CandidatoB + CandidatoC) / TotalEleitores) * 100;
				
				System.out.println("O total de eleitores foi de: "+TotalEleitores);
				System.out.println("E o percentual de votos válidos foi de: "+TotalValidos+"%");
				
				float PercentualA = (CandidatoA / TotalEleitores) * 100;
				float PercentualB = (CandidatoB / TotalEleitores) * 100;
				float PercentualC = (CandidatoC / TotalEleitores) * 100;
				
				System.out.println("E o percentual de votos válidos do candidato A foi de: "+PercentualA+"%");
				System.out.println("E o percentual de votos válidos do candidato B foi de: "+PercentualB+"%");
				System.out.println("E o percentual de votos válidos do candidato C foi de: "+PercentualC+"%");
				
				float PercentualBrancos = (brancos / TotalEleitores) * 100;
				float PercentualNulos = (nulos / TotalEleitores) * 100;
				
				System.out.println("E o percentual de votos brancos foi de: "+PercentualBrancos+"%");
				System.out.println("E o percentual de votos nulos foi de: "+PercentualNulos+"%");
				
				sc.close();
				
	}
}
