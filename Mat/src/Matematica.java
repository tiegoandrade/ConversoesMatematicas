
public class Matematica {
	
	
	public static Double converterAngulo(Double angulo, TipoAngulo tipo){
		if (tipo == TipoAngulo.GRAUS) {
			return Math.toRadians(angulo);
		} else {
			return Math.toDegrees(angulo);
		}
	}
	
	
	public static Integer somar(Integer... numeros) {
		int soma = 0;
		
		for (Integer x : numeros) {
			soma += x;
		}
		
		return soma;
	}
	
	
	public static Integer converterBinarioParaDecimal(String numBinario) {
		Integer valor = Integer.valueOf(numBinario,2);
		return valor;
	}
}

