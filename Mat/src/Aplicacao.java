
public class Aplicacao {

	public static void main(String[] args) {
		
		// Convers�o de Graus para Radiano
		double anguloConvertido = Matematica.converterAngulo(86.65, TipoAngulo.GRAUS);
		System.out.println("A convers�o para radiano: " + anguloConvertido);
		
		// Convers�o de Radiando para Graus
		double anguloConvertido2 = Matematica.converterAngulo(1.51, TipoAngulo.RADIANOS);
		System.out.println("A convers�o para graus: " + anguloConvertido2);
		
		// Soma de v�rios n�meros
		int soma = Matematica.somar(10, 2, 4, 2);
		System.out.println("A soma �: " + soma);
		
		// Convers�o de bin�rio para decimal.
		int valorDecimal = Matematica.converterBinarioParaDecimal("1010");
		System.out.println("A convers�o para decimal: " + valorDecimal);
	}
}
