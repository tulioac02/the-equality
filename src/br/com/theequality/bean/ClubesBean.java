package br.com.theequality.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Clube;

@ManagedBean
@ViewScoped
public class ClubesBean {
	
	private List<Clube> clubes;

	public List<Clube> getClubes() {
		
		DAO<Clube> dao = new DAO<Clube>(Clube.class);
		
		if (this.clubes == null) {
			this.clubes = dao.listaTodos();
		}
		
		return clubes;
	}
}
