package exec12;

public class Triangulo {
	private double lado1;
	private double lado2;
	private double lado3;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	int validartriangulo() {
		int tipo = 0;
		if (this.lado1 == this.lado2 && this.lado1 == this.lado3 && this.lado2 == this.lado3) {
			tipo = 1;
		} else {
			if (this.lado1 == this.lado2 || this.lado2 == this.lado3 || this.lado1 == this.lado3) {
				tipo = 2;
			} else {
				if (this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado1 != this.lado3) {
					tipo = 3;
				} else {
					tipo = 0;
				}
			}
		}
		return tipo;
	}

	double areatriangulo() {
		double t = (this.lado1 + this.lado2 + this.lado3) / 2;
		return Math.sqrt(t * (t - this.lado1) * (t - this.lado2) * (t - this.lado3));
	}

	int tipodeangulo() {
		int tipo = 0;
		if (Math.pow(this.lado1, 2) < (Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2))) {
			tipo = 1;
		} else {
			if (Math.pow(this.lado1, 2) > (Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2))) {
				tipo = 2;
			} else {
				if (Math.pow(this.lado1, 2) == (Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2))) {
					tipo = 3;
				} else {
					tipo = 0;
				}
			}
		}
		return tipo;
	}

}
