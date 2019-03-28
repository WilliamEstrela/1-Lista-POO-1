package exec07;

public class Cone {
	private double raio;
	private double altura;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculargeratriz() {
		return Math.sqrt((Math.pow(this.altura, 2) + Math.pow(this.raio, 2)));
	}
	public double calculararealateral() {
		return (3.1415*this.raio*calculargeratriz());
	}
	public double calcularareatotal() {
		return(3.1415 * this.raio*calculargeratriz());
	}
	public double calcularvolume() {
		return (1.0 /3.0 * 3.1415 * Math.pow(this.raio, 2) * this.altura);
	}

}
