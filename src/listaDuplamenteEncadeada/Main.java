package listaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

		minhaLista.add("A");
		minhaLista.add("B");
		minhaLista.add("C");
		minhaLista.add("D");
		minhaLista.add("E");
		minhaLista.add("F");
		minhaLista.add("G");

		System.out.println(minhaLista);
		System.out.println("");

		minhaLista.remove(3);
		System.out.println(minhaLista);
		
		System.out.println("");
		
		minhaLista.add(3, "V");
		System.out.println(minhaLista);
		
		System.out.println("");
		
		System.out.println(minhaLista.get(3));
	}

}
