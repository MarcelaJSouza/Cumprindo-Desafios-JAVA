package Aprimoramento;

import java.util.Scanner;

public class SomaDoisNumeros {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número");
		int num1 = entrada.nextInt();
		
		System.out.println("Informe o número");
		int num2 = entrada.nextInt();
		
		int resultado = num1 + num2;
		System.out.println("O resultado é " + resultado);		
		
		entrada.close();
	}
}
