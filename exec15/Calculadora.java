package exec15;
import java.io.Reader;
import java.io.IOException;

import java.util.Scanner;

public class Calculadora {
	Scanner leitor = new Scanner(System.in);
	private double v1, v2;

	public double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}
	public double adicao() {
		this.v2 = leitor.nextDouble();
			return this.v1+this.v2;
	}
	public double subtracao() {
		this.v2 = leitor.nextDouble();
		return this.v1 - this.v2;
	}
	public double multiplicacao() {
		this.v2 = leitor.nextDouble();
		return this.v1 * this.v2;
	}
	public double divisao() throws Exception{
		this.v2 = leitor.nextDouble();
		if(this.v2 != 0) {
			return this.v1 / this.v2;
		}else {
			Exception exception = new Exception();
			System.out.println("Não e possível fazer divisão por 0.");
			throw exception;
		}
	}
	public void coracao() throws Exception {
		char opcao = 0;
		this.v1 = leitor.nextDouble();	
		do {
			try {
				opcao = (char) System.in.read();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}		
			switch (opcao) {
			case '+':
				System.out.printf("Resultado da adição:%.0f\n\n", this.v1 = adicao());
				break;
			case '-':
				System.out.printf("Resultado da subtração:%.0f\n", this.v1 = subtracao());
				break;
			case '*':
				System.out.printf("Resultado da multiplicação:%.1f\n", this.v1 = multiplicacao());
				break;
			case '/':
				System.out.printf("%.1f\n", this.v1 = divisao());
				break;
			}
		} while (opcao != '&');	
	}

}
