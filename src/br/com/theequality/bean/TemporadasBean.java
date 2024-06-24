package br.com.theequality.bean;

import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Clube;
import br.com.theequality.modelo.Temporada;

@ManagedBean
@ViewScoped
public class TemporadasBean {
	
	private Temporada temporada = new Temporada();
	
	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}
	
	private List<Temporada> temporadas;

	public List<Temporada> getTemporadas() {

		DAO<Temporada> dao = new DAO<Temporada>(Temporada.class);

		if (this.temporadas == null) {
			this.temporadas = dao.listaTodos();
		}

		return temporadas;
	}
	
	public List<Clube> getClubes() {
		return new DAO<Clube>(Clube.class).listaTodos();
	}
	
	// Temporada que sera redirecionada
	private Temporada temporadaSelecionada;

    public Temporada getTemporadaSelecionada() {
        return temporadaSelecionada;
    }

    public void setTemporadaSelecionada(Temporada temporadaSelecionada) {
        this.temporadaSelecionada = temporadaSelecionada;
    }
	
	// Método para redirecionar para simulador.xhtml com a temporada selecionada
    public void redirecionarParaSimulador() {
        FacesContext context = FacesContext.getCurrentInstance();

        // Verifica se uma temporada foi selecionada
        if (temporadaSelecionada != null) {
            // Armazena a temporada selecionada na sessão ou em um escopo apropriado
            context.getExternalContext().getSessionMap().put("temporadaSelecionada", temporadaSelecionada);

            // Redireciona para simulador.xhtml
            try {
                context.getExternalContext().redirect("simulador.xhtml");
            } catch (IOException e) {
                e.printStackTrace(); // Trate a exceção, se necessário
            }
        } else {
            // Caso não tenha temporada selecionada, exibe uma mensagem ou toma outra ação
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Nenhuma temporada selecionada!"));
        }
    }
}
