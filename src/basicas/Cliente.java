package basicas;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Pessoa implements Serializable{
	
	private String pagamento;
	private String objetivo;
	
	public Cliente() {
		
	}  

	
	

	public Cliente(String nome, Endereco endereco, String cpf, String matricula, String email, String telefone,
			String genero, String pagamento, String objetivo) {
		super(nome, endereco, cpf, matricula, email, telefone, genero);
		this.pagamento = pagamento;
		this.objetivo = objetivo;
	}




	public Cliente(String nome, Endereco endereco, String cpf, Date dataDeNasc, String matricula,
			String email, String telefone, String genero, String pagamento, String objetivo) {
		super(nome, endereco, cpf, dataDeNasc, matricula,  email, telefone, genero);
		this.pagamento = pagamento;
		this.objetivo = objetivo;
	}



	public Cliente(String pagamento, String objetivo) {
		super();
		this.pagamento = pagamento;
		this.objetivo = objetivo;
	}


	
	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public String toString() {
		return "Cliente [pagamento=" + pagamento + ", objetivo=" + objetivo + "]";
	}
	
}
