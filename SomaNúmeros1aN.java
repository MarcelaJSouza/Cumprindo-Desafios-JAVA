package Aprimoramento;

import java.util.Scanner;

public class SomaNúmeros1aN {
	
	public static void main(String[] args) {
		
		int N, soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro positivo: ");
		N = scanner.nextInt();
		
		if(N <= 0) {
			System.out.println("Erro: Tente novamente com um número positivo");
		} else {
			for(int i = 1; i <= N; i++) {
				soma += i;
			}
			
			System.out.println("A soma dos números de 1 a " + N + " é " + soma);
		}
		
		scanner.close();
	}

}
