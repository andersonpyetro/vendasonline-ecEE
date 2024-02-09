package br.com.pyetro.exceptions;

public class TipoChaveNaoEncontradaException extends Exception {

    
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -8746136703119510575L;

	public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }
}
