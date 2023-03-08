package PilhaPushPop;

public class Pilha {

	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No top() {
		this.refNoEntradaPilha = null;
		return null;
	}
	
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;//DOU UM PUSH = GUARDO A REFERENCIA DE TOPO
		refNoEntradaPilha = novoNo;//PEGO A REFENCIA DE TOPO E SETO COMO NOVO NÓ, PASSO A NOVA REFERENCIA PARA O NÓ QUE ACABEI DE EMPINHAR
		refNoEntradaPilha.setReNo(refAuxiliar);//A REFERNCIA DE PRÓXIMO NÓ (Q ESTÁ EM BAIXO DELE) É A MINHA ANTIGA REFERENCIA DE TOPO.
	}
	
	public No pop() { //PEGA O PRIMEIRO ELEMENTO (NÓ) O TIRA DA PILHA PASSANDO A APONTAR A REFERÊNCIA PARA O PRÓXIMO ELEMENTO DE BAIXO.
		if(!this.isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getReNo();
			return noPoped;
		}
		return null;
	}
	
	public boolean isEmpty() {
		
		return refNoEntradaPilha == null ? true: false;
	}
}
