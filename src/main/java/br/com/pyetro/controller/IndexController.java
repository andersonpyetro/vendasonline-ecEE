package br.com.pyetro.controller;

import java.io.Serializable;

public class IndexController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6294270957994400662L;
	
	public String redirectCliente() {
		return "/cliente/list.xhtml";
	}
	
	public String redirectProduto() {
		return "/produto/list.xhtml";
	}
	
	public String redirectVenda() {
		return "/venda/list.xhtml";
	}
}


