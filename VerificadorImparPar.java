package Aprimoramento;

import java.util.Scanner;

public class VerificadorImparPar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 ==0) {
			System.out.println("Este número é par ");
		}else{ System.out.println("Este número é ímpar ");}
		
		entrada.close();
	}
}
