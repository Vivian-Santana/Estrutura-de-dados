package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro>  listCarros = new ArrayList<>();
		
		listCarros.add(new Carro("Ford"));
		listCarros.add(new Carro("Chevrolet"));
		listCarros.add(new Carro("Fiat"));
		listCarros.add(new Carro("Pegeout"));
		
		System.out.println(listCarros.contains(new Carro ("Ford")));
		System.out.println(listCarros.get(2));//PEGANDO O CARRO Q ESTÁ NO INDICE 2
		System.out.println("");
		
		System.out.println(listCarros.indexOf(new Carro ("Fiat")));//SABER EM QUAL INDICE ESTÁ O FIAT
		System.out.println("");
		
		System.out.println(listCarros.remove(2));//REMOVE O INDICE PASSADO NO CASO O 2
		System.out.println(listCarros);
		
		System.out.println("");
		
	}	

}