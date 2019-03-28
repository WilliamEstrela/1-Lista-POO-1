package exec04;

import utils.Leitor;

public class TesteRetangulo {

	public static void main(String[] args) {
		double largura = 0;
		Retangulo r = new Retangulo();
		largura = Leitor.LerDoublePositivo("Largura");
		try {
			r.setLargura(largura);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		double comprimento=0;
		comprimento = Leitor.LerDoublePositivo("Comprimento");
		try {
			r.setComprimento(comprimento);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("Valot da area:" + r.calcularArea());
		System.out.println("valor do perímetro:" + r.calcularPerimetro());
	}
}
