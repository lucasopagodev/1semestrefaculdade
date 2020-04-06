package negocio;

public class OrdemImpar implements Ordem {
	public void ordenar(int[] vetor) {
		int i = 0;
		
		do {
			int j = i + 1;
			if ((vetor[i] % 2) == 0) {
				do {
					if ((vetor[j] % 2) == 1) {
						int temp = vetor[i];
						vetor[i] = vetor[j];
						vetor[j] = temp;
					}
					j++;
				} while (j < vetor.length);
			}
			i++;
		} while(i < (vetor.length - 1));
	}
}