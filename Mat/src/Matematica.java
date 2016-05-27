
public class Matematica {
	
	// M�todo que converte um determinado angulo de Grau para radiando e vice-versa.
	public static Double converterAngulo(Double angulo, TipoAngulo tipo){
		if (tipo == TipoAngulo.GRAUS) {
			
			// M�todo est�tico "toRadians" realiza a convers�o de Graus para Radiando.
			return Math.toRadians(angulo);
			 
		} else {
			
			// M�todo est�tico "toDegrees" realiza a convers�o de Radiando para Graus.
			return Math.toDegrees(angulo);
			
		}
	}
	
	// M�todo que recebe v�rios n�meros e os soma.
	public static Integer somar(Integer... numeros) {
		int soma = 0;
		
		for (Integer x : numeros) {
			soma += x;
		}
		
		return soma;
	}
	
	// M�todo que transforma bin�rio para decimal.
	public static Integer converterBinarioParaDecimal(String numBinario) {
		Integer valor = Integer.valueOf(numBinario,2);
		return valor;
	}
}


	
