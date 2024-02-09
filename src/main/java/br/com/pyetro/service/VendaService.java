package br.com.pyetro.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.pyetro.dao.IVendaDAO;
import br.com.pyetro.domain.Venda;
import br.com.pyetro.domain.Venda.Status;
import br.com.pyetro.exceptions.DAOException;
import br.com.pyetro.exceptions.TipoChaveNaoEncontradaException;
import br.com.pyetro.services.generic.GenericService;

@Stateless
public class VendaService extends GenericService<Venda, Long> implements IVendaService {

	IVendaDAO dao;
	
	@Inject
	public VendaService(IVendaDAO dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		venda.setStatus(Status.CONCLUIDA);
		dao.finalizarVenda(venda);
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		venda.setStatus(Status.CANCELADA);
		dao.cancelarVenda(venda);
	}

	@Override
	public Venda consultarComCollection(Long id) {
		return dao.consultarComCollection(id);
	}

	@Override
	public Venda cadastrar(Venda entity) throws TipoChaveNaoEncontradaException, DAOException {
		entity.setStatus(Status.INICIADA);
		return super.cadastrar(entity);
	}
	
	

}
