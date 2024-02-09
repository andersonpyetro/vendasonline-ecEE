package br.com.pyetro.service;

import br.com.pyetro.dao.generic.IGenericDAO;
import br.com.pyetro.domain.Venda;
import br.com.pyetro.exceptions.DAOException;
import br.com.pyetro.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	
	public Venda consultarComCollection(Long id);

}