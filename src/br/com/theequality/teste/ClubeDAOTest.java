package br.com.theequality.teste;

import java.util.List;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Clube;

public class ClubeDAOTest {
    public static void main(String[] args) {
        DAO<Clube> dao = new DAO<>(Clube.class);
        List<Clube> clubes = dao.listaTodos();
        
        if (clubes != null && !clubes.isEmpty()) {
            System.out.println("Clubes carregados com sucesso:");
            for (Clube clube : clubes) {
                System.out.println("Clube: " + clube.getNome());
            }
        } else {
            System.out.println("Nenhum clube encontrado ou erro ao carregar clubes.");
        }
    }
}
