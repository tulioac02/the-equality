package br.com.theequality.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.theequality.modelo.Usuario;

public class Autorizador implements PhaseListener {

    private static final long serialVersionUID = 1L;

    @Override
    public void afterPhase(PhaseEvent event) {

        FacesContext context = event.getFacesContext();
        String nomePagina = context.getViewRoot().getViewId();

        System.out.println(nomePagina);

        if ("/usuario.xhtml".equals(nomePagina) || "/clube.xhtml".equals(nomePagina) || "/temporada.xhtml".equals(nomePagina)) {
            // Página necessita de autenticação
            Usuario usuarioLogado = (Usuario) context.getExternalContext().getSessionMap().get("usuarioLogado");

            if(usuarioLogado != null) {
                // Usuário autenticado, permite o acesso
                return;
            }

            NavigationHandler handler = context.getApplication().getNavigationHandler();
            handler.handleNavigation(context, null, "/login?faces-redirect=true");

            context.renderResponse();        
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}