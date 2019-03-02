package sistema;

import basicas.Cliente;
import excecoes.ClienteJaCadastrado;
import interfaces.IRepositorioCliente;

public class CadastroCliente {
	
	private IRepositorioCliente repositorio;

	public CadastroCliente(IRepositorioCliente repositorio) {
		this.repositorio = repositorio;
	}
	
	public void inserir(Cliente cliente) throws ClienteJaCadastrado {
		repositorio.inserir(cliente);
	}
	
	public Cliente procurar(String matricula) /*throws MatriculaNaoEncontradaException*/ {
		return repositorio.procurar(matricula);
	}
	
	public void remover(String matricula) /*throws MatriculaNaoEncontradaException*/ {
		repositorio.remover(matricula);
	}
	
	public void atualizar(Cliente cliente) {
		repositorio.atualizar(cliente);
	}

}