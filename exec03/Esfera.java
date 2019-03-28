package exec03;

public class Esfera {
	public double raio;
	
	//Retorna o raio da esfera
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws Exception {
		try{
			this.raio = raio;
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public double AreaTotal() {
		return (4 * 3.1415 * Math.pow(this.raio, 2));
	}

	public double calcularVolume() {
		return (4 * 3.1415 * Math.pow(this.raio, 3)) / 3;
	}

}
