package exec05;

import utils.Leitor;

public class TesteParalelepipedo {
	public static void main(String[] args) {
		Paralelepipedo p = new Paralelepipedo();
		double altura = Leitor.LerDoublePositivo("Altura");
		try {
			p.setAltura(altura);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		double largura = Leitor.LerDoublePositivo("Largura");
		try {
			p.setLargura(largura);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		double comprimento = Leitor.LerDoublePositivo("Comprimento");
		try {
			p.setComprimento(comprimento);
		}catch(Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		System.out.printf("Cálculo do volume: %.2f.\n", p.calcularVolume());
		System.out.printf("Cálculo da área:%.2f\n.", p.calcularArea());
	}
}
