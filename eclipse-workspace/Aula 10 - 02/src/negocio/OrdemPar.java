package negocio;

public class OrdemPar implements Ordem {
	public void ordenar(int[] vetor) {
		int par[] = new int[vetor.length];
		int impar[] = new int[vetor.length];
		
		int ultimaPosicaoPar = 0;
		int ultimaPosicaoImpar = 0;
		
		for(int i = 0 ; i < vetor.length ; i++) {
			if((vetor[i] % 2) == 0) {
				par[ultimaPosicaoPar] = vetor[i];
				ultimaPosicaoPar++;
			} else {
				impar[ultimaPosicaoImpar] = vetor[i];
				ultimaPosicaoImpar++;
			}
		}
		
		for(int i = 0 ; i < ultimaPosicaoPar ; i++) {
			vetor[i] = par[i];
		}
		
		for (int i = 0 ; i < ultimaPosicaoImpar ; i++) {
			vetor[i + ultimaPosicaoPar] = impar[i];
		}
	}
}