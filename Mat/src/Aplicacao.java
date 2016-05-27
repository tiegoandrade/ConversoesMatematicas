
public class Aplicacao {

	public static void main(String[] args) {
		
		// Conversão de Graus para Radiano
		double anguloConvertido = Matematica.converterAngulo(86.65, TipoAngulo.GRAUS);
		System.out.println("A conversão para radiano: " + anguloConvertido);
		
		// Conversão de Radiando para Graus
		double anguloConvertido2 = Matematica.converterAngulo(1.51, TipoAngulo.RADIANOS);
		System.out.println("A conversão para graus: " + anguloConvertido2);
		
		// Soma de vários números
		int soma = Matematica.somar(10, 2, 4, 2);
		System.out.println("A soma é: " + soma);
		
		// Conversão de binário para decimal.
		int valorDecimal = Matematica.converterBinarioParaDecimal("1010");
		System.out.println("A conversão para decimal: " + valorDecimal);
	}
}
