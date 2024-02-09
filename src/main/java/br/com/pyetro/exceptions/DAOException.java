package br.com.pyetro.exceptions;

public class DAOException extends Exception {



	/**
	 * 
	 */
	private static final long serialVersionUID = -3866973076917140739L;

	public DAOException(String msg, Exception ex) {
		super(msg, ex);
    }
}
