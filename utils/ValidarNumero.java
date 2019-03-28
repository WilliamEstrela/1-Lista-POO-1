package utils;

public class ValidarNumero {
	public static void validarDoublePositivo(double valor,String identificador) throws Exception {
		if (valor <= 0){
			Exception exception = new Exception(identificador+" não pode ser negativo!");
			throw exception;
		}
	}
	public static void validarIntegerPositivo(int valor, String identificador)
		throws Exception {
		ValidarNumero.validarDoublePositivo(Double.valueOf(valor), identificador);
	}
}
