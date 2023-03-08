package FilaFifo;
//FILA FIFO: FIRST IN, FIRST OUT.
public class Main {

	public static void main(String[] args) {
		
		Fila <String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		minhaFila.enqueue("quinto");
		
		System.out.println(minhaFila);
		
		System.out.println("");
		
		System.out.println(minhaFila.dequeue());//TIRA O PRIMEIRO NÓ DA FILA
		System.out.println(minhaFila);
		
		System.out.println("");
		
		minhaFila.enqueue("ultimo"); //COLOCA UM ELEMENTO NO FIM DA FILA
		System.out.println(minhaFila);
		
		System.out.println("");
		
		System.out.println(minhaFila.first());//PEGA O "SEGUNDO" Q VIROU O PRIMEIRO DA FILA APÓS O DEQUEUE DO "PRIMEIRO".
		System.out.println(minhaFila);//O "SEGUNDO" Q ESTA NA PRIMEIRA POSIÇÃO DA FILA CONTINUA NA MESMA POSIÇÃO.
	}
}
