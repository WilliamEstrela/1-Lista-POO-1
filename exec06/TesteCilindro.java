package exec06;

import utils.Leitor;

public class TesteCilindro {

	public static void main(String[] args) {
		
		Cilindro c = new Cilindro();
		double raio = Leitor.LerDoublePositivo("Raio");
		try {
			c.setRaio(raio);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		double altura = Leitor.LerDoublePositivo("Altura");
		try {
			c.setAltura(altura);
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		System.out.println("Valor da área lateral:"+ c.arealateral());
		System.out.println("Valor do volume:"+ c.calculovolume());
	}

}
