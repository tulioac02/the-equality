package br.com.theequality.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.theequality.dao.UsuarioDao;
import br.com.theequality.modelo.Usuario;

@ManagedBean
@ViewScoped
public class LoginBean {

    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }
    
    public String efetuaLogin() {
        System.out.println("Fazendo login do usuário " + this.usuario.getEmail());

        FacesContext context = FacesContext.getCurrentInstance();
        UsuarioDao usuarioDao = new UsuarioDao();
        boolean existe = usuarioDao.existe(this.usuario);

        if (existe) {
            boolean senhaCorreta = usuarioDao.verificaSenha(this.usuario);
            
            if (senhaCorreta) {
                context.getExternalContext().getSessionMap()
                        .put("usuarioLogado", this.usuario);

                return "index?faces-redirect=true";
            } else {
                context.getExternalContext().getFlash().setKeepMessages(true);
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Senha incorreta!"));

                return "login?faces-redirect=true";
            }
        }

        context.getExternalContext().getFlash().setKeepMessages(true);
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Usuário não encontrado!"));


        return "login?faces-redirect=true";
    }
    
    public String deslogar() {

        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().remove("usuarioLogado");

        return "index?faces-redirect=true";
    }
}
