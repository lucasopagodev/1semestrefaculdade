package apresentacao;

import java.util.Random;

import negocio.OrdemCrescente;
import negocio.OrdemDecrescente;
import negocio.OrdemImpar;
import negocio.OrdemPar;

public class Principal {
	public static void main(String[] args) {
		int[] vetor = new int[20];
		
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = new Random().nextInt(100);
		}
		
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		new OrdemCrescente().ordenar(vetor);
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		new OrdemDecrescente().ordenar(vetor);
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		new OrdemPar().ordenar(vetor);
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		new OrdemImpar().ordenar(vetor);
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}