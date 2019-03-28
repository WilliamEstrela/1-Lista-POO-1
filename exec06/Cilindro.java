package exec06;

public class Cilindro {
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
	public double arealateral() {
		return(2*3.1415*this.raio*this.altura);		
	}
	public double calculovolume() {
		return (3.1415 * this.raio * this.raio * this.altura);
	}

}
