package exec10;

import java.util.Scanner;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		Funcionario2 f2 = new Funcionario2();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário:");
		f2.setNome(leitor.nextLine());
		System.out.println("Digite o salário:");
		f2.setSalario(leitor.nextDouble());
		System.out.println("Digite o numero de filhos:");
		f2.setNumerofilhos(leitor.nextInt());

		System.out.println("Digite a porcentagem de aumento do salário:");
		double porcentagem = leitor.nextDouble();
		leitor.close();
		System.out.printf("O salario irá aumentar %.2f Reais.\n", f2.aumentosalario(porcentagem));
		System.out.printf("Valor do imposto de renda:%.2f\n", f2.impostoderenda());
		System.out.printf("Valor do INSS:%.2f", f2.calculoINSS());

	}

}
