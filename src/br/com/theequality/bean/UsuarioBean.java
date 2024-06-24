package br.com.theequality.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	
	private Integer usuarioId;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	public void carregarUsuarioPelaId() {
		this.usuario = new DAO<Usuario>(Usuario.class).buscaPorId(usuarioId);
	}
	
	public String gravar() {
		System.out.println("Gravando usuario " + usuario.getNome());
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		if(this.usuario.getId() == null) {
			new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
		} else {
			new DAO<Usuario>(Usuario.class).atualiza(this.usuario);
			context.getExternalContext().getFlash().setKeepMessages(true);
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário atualizado com sucesso!"));
			return "usuario?faces-redirect=true";
		}
		
		this.usuario = new Usuario();
		
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário registrado com sucesso!"));
		return "usuario?faces-redirect=true";
	}
	
	public void remover(Usuario usuario) {
		System.out.println("Removendo usuario " + usuario.getNome());
		FacesContext context = FacesContext.getCurrentInstance();
	    context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuário removido com sucesso!"));
	    new DAO<Usuario>(Usuario.class).remove(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return new DAO<Usuario>(Usuario.class).listaTodos();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void limpar() {
        this.usuario.setNome(null);
        this.usuario.setEmail(null);
        this.usuario.setSenha(null);
    }
	
}
