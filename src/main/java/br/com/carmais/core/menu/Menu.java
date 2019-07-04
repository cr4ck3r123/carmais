package br.com.carmais.core.menu;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<MenuItem> itens;

	public Menu(List<MenuItem> itens) {
		this.itens = itens;
	}

	public List<MenuItem> getItens() {
		return itens;
	}

	public void setItens(List<MenuItem> itens) {
		this.itens = itens;
	}
	
	
	

}
