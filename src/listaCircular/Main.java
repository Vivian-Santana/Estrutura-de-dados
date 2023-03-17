package listaCircular;

public class Main {

	public static void main(String args[]){

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("A");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        
        minhaListaCircular.add("B");
        System.out.println(minhaListaCircular);
        
        System.out.println("");

        minhaListaCircular.add("C");
        minhaListaCircular.add("D");
        System.out.println(minhaListaCircular);

        System.out.println("");
        
        System.out.println(minhaListaCircular.get(7));
        
        System.out.println("");
        
        System.out.println(minhaListaCircular.get(4));
        
        System.out.println("");
        
        //LOOP DA LISTA
        for(int i =0; i < 20; i++ ) {
        	System.out.println(minhaListaCircular.get(i));
        }

    }
}
