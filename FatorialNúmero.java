package Aprimoramento;

import java.util.Scanner;

public class FatorialNúmero {
	
	public static void main(String[] args) {
		
		int N, fatorial = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro não negativo: ");
		N = scanner.nextInt();
		
		if(N < 0) {
			System.out.println("Erro: Insira um número não negativo");
		} else {
			for(int i = 1; i <= N; i++) {
				fatorial *= i;
			}
			
			System.out.println("O fatorial do número " + N + " é " + fatorial);
		}
		
		scanner.close();
	}

}
