package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Carro>  queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));
		
		System.out.println(queueCarros.add(new Carro ("Peugeot")));
		System.out.println(queueCarros);
		System.out.println("");
		
		System.out.println(queueCarros.offer(new Carro("Renault")));//TENTA ADICIONAR, SE NÃO CONSEIGUIR RETORNA FALSE
		System.out.println(queueCarros);
		System.out.println("");
		
		System.out.println(queueCarros.peek());//PEGA O RIMEIRO ELEMENTO DA FILA MAS NÃO O REMOVE DA FILA.
		System.out.println(queueCarros);
		System.out.println("");
		
		
		System.out.println(queueCarros.poll());//PEGA O PRIMEIRO ELEMENTO DA FILA E O TIRA DA FILA.
		System.out.println(queueCarros);
		System.out.println("");
		
		System.out.println(queueCarros.size());//MOSTRA O TAMANHO DA FILA.
		
		System.out.println(queueCarros.isEmpty());//VERIFICA SE ESTA VAZIA.
	}	

}