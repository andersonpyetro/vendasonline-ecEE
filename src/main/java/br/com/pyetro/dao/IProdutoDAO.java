package br.com.pyetro.dao;

import java.util.List;

import br.com.pyetro.dao.generic.IGenericDAO;
import br.com.pyetro.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}