
public class Matematica {
	
	// Método que converte um determinado angulo de Grau para radiando e vice-versa.
	public static Double converterAngulo(Double angulo, TipoAngulo tipo){
		if (tipo == TipoAngulo.GRAUS) {
			
			// Método estático "toRadians" realiza a conversão de Graus para Radiando.
			return Math.toRadians(angulo);
			 
		} else {
			
			// Método estático "toDegrees" realiza a conversão de Radiando para Graus.
			return Math.toDegrees(angulo);
			
		}
	}
	
	// Método que recebe vários números e os soma.
	public static Integer somar(Integer... numeros) {
		int soma = 0;
		
		for (Integer x : numeros) {
			soma += x;
		}
		
		return soma;
	}
	
	// Método que transforma binário para decimal.
	public static Integer converterBinarioParaDecimal(String numBinario) {
		Integer valor = Integer.valueOf(numBinario,2);
		return valor;
	}
}


	
