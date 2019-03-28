package exec02;

public class Piramide {
	
	double base;
	double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double calcularVolume() {
		return (this.base * this.altura)/3;
	}
}
