package br.com.theequality.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Clube;
import br.com.theequality.util.Calculadora;

@ManagedBean
@ViewScoped
public class ClubeBean {
	private Clube clube = new Clube();

	private Integer clubeId;

	private List<Clube> clubes;
	
	public Clube getClube() {
		return clube;
	}

	public Integer getClubeId() {
		return clubeId;
	}

	public void setClubeId(Integer clubeId) {
		this.clubeId = clubeId;
	}


	public List<Clube> getClubes() {

		DAO<Clube> dao = new DAO<Clube>(Clube.class);

		if (this.clubes == null) {
			this.clubes = dao.listaTodos();
		}

		return clubes;
	}

	public void carregarClubePelaId() {
		this.clube = new DAO<Clube>(Clube.class).buscaPorId(clubeId);
	}

	public void gravar() {
        System.out.println("Gravando clube " + this.clube.getNome());

        FacesContext context = FacesContext.getCurrentInstance();

        DAO<Clube> dao = new DAO<Clube>(Clube.class);

        if (this.clube.getId() == null) {
            try {
            	Calculadora.recalcularMedias(clube);
                dao.adiciona(clube);
                clubes = dao.listaTodos();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Clube criado com sucesso!"));
            } catch (Exception e) {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Erro ao criar o clube!"));
            }
        } else {
            try {
            	Calculadora.recalcularMedias(clube);
                dao.atualiza(clube);
                clubes = dao.listaTodos();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Clube atualizado com sucesso!"));
            } catch (Exception e) {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Erro ao atualizar o clube!"));
            }
        }

        clube = new Clube();
    }

	public void remover(Clube clube) {
		System.out.println("Removendo clube " + clube.getNome());
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(!clube.getTemporadas().isEmpty()) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Clubes com temporadas cadastradas não podem ser removidos!"));
			return;
		}
		
		new DAO<Clube>(Clube.class).remove(clube);
	    clubes.remove(clube); //removendo da lista
	    clube = new Clube();
	    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Clube removido com sucesso!"));
	}
	
	public void carregar(Clube clube) {
		System.out.println("Carregando livro " + clube.getNome());
		this.clube = clube;
	}
	
	public void limpar() {
        this.clube.setCategoria(null);
        this.clube.setLocalizacao(null);
        this.clube.setNome(null);
    }
}
