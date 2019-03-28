package exec14;

import exec14.ValidaCPF;

import java.util.Scanner;

public class TesteCPF {

	public static void main(String[] args) {
		CPF c = new CPF();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu CPF:");
		String cpf = leitor.nextLine();
		
		System.out.println("Resultado:");
		
		if(ValidaCPF.isCPF(cpf)==true) {
			System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));
		}else {
			System.out.println("Erro, CPF Inválido");
		}
		
	}

}
