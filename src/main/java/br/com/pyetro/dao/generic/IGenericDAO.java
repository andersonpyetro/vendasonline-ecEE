package br.com.pyetro.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.pyetro.domain.Persistente;
import br.com.pyetro.exceptions.DAOException;
import br.com.pyetro.exceptions.MaisDeUmRegistroException;
import br.com.pyetro.exceptions.TableException;
import br.com.pyetro.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;
}