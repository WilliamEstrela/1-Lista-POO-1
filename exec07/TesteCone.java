package exec07;

import utils.Leitor;
// eae
public class TesteCone {

	public static void main(String[] args) {
		Cone c = new Cone();
		double raio = Leitor.LerDoublePositivo("Raio");
		try {
			c.setRaio(raio);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		double altura = Leitor.LerDoublePositivo("Altura");
		try {
			c.setAltura(altura);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.printf("Valor da geratriz:%.2f.\n",c.calculargeratriz());
		System.out.printf("Valor da area lateral:%.2f.\n",c.calculararealateral());
		System.out.printf("Valor da area total: %.2f.\n", c.calcularareatotal());
		System.out.printf("Valor do volume: %.2f.\n", c.calcularvolume());

	}

}
