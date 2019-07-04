package br.com.carmais;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HomeController implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String mensagem;
	
	@PostConstruct
	public void inicializar() {
		setMensagem("Projeto Configurado");
		System.out.println("Projeto Configurado !!!");
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
