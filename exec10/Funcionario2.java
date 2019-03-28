package exec10;

public class Funcionario2 {
	private String nome;
	private double salario;
	private int numerofilhos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumerofilhos() {
		return numerofilhos;
	}
	public void setNumerofilhos(int numerofilhos) {
		this.numerofilhos = numerofilhos;
	}
	
	public double aumentosalario(double porcentagem) {
		double salario=0;
		salario = this.salario * (porcentagem/100);
		return salario;
	}
	public double impostoderenda() {
		return 1250 * this.numerofilhos;
	}
	
	public double calculoINSS() {
		double INSS=0;
		if(this.salario <= 2545){
			INSS = this.salario * 0.06;
		}else {
			INSS = this.salario * 0.010;
		}
		return INSS;
	}
}
