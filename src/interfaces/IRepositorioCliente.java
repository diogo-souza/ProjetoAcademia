package interfaces;

import basicas.Cliente;
import excecoes.ClienteJaCadastradoException;
import excecoes.NaoEncontradoException;

public interface IRepositorioCliente {
	
	public void inserir(Cliente cliente) throws ClienteJaCadastradoException;
	public Cliente procurar(String matricula) throws NaoEncontradoException;
	public void remover(String matricula);
	public void atualizar(Cliente cliente) throws NaoEncontradoException;
	public Cliente[] listar();
	
}
