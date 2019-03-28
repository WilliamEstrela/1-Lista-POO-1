package exec08;

import java.util.Scanner;

public class TestePoupanca {

	public static void main(String[] args) {
		Poupanca p = new Poupanca();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa:");
		p.setCliente(leitor.nextLine());

		System.out.println("Conta:");
		p.setNumeroconta(leitor.nextInt());

		System.out.println("Agência:");
		p.setAgencia(leitor.nextInt());

		System.out.println("Digite o seu saldo:");
		p.setSaldo(leitor.nextDouble());
		
		System.out.println("Digite o valor que você deseja sacar:");
		double saque = leitor.nextDouble();
		p.saquededinheiro(saque);
		System.out.println("Saldo:"+p.getSaldo());

	}

}
