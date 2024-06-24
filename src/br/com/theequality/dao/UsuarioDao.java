package br.com.theequality.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.theequality.modelo.Usuario;

public class UsuarioDao {

    public boolean existe(Usuario usuario) {
        EntityManager em = new JPAUtil().getEntityManager();
        TypedQuery<Usuario> query = em.createQuery(
                "select u from Usuario u where u.email = :pEmail",
                Usuario.class);

        query.setParameter("pEmail", usuario.getEmail());

        try {
            Usuario resultado = query.getSingleResult();
            em.close();
            return resultado != null;
        } catch (NoResultException ex) {
            em.close();
            return false;
        }
    }

    public boolean verificaSenha(Usuario usuario) {
        EntityManager em = new JPAUtil().getEntityManager();
        TypedQuery<Usuario> query = em.createQuery(
                "select u from Usuario u where u.email = :pEmail",
                Usuario.class);

        query.setParameter("pEmail", usuario.getEmail());

        try {
            Usuario resultado = query.getSingleResult();
            em.close();
            return resultado.getSenha().equals(usuario.getSenha());
        } catch (NoResultException ex) {
            em.close();
            return false;
        }
    }
}