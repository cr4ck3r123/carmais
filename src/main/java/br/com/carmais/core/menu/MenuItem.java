package br.com.carmais.core.menu;

import java.io.Serializable;

public class MenuItem implements Serializable{

	
 
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String label;
	private String url;
	private String icone;
	private boolean ativo;
	
	public MenuItem(String label, String url, String icone, boolean ativo) {
		super();
		this.label = label;
		this.url = url;
		this.icone = icone;
		this.ativo = ativo;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcone() {
		return icone;
	}
	public void setIcone(String icone) {
		this.icone = icone;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
