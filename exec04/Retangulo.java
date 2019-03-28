package exec04;

public class Retangulo {
	private double comprimento;
	private double largura;

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double calcularArea() {
		return (this.largura * this.comprimento);
	}
	
	public double calcularPerimetro() {
		return ((2 * this.largura) + (2*this.comprimento));
	}

}
