package br.com.pyetro.exceptions;

public class TipoElementoNaoConhecidoException extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7639630170414342366L;

	public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }

}