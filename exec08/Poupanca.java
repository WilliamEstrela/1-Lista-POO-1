package exec08;

import java.util.Scanner;

public class Poupanca {
	private String cliente;
	private int numeroconta;
	private int agencia;
	private double saldo;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saquededinheiro(double saque) {
		Scanner leitor = new Scanner(System.in);
		do {
			if (saque <= this.saldo) {
				this.saldo = this.saldo - saque;
			}
			else {
				System.out.println("O saque tem que ser menor que osaldo. Digite o saque novamente!");
				saque = leitor.nextDouble();
			}
		}while(saque > this.saldo);
	}

}
