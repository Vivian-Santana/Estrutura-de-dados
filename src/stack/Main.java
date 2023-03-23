package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<Carro>stackCarros = new Stack<>();
		
		stackCarros.push(new Carro ("Ford"));
		stackCarros.push(new Carro ("Chevrolet"));
		stackCarros.push(new Carro ("Fiat"));//ULTIMO ADICIONADO, ESTÁ NO TOPO DA LISTA.
		
		System.out.println(stackCarros);
		
		System.out.println("");
		
		System.out.println(stackCarros.pop());//RETIRA O Q ESTÁ NO TOPO
		System.out.println(stackCarros);

		System.out.println("");

		System.out.println(stackCarros.peek());//MOSTRA MAS NÃO RETIRA
		System.out.println(stackCarros);

		System.out.println("");

		System.out.println(stackCarros.empty());//RETORNA UM BOLEANO PRA DIZER SE ESTÁ VAZIA.
	}

}