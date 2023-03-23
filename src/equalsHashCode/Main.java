package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();
		
		listaCarros.add(new Carro ("Ford"));
		listaCarros.add(new Carro ("Chevrolet"));
		listaCarros.add(new Carro ("Volkswagem"));
		
		System.out.println(listaCarros.contains(new Carro ("Ford")));
		//RETORNA TRUE POIS ESTA USANDO O EQUALS E RASHCODE PARA COMPARAR OS OBJS.
		System.out.println("");
		
		System.out.println(new Carro ("Ford").hashCode());//PRINTA O HASHCODE
		
		System.out.println("");
		System.out.println(new Carro ("Ford1").hashCode());
		
		System.out.println("");
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Chevrolet");
		
		System.out.println(carro1.equals(carro2));//RETORNA FALSO
		
	}

}