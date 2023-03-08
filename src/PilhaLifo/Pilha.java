package PilhaLifo;
//LIFO (LAST IN FIRST OUT)
public class Pilha {
	No refNoEntradaPilha = null;

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
    	
        String stringRetorno = "--------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "--------------\n";
        
        No noAuxiliar = refNoEntradaPilha;//NÓ AUX. PERCORRE A PILHA E PRINTAR ELA, MOSTRANDO AS INFROMAÇÕES DE CADA NÓ.
        
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();//REF NÓ PASSA A SER O SEGUNDO NÓ (ELE RECEBE A REFERÊNCIA DO PRÓXIMO NÓ)PASSANDO A SER O PRÓXIMO NÓ.
            }else{
                break;//SE A LISTA ESTIVER VAZIA O BREAK PARA O LAÇO DE REPETIÇÃO
            }
        }
        stringRetorno += "**************";
        return stringRetorno;
    }
}
