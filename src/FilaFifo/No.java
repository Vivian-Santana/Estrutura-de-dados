package FilaFifo;
//FILA FIFO: FIRST IN, FIRST OUT.
public class No <T>{

	private T object;
	private No<T> refNo;

	private No() {
	}

	public No(T object) { // OBJECT É O CONTEÚDO DO NÓ
		this.refNo = null;
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		object = object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}


	@Override
	public String toString() {
		return "NÓ [object = " + object + "]";
	}
}
