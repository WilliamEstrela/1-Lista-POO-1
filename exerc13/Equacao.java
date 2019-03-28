package exerc13;

public class Equacao {
	private double a;
	private double b;
	private double c;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	double delta() {
		
		return  (Math.pow(this.b, 2) - (4 * this.a * this.c));
	}
	double xlinha() {
			return  ((-this.b) + Math.sqrt(delta()))/ (2 * this.a);
		}
	
	double xtwolinhas() {
		return (-this.b - Math.sqrt(delta()))/ (2 * this.a);
	}
}
