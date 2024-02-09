package br.com.pyetro.service;

import java.util.List;

import br.com.pyetro.domain.Cliente;
import br.com.pyetro.exceptions.DAOException;
import br.com.pyetro.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
