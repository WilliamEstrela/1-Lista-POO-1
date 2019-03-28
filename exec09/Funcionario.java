package exec09;

public class Funcionario {
	private String nome;
	private String cpf;
	private double horastrabalhadas;
	private double valorhora;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getHorastrabalhadas() {
		return horastrabalhadas;
	}
	public void setHorastrabalhadas(double horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}
	public double getValorhora() {
		return valorhora;
	}
	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}
	public double calcularsalario() {
		return this.horastrabalhadas * this.valorhora;
	}

}
