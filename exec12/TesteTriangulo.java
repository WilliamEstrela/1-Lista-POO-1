package exec12;

import utils.Leitor;

public class TesteTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		double lado1 = Leitor.LerDoublePositivo("o Lado 1");
		try {
			t.setLado1(lado1);
		}catch(Exception e) {
		}
		double lado2 = Leitor.LerDoublePositivo("o Lado 2");
		try {
			t.setLado2(lado2);
		}catch(Exception e1){
			
		}
		double lado3 = Leitor.LerDoublePositivo("o Lado 3");
		try {
			t.setLado3(lado3);
		}catch(Exception e2) {
			
		}
		if (t.tipodeangulo() == 1) {
			System.out.println("Ocutângulo.");
		} else {
			if (t.tipodeangulo() == 2) {
				System.out.println("Obtusângulo.");
			} else {
				if (t.tipodeangulo() == 3) {
					System.out.println("Retângulo.");
				} else {
					if (t.tipodeangulo() == 0) {
						System.out.println("Triângulo não possui ângulo.");
					}
				}
			}
		}

		if (t.validartriangulo() == 1) {
			System.out.println("Equilatero.");
		} else {
			if (t.validartriangulo() == 2) {
				System.out.println("Isósceles.");
			} else {
				if (t.validartriangulo() == 3) {
					System.out.println("Escaleno.");
				} else {
					if (t.validartriangulo() == 0) {
						System.out.println("Não é triângulo");
					}
				}
			}
		}

		System.out.println("Area do triângulo:" + t.areatriangulo());

	}

}
