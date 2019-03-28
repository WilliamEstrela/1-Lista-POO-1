package exec09;

import java.util.Scanner; 

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário:");
		f.setNome(leitor.nextLine());
		System.out.println("Digite o cpf do trabalhador:");
		f.setCpf(leitor.nextLine());
		System.out.println("Digite o número de horas trabalhadas:");
		f.setHorastrabalhadas(leitor.nextDouble());
		System.out.println("Digite o valor da hora:");
		f.setValorhora(leitor.nextDouble());
		leitor.close();
		
		System.out.printf("Salário do %s é de :%.2f",f.getNome(), f.calcularsalario());
	}

}
