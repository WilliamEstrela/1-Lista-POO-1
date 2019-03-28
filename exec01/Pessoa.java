package exec01;

import utils.ValidarNumero;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		ValidarNumero.validarIntegerPositivo(idade, "Idade");
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws Exception {
		ValidarNumero.validarDoublePositivo(peso, "Peso");
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws Exception {
		ValidarNumero.validarDoublePositivo(altura, "Altura");
		this.altura = altura;
	}

	public double calcularIMC() {
		return this.peso / Math.pow(this.altura, 2);
	}
}
