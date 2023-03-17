package listaCircular;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
		if (tamanhoLista == 0) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(cauda);
		} else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo; //ESTÁ ATRÁS DA CAUDA.
		}
		this.tamanhoLista++;
	}

	public void remove(int index) {
		if (index >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");

		No<T> noAuxiliar = this.cauda; // TESTANDO SE O NÓ Q VAI SER REMOVIDO É A PRÓPRIA CAUDA.
		if (index == 0) { // SE QUERO REMOVER O INDICE 0 É PQ QUERO REMOVER A CAUDA, SENDO ASSIM A CAUDA
							// PASSA A SER O PRÓXIMO NÓ,
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(cauda); // REMOVE A REFERÊNCIA DA CAUDA ANTIGA PARA A JVM PARAR DE APONTAR PRA ELA,
												// FAZENDO UM SET PARA APONTAR PARA A CAUDA ATUAL.
		} else if (index == 1) { // TESTA SE EU TO NO NÓ IMEDIATAMENTE APÓS A CAUDA
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		} else {
			for (int i = 0; i < index - 1; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		this.tamanhoLista--;
	}

	public T get(int index) {// IMPLEMENTANDO METODO GET
		return this.getNo(index).getConteudo();// RETORNA O CONTEUDO DO NÓ
	}

	private No<T> getNo(int index) { // SE A LISTA ESTIVER VAZIA O GET NO VAI RETORNAR UMA EXCEPTION
		if (this.isEmpty())
			throw new IndexOutOfBoundsException("A lista está vazia!");

		if (index == 0) { // TESTA SE O INDICE É ZERO
			return this.cauda;
		}

		No<T> noAuxiliar = this.cauda; // ENTRA PELA CAUDA DA LISTA E VAI CIRCULAR ELA ATÉ O INDICE PASSADO (i < index). É UM LOOP INFINITO.
		for (int i = 0; (i < index); i++){
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}

	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}

	public int size() {
		return this.tamanhoLista;
	}
	
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = this.cauda;
		for (int i = 0; i < size(); i++) {
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
		return strRetorno;
	}
}
