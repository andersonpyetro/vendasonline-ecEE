package br.com.pyetro.service;

import java.util.List;

import br.com.pyetro.domain.Produto;
import br.com.pyetro.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
