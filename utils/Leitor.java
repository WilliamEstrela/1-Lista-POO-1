package utils;

import java.util.Scanner;

public class Leitor {
	public static double LerDoublePositivo(String nome) {
		Scanner leitor = new Scanner(System.in);
		double valor=0;
		do {
			System.out.printf("Digite %s:",nome);
			valor = leitor.nextDouble();
			
			try {
				ValidarNumero.validarDoublePositivo(valor, nome);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while (valor <= 0);
		return valor;
	}
	public static int LerIntegerPositivo(String nome) {
		Scanner leitor = new Scanner(System.in);
		int valor=0;
		do {
			System.out.printf("Digite %s:",nome);
			valor = leitor.nextInt();
			
			try {
				ValidarNumero.validarIntegerPositivo(valor, nome);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while (valor <= 0);
		return valor;
	}
}
