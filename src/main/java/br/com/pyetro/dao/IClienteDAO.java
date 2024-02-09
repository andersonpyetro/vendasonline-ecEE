package br.com.pyetro.dao;

import java.util.List;

import br.com.pyetro.dao.generic.IGenericDAO;
import br.com.pyetro.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}