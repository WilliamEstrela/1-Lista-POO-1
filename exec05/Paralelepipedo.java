package exec05;

import utils.ValidarNumero;

public class Paralelepipedo {
	private double altura;
	private double comprimento;
	private double largura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura)throws Exception{
		ValidarNumero.validarDoublePositivo(altura, "Altura");
		this.altura = altura;
	}
	public double getComprimento(){
		return comprimento;
	}
	public void setComprimento(double comprimento) throws Exception {
		ValidarNumero.validarDoublePositivo(comprimento, "Comprimento");
		this.comprimento = comprimento;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) throws Exception {
		ValidarNumero.validarDoublePositivo(largura, "Largura");
		this.largura = largura;
	}

	public double calcularVolume() {
		return (this.altura * this.comprimento * this.largura);
	}
	
	public double calcularArea() {
		return (2 * (this.altura* this.largura + this.altura * this.comprimento + this.largura * this.comprimento));
	}

}
