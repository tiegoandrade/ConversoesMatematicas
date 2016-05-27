
public class Aplicacao {

	public static void main(String[] args) {
		
		double anguloConvertido = Matematica.converterAngulo(86.65, TipoAngulo.GRAUS);
		System.out.println(anguloConvertido);
		
		double anguloConvertido2 = Matematica.converterAngulo(1.51, TipoAngulo.RADIANOS);
		System.out.println(anguloConvertido2);
		
		int soma = Matematica.somar(10, 2, 4, 2);
		System.out.println(soma);
		
		int valorDecimal = Matematica.converterBinarioParaDecimal("1010");
		System.out.println(valorDecimal);
	}
}
