package exec03;

import utils.Leitor;

public class TesteEsfera {

	public static void main(String[] args) {
		Esfera e = new Esfera();
		double raio = Leitor.LerDoublePositivo("Raio");
		try {
			e.setRaio(raio);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.printf("Valor da área total: %.2f.\n", e.AreaTotal());
		System.out.printf("Valor do volume: %.2f.\n", e.calcularVolume());
	}

}
