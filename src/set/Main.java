package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Carro>  hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Pegeout"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println("HashSet:");
		System.out.println(hashSetCarros);//IMPRIME FORA DE ORDEM
		
		System.out.println("");
		
		Set <Carro> treeSetCarros = new TreeSet<>();//TREESET VEM DE TREE = ARVORE.
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Pegeout"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println("TreeSet:");
		System.out.println(treeSetCarros);
		
	}	

}