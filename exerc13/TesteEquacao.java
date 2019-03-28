package exerc13;

import java.util.Scanner;

public class TesteEquacao {

	public static void main(String[] args) {
		Equacao e = new Equacao();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o valor de a:");
		e.setA(leitor.nextDouble());
		System.out.println("Digite o valor de b:");
		e.setB(leitor.nextDouble());
		System.out.println("Digite o valor de c:");
		e.setC(leitor.nextDouble());
		System.out.println("Valor de delta:" +e.delta());
		leitor.close();
		if(e.delta() < 0)
		{
			System.out.println("Não é possível calcular x linha e x 2 linhas com o delta negativo.");
		}else {
			if(e.delta()==0)
			{
				System.out.println("Valor de x linha:" +e.xlinha());
			}else {
				if(e.delta()>0) {
					System.out.println("Valor de x linha:"+ e.xlinha());
					System.out.println("Valor de x duas linhas:" + e.xtwolinhas());					
					
				}
			}
		}
	}

}
