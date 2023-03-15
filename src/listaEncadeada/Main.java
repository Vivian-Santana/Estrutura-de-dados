package listaEncadeada;

public class Main {

	public static void main(String args[]) {

		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

		minhaListaEncadeada.add("teste A");
		minhaListaEncadeada.add("teste B");
		minhaListaEncadeada.add("teste C");
		minhaListaEncadeada.add("teste D");

		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println("");
		
		System.out.println(minhaListaEncadeada);

		minhaListaEncadeada.remove(0);

		System.out.println("");
		
		System.out.println(minhaListaEncadeada);
	}
}
