package exec11;

import java.util.Scanner;

public class TestePaciente {
	
	public static void main(String[] agrs) {
		Paciente p = new Paciente();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do paciente:");
		p.setNome(leitor.nextLine());
		System.out.println("Digite o peso do paciente:");
		p.setPeso(leitor.nextDouble());
		System.out.println("Digite a altura do paciente:");
		p.setAltura(leitor.nextDouble());
		p.calcularIMC();
		leitor.close();
		System.out.println("Seu IMC:"+p.calcularIMC());
		if(p.calcularIMC()<20) {
			System.out.println("Abaixo do peso ideal!");
		}else {
			if(p.calcularIMC()>20 || p.calcularIMC() <25) {
				System.out.println("Peso normal.");
			}else {
					if(p.calcularIMC()>25 || p.calcularIMC()<30) {
						System.out.println("Excesso de peso!");
					}else {
						if(p.calcularIMC()>30 || p.calcularIMC() <35) {
							System.out.println("Obesidade.");
						}else {
							if(p.calcularIMC() >35) {
								System.out.println("Obesidade mórbida.");
							}
						}
						
					}
				}
			}
		}
		

	}

