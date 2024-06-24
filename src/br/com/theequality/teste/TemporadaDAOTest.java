package br.com.theequality.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Temporada;

public class TemporadaDAOTest {
    public static void main(String[] args) {
    	List<Temporada> todasTemporadas = new DAO<Temporada>(Temporada.class).listaTodos();
	    if (todasTemporadas == null || todasTemporadas.isEmpty()) {
	        // Se a lista de temporadas for nula ou vazia, inicializa os contadores com 0.
	        todasTemporadas = new ArrayList<>();
	    }

	    // Contadores para cada intervalo de jogos
	    long menosDe40 = todasTemporadas.stream().filter(t -> t.getNumeroTotaldeJogos() < 40).count();
	    long entre40e60 = todasTemporadas.stream().filter(t -> t.getNumeroTotaldeJogos() >= 40 && t.getNumeroTotaldeJogos() < 60).count();
	    long sessentaOuMais = todasTemporadas.stream().filter(t -> t.getNumeroTotaldeJogos() >= 60).count();
	    
	    System.out.println(menosDe40);
	    System.out.println(entre40e60);
	    System.out.println(sessentaOuMais);
    }
}
