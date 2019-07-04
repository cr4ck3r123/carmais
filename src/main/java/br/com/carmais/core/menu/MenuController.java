package br.com.carmais.core.menu;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

public class MenuController {
	
	
	
	private Menu menu;

	@PostConstruct
	public void inicializar() {
		
	List<MenuItem> itens =	Arrays.asList(
				new MenuItem("Meus Anuncios", "http://localhost:8090/carmais/app/meus-anuncios/meus-anuncios.xhtml", "fa fa-dashboard", false),

				new MenuItem("Vender meu Veiculo", "http://localhost:8090/carmais/app/minhas-negociacoes/minhas-negociacoes.xhtml", "fa fa-dashboard", false),

				new MenuItem("Minhas Negoçiações", "http://localhost:8090/carmais/app/minhas-negociacoes/minhas-negociacoes.xhtml", "fa fa-dashboard", false),

				new MenuItem("Meu Perfil", "http://localhost:8090/carmais/app/meu-perfil/meu-perfil.xhtml", "fa fa-dashboard", false)
				);
		
		setMenu(new Menu(itens));
	}
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
	
	
	

}
