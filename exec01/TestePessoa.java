package exec01;

import java.util.Scanner;
import utils.Leitor;

public class TestePessoa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();

		p.setNome(nome);

		int idade = Leitor.LerIntegerPositivo("Idade");
		
		try {
			p.setIdade(idade);
		} catch (Exception e) {
		}

		double altura = Leitor.LerDoublePositivo("Altura");
		try {
			p.setAltura(altura);
		} catch (Exception e) {
			
		}

		double peso = Leitor.LerDoublePositivo("Peso");
		try {
			p.setPeso(peso);
		} catch (Exception e) {
		}
		leitor.close();
		System.out.println("Nome:" + p.getNome());
		System.out.println("IMC:" + p.calcularIMC());
	}

}
