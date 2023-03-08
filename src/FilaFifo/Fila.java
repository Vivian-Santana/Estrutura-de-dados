package FilaFifo;
//FILA FIFO: FIRST IN, FIRST OUT.
public class Fila <T>{

	private No <T>refNoEntradaFila;

	private Fila(No refNoEntradaFila) {
		this.refNoEntradaFila = null;
	}

	public Fila() {

	}

	public void enqueue(T object) {
		No novoNo = new No (object);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}

	public T first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {// SE NÃO FOR O PRIMEIRO NÓ FAZ ALGUMA COISA
					primeiroNo = primeiroNo.getRefNo();
				} else { // SE FOR O PRIMEIRO NÓ ELE PARA
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	public T dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;

		if (refNoEntradaFila != null) {

			while (true)																																							 {
				stringRetorno += "[NÓ{objeto = " + noAuxiliar.getObject() + "}] ---> ";

				if (noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}

		} else {
			stringRetorno = "null";
		}

		return stringRetorno;
	}

}
