package exec02;

import java.util.Scanner;

public class TestePiramide {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Piramide p = new Piramide();
		System.out.println("Digite o valor da base da pirâmide:");
		p.setBase(leitor.nextDouble()); 
		System.out.println("Digite o valor da altura:");
		p.setAltura(leitor.nextDouble());
		leitor.close();
		System.out.println("O volume é:"+p.calcularVolume());
	}

}
