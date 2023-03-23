package equalsHashCode;

import java.util.Objects;

public class Carro {
	String marca;
	
	public Carro(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() { //RETORNA UM NÚMERO INTEIRO, UM HASH GERADO A PARTIR DO ATRIBUTO MARCA
		return Objects.hash(marca);//FACILITANDO ALGUMAS ESTRUTURAS DE DADOS A ORGANIZAR OS OBJS DENTRO DAS CLASSES.
	}

	@Override
	public boolean equals(Object obj) { 
		if (this == obj)//COMPARA SE É IGUAL PELO ATRIBUTO MARCA (SE THIS É IGUAL AO OBJ PASSADO PELO PARÂMETRO).
			return true;
		if (obj == null)//TESTA SE A REFERÊNCIA DE MEMÓRIA DOS OBJS SÃO IGUAIS, SE FOREM = RETORNA TRUE
			return false;
		if (getClass() != obj.getClass())//TESTA SE OS OBJS TEM A MESMA CLASSE.
			return false;
		Carro other = (Carro) obj;//FAZ UM CASTING CRIA O OBJ CARRO TEMPORARIO, FAZ UM CAST DO OBJ PASSADO COMO PARAMETRO E TESTA SE SÃO IGUAIS
		return Objects.equals(marca, other.marca);//LEVANDO EM CONSIDERAÇÃO O ATRIBUTO MARCA.
	}

}