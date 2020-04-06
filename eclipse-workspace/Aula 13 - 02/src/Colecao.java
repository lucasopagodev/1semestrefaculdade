import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class Colecao {
	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<String> colecaoArrayList = new ArrayList<String>();
		colecaoArrayList.add("Lucas");
		colecaoArrayList.add("Bonitão");
		colecaoArrayList.add("Loiro");
		
		System.out.println(colecaoArrayList.get(0));
		
		for (String objeto : colecaoArrayList) {
			System.out.println(objeto);
		}
		
		System.out.println();
		
		ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> linha = new ArrayList<Integer>();
		linha.add(new Integer(1));
		linha.add(new Integer(2));
		linha.add(new Integer(3));
		matriz.add(linha);
		linha = new ArrayList<Integer>();
		linha.add(new Integer(4));
		linha.add(new Integer(5));
		linha.add(new Integer(6));
		matriz.add(linha);
		System.out.println(matriz.get(0).get(0));
		System.out.println(matriz.get(1).get(1));
		
		//------------------------------------------------------------------
		System.out.println();
		//LinkedList
		LinkedList<Boolean> colecaoLinkedList = new LinkedList<Boolean>();
		colecaoLinkedList.add(new Boolean(true));
		colecaoLinkedList.add(new Boolean(false));
		colecaoLinkedList.add(new Boolean(true));
		
		for (Boolean objeto : colecaoLinkedList) {
			System.out.println(objeto);
		}
		
		// TreeSet 
		System.out.println();
		
		TreeSet<Double> arvore = new TreeSet<Double>();
		arvore.add(new Double(10));
		arvore.add(new Double(30));
		
		for (Double objeto : arvore) {
			System.out.println(objeto);
		}
	
		
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(new Integer(65), "A");
		mapa.put(new Integer(65), "C");
		mapa.put(new Integer(65), "D");
		mapa.put(new Integer(65), "E");
		mapa.put(new Integer(65), "F");
		mapa.put(new Integer(65), "G");
		
		System.out.println(mapa.get(new Integer(67)));
		System.out.println(mapa.containsValue("G"));
		System.out.println(mapa.containsValue("H"));
	}
}
