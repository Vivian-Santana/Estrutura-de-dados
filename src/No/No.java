package No;
//USANDO GENERICS TIPO GENÉRICO T
public class No <T>{

	private T conteudo;
	private No <T> proximoNo;
	
	public No(T conteudo, No proximoNo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "Nó -> conteúdo: " + conteudo;
	}
	
}
