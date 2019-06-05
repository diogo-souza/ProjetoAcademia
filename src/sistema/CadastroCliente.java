package sistema;

import java.util.List;

import basicas.Cliente;
import interfaces.IRepositorioCliente;
import repositorios.RepositorioClienteArray;

public class CadastroCliente {
	
	private IRepositorioCliente repositorio;

	public CadastroCliente() {		
				repositorio = new RepositorioClienteArray();	
	}
	
	public void inserir(Cliente cliente) {
		repositorio.inserir(cliente);
	}
	
	public Cliente procurar(String cpf)  {
		return repositorio.procurar(cpf);
	}
	
	public Cliente procurarMatricula(String matricula)  {
		return repositorio.procurarMatricula(matricula);
	}
	
	public void remover(String cpf)  {
		repositorio.remover(cpf);
	}
	
	public void atualizar(Cliente cliente){
		repositorio.atualizar(cliente);
	}
	
	public List listar(String nome) {
		return repositorio.listar(nome);
	}
	
	public List listar() {
		return repositorio.listar();
	}

}
