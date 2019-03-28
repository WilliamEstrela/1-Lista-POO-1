package exec15;

import java.util.Scanner;

public class TesteCalculadora {
	public static void main(String[] agrs) throws Exception {
		Scanner leitor = new Scanner(System.in);
		Calculadora c = new Calculadora();
		System.out.println("Digite um numero e tecle enter, digite o operador ( + , - , * , /) tecle enter e digite o segundo numero e tecle enter.");
		c.coracao();
	}

}
