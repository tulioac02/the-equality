package br.com.theequality.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.theequality.modelo.Categoria;
import br.com.theequality.modelo.Clube;
import br.com.theequality.modelo.Temporada;

public class PopulaBanco {
	public static void main(String[] args) {
		
		//Cria a variável dao para persistir objetos do tipo clube
		DAO<Clube> clubeDao = new DAO<Clube>(Clube.class);
		
		//Cria a variável dao para persistir objetos do tipo temporada
		DAO<Temporada> temporadaDao = new DAO<Temporada>(Temporada.class);
		
		// Instanciando variaveis do tipo String
		String string_temp_01_antes;
		String string_temp_01_inicio;
		String string_temp_01_final;
		String string_temp_02_inicio;
		String string_temp_02_final;
		String string_temp_03_inicio;
		String string_temp_03_final;
		String string_temp_04_inicio;
		String string_temp_04_final;
		String string_temp_05_inicio;
		String string_temp_05_final;
		String string_temp_06_inicio;
		String string_temp_06_final;
		String string_temp_07_inicio;
		String string_temp_07_final;
		String string_temp_08_inicio;
		String string_temp_08_final;
		String string_temp_09_antes;
		String string_temp_09_inicio;
		String string_temp_09_final;
		String string_temp_10_inicio;
		String string_temp_10_final;
		
		// Instanciando variáveis do tipo Date
		Date temp_01_antes = null;
		Date temp_01_inicio = null;
		Date temp_01_final = null;
		Date temp_02_inicio = null;
		Date temp_02_final = null;
		Date temp_03_inicio = null;
		Date temp_03_final = null;
		Date temp_04_inicio = null;
		Date temp_04_final = null;
		Date temp_05_inicio = null;
		Date temp_05_final = null;
		Date temp_06_inicio = null;
		Date temp_06_final = null;
		Date temp_07_inicio = null;
		Date temp_07_final = null;
		Date temp_08_inicio = null;
		Date temp_08_final = null;
		Date temp_09_antes = null;
		Date temp_09_inicio = null;
		Date temp_09_final = null;
		Date temp_10_inicio = null;
		Date temp_10_final = null;
		
		// Criação de um SimpleDateFormat com o formato "dd/MM/yyyy"
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				
		// Criação e Persistência do Cruzeiro
		Clube cruzeiro = new Clube("Cruzeiro", "Minas Gerais", Categoria.BRASILEIRO);
		clubeDao.adiciona(cruzeiro);
					
		// Adicionando Datas das Temporadas do Cruzeiro
		string_temp_01_inicio = "05/02/2012";
		string_temp_01_final = "02/12/2012";
		string_temp_02_inicio = "03/02/2013";
		string_temp_02_final = "07/12/2013";
		string_temp_03_inicio = "26/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "27/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "29/01/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "19/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "06/11/2022";
		string_temp_10_inicio = "21/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "25/11/2021";
						
		// Convertendo Datas das Temporadas do Cruzeiro	
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
			
		//Criando Temporadas do Cruzeiro
		Temporada temporada_01_cruzeiro = new Temporada(cruzeiro, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 00, 00, 38, 05, 00, 00, 13);
		Temporada temporada_02_cruzeiro = new Temporada(cruzeiro, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38, 07, 00, 00, 15);
		Temporada temporada_03_cruzeiro = new Temporada(cruzeiro, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 10, 00, 38,  8, 00, 00, 15);
		Temporada temporada_04_cruzeiro = new Temporada(cruzeiro, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 10, 00, 38, 02, 00, 00, 13);
		Temporada temporada_05_cruzeiro = new Temporada(cruzeiro, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38, 11, 00, 03, 13);
		Temporada temporada_06_cruzeiro = new Temporada(cruzeiro, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 02, 00, 38, 14, 00, 05, 15);
		Temporada temporada_07_cruzeiro = new Temporada(cruzeiro, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 10, 00, 38,  8, 00, 00, 16);
		Temporada temporada_08_cruzeiro = new Temporada(cruzeiro, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00,  8, 00, 38, 06, 00, 00, 16);
		Temporada temporada_09_cruzeiro = new Temporada(cruzeiro, "2022", 02, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 00, 00, 38, 06, 00, 00, 14);
		Temporada temporada_10_cruzeiro = new Temporada(cruzeiro, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 00, 00, 38, 04, 00, 00, 10);
		
		//Persistindo temporadas do Cruzeiro
		temporadaDao.adiciona(temporada_01_cruzeiro);
		temporadaDao.adiciona(temporada_02_cruzeiro);
		temporadaDao.adiciona(temporada_03_cruzeiro);
		temporadaDao.adiciona(temporada_04_cruzeiro);
		temporadaDao.adiciona(temporada_05_cruzeiro);
		temporadaDao.adiciona(temporada_06_cruzeiro);
		temporadaDao.adiciona(temporada_07_cruzeiro);
		temporadaDao.adiciona(temporada_08_cruzeiro);
		temporadaDao.adiciona(temporada_09_cruzeiro);
		temporadaDao.adiciona(temporada_10_cruzeiro);
		
		clubeDao.atualiza(cruzeiro);
		
		// Criação e Persistência do Atlético
		Clube atletico = new Clube("Atlético", "Minas Gerais", Categoria.BRASILEIRO);
		clubeDao.adiciona(atletico);
		
		// Adicionando Datas das Temporadas do Atlético
		string_temp_01_inicio = "29/01/2012";
		string_temp_01_final = "12/12/2012";
		string_temp_02_inicio = "03/02/2013";
		string_temp_02_final = "21/12/2013";
		string_temp_03_inicio = "29/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "27/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "28/01/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "18/01/2018";
		string_temp_07_final = "01/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "21/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "15/12/2021";
		
		// Convertendo Datas das Temporadas do Atlético
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Criando temporadas do Atletico
		Temporada temporada_01_atletico = new Temporada(atletico, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 00, 00, 38, 04, 00, 00, 15);
		Temporada temporada_02_atletico = new Temporada(atletico, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 02, 14, 00, 38, 02, 00, 00, 15);
		Temporada temporada_03_atletico = new Temporada(atletico, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00,  8, 02, 38,  8, 00, 00, 15);
		Temporada temporada_04_atletico = new Temporada(atletico, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00,  8, 00, 38, 02, 00, 00, 15);
		Temporada temporada_05_atletico = new Temporada(atletico, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 10, 00, 38,  8, 00, 03, 15);
		Temporada temporada_06_atletico = new Temporada(atletico, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 04, 00, 38,  8, 00, 06, 15);
		Temporada temporada_07_atletico = new Temporada(atletico, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 02, 00, 38,  8, 00, 00, 16);
		Temporada temporada_08_atletico = new Temporada(atletico, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 18, 00, 38, 04, 00, 00, 16);
		Temporada temporada_09_atletico = new Temporada(atletico, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 10, 00, 38, 04, 01, 00, 14);
		Temporada temporada_10_atletico = new Temporada(atletico, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 12, 00, 38, 04, 00, 00, 12);
		
		//Persistindo temporadas do Atletico
		temporadaDao.adiciona(temporada_01_atletico);
		temporadaDao.adiciona(temporada_02_atletico);
		temporadaDao.adiciona(temporada_03_atletico);
		temporadaDao.adiciona(temporada_04_atletico);
		temporadaDao.adiciona(temporada_05_atletico);
		temporadaDao.adiciona(temporada_06_atletico);
		temporadaDao.adiciona(temporada_07_atletico);
		temporadaDao.adiciona(temporada_08_atletico);
		temporadaDao.adiciona(temporada_09_atletico);
		temporadaDao.adiciona(temporada_10_atletico);
		
		clubeDao.atualiza(atletico);
		
		// Criação e Persistência do Flamengo
		Clube flamengo = new Clube("Flamengo", "Rio de Janeiro", Categoria.BRASILEIRO);
		clubeDao.adiciona(flamengo);
				
		// Adicionando Datas das Temporadas do Flamengo
		string_temp_01_inicio = "21/01/2012";
		string_temp_01_final = "01/12/2012";
		string_temp_02_inicio = "19/01/2013";
		string_temp_02_final = "07/12/2013";
		string_temp_03_inicio = "19/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "31/01/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "27/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "28/01/2017";
		string_temp_06_final = "13/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "01/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "21/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "12/11/2022";
		string_temp_10_inicio = "12/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
		
		// Convertendo Datas das Temporadas do Flamengo
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Flamengo	
		Temporada temporada_01_flamengo = new Temporada(flamengo, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00,  8, 00, 38, 00, 00, 00, 17);
		Temporada temporada_02_flamengo = new Temporada(flamengo, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38, 14, 00, 00, 16);
		Temporada temporada_03_flamengo = new Temporada(flamengo, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 06, 00, 38, 06, 00, 00, 19);
		Temporada temporada_04_flamengo = new Temporada(flamengo, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 07, 00, 00, 17);
		Temporada temporada_05_flamengo = new Temporada(flamengo, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 04, 00, 38, 04, 00, 04, 16);
		Temporada temporada_06_flamengo = new Temporada(flamengo, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 16, 00, 38,  8, 00, 04, 17);
		Temporada temporada_07_flamengo = new Temporada(flamengo, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00,  8, 00, 38, 06, 00, 00, 15);
		Temporada temporada_08_flamengo = new Temporada(flamengo, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 02, 13, 00, 38, 04, 00, 00, 17);
		Temporada temporada_09_flamengo = new Temporada(flamengo, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 13, 00, 38, 10, 01, 00, 15);
		Temporada temporada_10_flamengo = new Temporada(flamengo, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 02,  8, 02, 38, 10, 01, 00, 15);
		
		//Persistindo temporadas do Flamengo
		temporadaDao.adiciona(temporada_01_flamengo);
		temporadaDao.adiciona(temporada_02_flamengo);
		temporadaDao.adiciona(temporada_03_flamengo);
		temporadaDao.adiciona(temporada_04_flamengo);
		temporadaDao.adiciona(temporada_05_flamengo);
		temporadaDao.adiciona(temporada_06_flamengo);
		temporadaDao.adiciona(temporada_07_flamengo);
		temporadaDao.adiciona(temporada_08_flamengo);
		temporadaDao.adiciona(temporada_09_flamengo);
		temporadaDao.adiciona(temporada_10_flamengo);
		
		clubeDao.atualiza(flamengo);
		
		// Criação e Persistência do Vasco
		Clube vasco = new Clube("Vasco", "Rio de Janeiro", Categoria.BRASILEIRO);
		clubeDao.adiciona(vasco);
		
		// Adicionando Datas das Temporadas do Vasco
		string_temp_01_inicio = "22/01/2012";
		string_temp_01_final = "02/12/2012";
		string_temp_02_inicio = "19/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "18/01/2014";
		string_temp_03_final = "29/11/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "31/01/2016";
		string_temp_05_final = "26/11/2016";
		string_temp_06_inicio = "29/01/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "18/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "19/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "06/11/2022";
		string_temp_10_inicio = "14/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "28/11/2021";
			
		// Convertendo Datas das Temporadas do Vasco
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Vasco	
		Temporada temporada_01_vasco = new Temporada(vasco, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 10, 00, 38, 00, 00, 00, 19);
		Temporada temporada_02_vasco = new Temporada(vasco, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38, 04, 00, 00, 17);
		Temporada temporada_03_vasco = new Temporada(vasco, "2014", 02, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 00, 00, 38,  8, 00, 00, 19);
		Temporada temporada_04_vasco = new Temporada(vasco, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 10, 00, 00, 19);
		Temporada temporada_05_vasco = new Temporada(vasco, "2016", 02, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38,  8, 00, 00, 18);
		Temporada temporada_06_vasco = new Temporada(vasco, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 00, 00, 38, 04, 00, 00, 15);
		Temporada temporada_07_vasco = new Temporada(vasco, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 12, 00, 38, 02, 00, 00, 15);
		Temporada temporada_08_vasco = new Temporada(vasco, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 00, 00, 38, 06, 00, 00, 18);
		Temporada temporada_09_vasco = new Temporada(vasco, "2022", 02, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 00, 00, 38, 02, 00, 00, 13);
		Temporada temporada_10_vasco = new Temporada(vasco, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 00, 00, 38, 02, 00, 00, 13);
		
		//Persistindo temporadas do Vasco
		temporadaDao.adiciona(temporada_01_vasco);
		temporadaDao.adiciona(temporada_02_vasco);
		temporadaDao.adiciona(temporada_03_vasco);
		temporadaDao.adiciona(temporada_04_vasco);
		temporadaDao.adiciona(temporada_05_vasco);
		temporadaDao.adiciona(temporada_06_vasco);
		temporadaDao.adiciona(temporada_07_vasco);
		temporadaDao.adiciona(temporada_08_vasco);
		temporadaDao.adiciona(temporada_09_vasco);
		temporadaDao.adiciona(temporada_10_vasco);
		
		clubeDao.atualiza(vasco);
		
		// Criação e Persistência do Fluminense
		Clube fluminense = new Clube("Fluminense", "Rio de Janeiro", Categoria.BRASILEIRO);
		clubeDao.adiciona(fluminense);
		
		// Adicionando Datas das Temporadas do Fluminense
		string_temp_01_inicio = "21/01/2012";
		string_temp_01_final = "02/12/2012";
		string_temp_02_inicio = "20/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "18/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "27/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "24/01/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "19/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "27/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "14/01/2023";
		string_temp_10_final = "22/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
		
		// Convertendo Datas das Temporadas do Fluminense
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Fluminense
		Temporada temporada_01_fluminense = new Temporada(fluminense, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 10, 00, 38, 00, 00, 00, 21);
		Temporada temporada_02_fluminense = new Temporada(fluminense, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 10, 00, 38, 02, 00, 00, 18);
		Temporada temporada_03_fluminense = new Temporada(fluminense, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 02, 00, 38, 05, 00, 00, 17);
		Temporada temporada_04_fluminense = new Temporada(fluminense, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 06, 00, 00, 17);
		Temporada temporada_05_fluminense = new Temporada(fluminense, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38, 07, 00, 05, 16);
		Temporada temporada_06_fluminense = new Temporada(fluminense, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00,  8, 00, 38,  8, 00, 04, 17);
		Temporada temporada_07_fluminense = new Temporada(fluminense, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 10, 00, 38, 04, 00, 00, 14);
		Temporada temporada_08_fluminense = new Temporada(fluminense, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00,  8, 00, 38,  8, 00, 00, 15);
		Temporada temporada_09_fluminense = new Temporada(fluminense, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 10, 00, 38,  8, 00, 00, 15);
		Temporada temporada_10_fluminense = new Temporada(fluminense, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 02, 13, 00, 38, 04, 00, 00, 15);
		
		//Persistindo temporadas do Fluminense
		temporadaDao.adiciona(temporada_01_fluminense);
		temporadaDao.adiciona(temporada_02_fluminense);
		temporadaDao.adiciona(temporada_03_fluminense);
		temporadaDao.adiciona(temporada_04_fluminense);
		temporadaDao.adiciona(temporada_05_fluminense);
		temporadaDao.adiciona(temporada_06_fluminense);
		temporadaDao.adiciona(temporada_07_fluminense);
		temporadaDao.adiciona(temporada_08_fluminense);
		temporadaDao.adiciona(temporada_09_fluminense);
		temporadaDao.adiciona(temporada_10_fluminense);
		
		clubeDao.atualiza(fluminense);
		
		// Criação e Persistência do Botafogo
		Clube botafogo = new Clube("Botafogo", "Rio de Janeiro", Categoria.BRASILEIRO);
		clubeDao.adiciona(botafogo);
		
		// Adicionando Datas das Temporadas do Botafogo
		string_temp_01_inicio = "22/01/2012";
		string_temp_01_final = "01/12/2012";
		string_temp_02_inicio = "20/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "18/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "31/01/2015";
		string_temp_04_final = "28/11/2015";
		string_temp_05_inicio = "30/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "25/01/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "16/01/2018";
		string_temp_07_final = "01/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "25/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "15/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "28/11/2021";
			
		// Convertendo Datas das Temporadas do Botafogo
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Botafogo
		Temporada temporada_01_botafogo = new Temporada(botafogo, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 02, 00, 38, 06, 00, 00, 20);
		Temporada temporada_02_botafogo = new Temporada(botafogo, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38, 10, 00, 00, 19);
		Temporada temporada_03_botafogo = new Temporada(botafogo, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00,  8, 00, 38, 04, 00, 00, 15);
		Temporada temporada_04_botafogo = new Temporada(botafogo, "2015", 02, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 06, 00, 00, 19);
		Temporada temporada_05_botafogo = new Temporada(botafogo, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38,  8, 00, 00, 18);
		Temporada temporada_06_botafogo = new Temporada(botafogo, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 14, 00, 38, 06, 00, 00, 14);
		Temporada temporada_07_botafogo = new Temporada(botafogo, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 06, 00, 38, 01, 00, 00, 17);
		Temporada temporada_08_botafogo = new Temporada(botafogo, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 06, 00, 38, 04, 00, 00, 11);
		Temporada temporada_09_botafogo = new Temporada(botafogo, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 00, 00, 38, 04, 00, 00, 13);
		Temporada temporada_10_botafogo = new Temporada(botafogo, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 12, 00, 38, 06, 00, 00, 15);
		
		//Persistindo temporadas do Botafogo
		temporadaDao.adiciona(temporada_01_botafogo);
		temporadaDao.adiciona(temporada_02_botafogo);
		temporadaDao.adiciona(temporada_03_botafogo);
		temporadaDao.adiciona(temporada_04_botafogo);
		temporadaDao.adiciona(temporada_05_botafogo);
		temporadaDao.adiciona(temporada_06_botafogo);
		temporadaDao.adiciona(temporada_07_botafogo);
		temporadaDao.adiciona(temporada_08_botafogo);
		temporadaDao.adiciona(temporada_09_botafogo);
		temporadaDao.adiciona(temporada_10_botafogo);
		
		clubeDao.atualiza(botafogo);
			
		// Criação e Persistência do Grêmio
		Clube gremio = new Clube("Grêmio", "Rio Grande do Sul", Categoria.BRASILEIRO);
		clubeDao.adiciona(gremio);
		
		// Adicionando Datas das Temporadas do Grêmio
		string_temp_01_inicio = "21/01/2012";
		string_temp_01_final = "02/12/2012";
		string_temp_02_inicio = "20/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "19/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "31/01/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "28/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "02/02/2017";
		string_temp_06_final = "16/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "06/11/2022";
		string_temp_10_inicio = "17/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
				
		// Convertendo Datas das Temporadas do Grêmio
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Gremio
		Temporada temporada_01_gremio = new Temporada(gremio, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 06, 00, 38, 10, 00, 00, 20);
		Temporada temporada_02_gremio = new Temporada(gremio, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 10, 00, 38, 06, 00, 00, 18);
		Temporada temporada_03_gremio = new Temporada(gremio, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00,  8, 00, 38, 01, 00, 00, 19);
		Temporada temporada_04_gremio = new Temporada(gremio, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38,  9, 00, 00, 20);
		Temporada temporada_05_gremio = new Temporada(gremio, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00,  8, 00, 38,  8, 00, 03, 16);
		Temporada temporada_06_gremio = new Temporada(gremio, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 02, 14, 00, 38, 06, 00, 04, 15);
		Temporada temporada_07_gremio = new Temporada(gremio, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 12, 02, 38, 04, 00, 00, 17);
		Temporada temporada_08_gremio = new Temporada(gremio, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 12, 00, 38, 06, 00, 00, 17);
		Temporada temporada_09_gremio = new Temporada(gremio, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 00, 00, 38, 01, 00, 00, 16);
		Temporada temporada_10_gremio = new Temporada(gremio, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 00, 00, 38, 10, 00, 00, 16);
		
		//Persistindo temporadas do Gremio
		temporadaDao.adiciona(temporada_01_gremio);
		temporadaDao.adiciona(temporada_02_gremio);
		temporadaDao.adiciona(temporada_03_gremio);
		temporadaDao.adiciona(temporada_04_gremio);
		temporadaDao.adiciona(temporada_05_gremio);
		temporadaDao.adiciona(temporada_06_gremio);
		temporadaDao.adiciona(temporada_07_gremio);
		temporadaDao.adiciona(temporada_08_gremio);
		temporadaDao.adiciona(temporada_09_gremio);
		temporadaDao.adiciona(temporada_10_gremio);
		
		clubeDao.atualiza(gremio);
		
		// Criação e Persistência do Internacional
		Clube internacional = new Clube("Internacional", "Rio Grande do Sul", Categoria.BRASILEIRO);
		clubeDao.adiciona(internacional);
			
		// Adicionando Datas das Temporadas do Internacional
		string_temp_01_inicio = "18/01/2012";
		string_temp_01_final = "02/12/2012";
		string_temp_02_inicio = "19/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "13/01/2014";
		string_temp_03_final = "06/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "27/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "29/01/2017";
		string_temp_06_final = "25/11/2017";
		string_temp_07_inicio = "18/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "21/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
			
		// Convertendo Datas das Temporadas do Internacional
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Internacional
		Temporada temporada_01_internacional = new Temporada(internacional, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 10, 00, 38, 00, 00, 00, 21);
		Temporada temporada_02_internacional = new Temporada(internacional, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38,  9, 00, 00, 21);
		Temporada temporada_03_internacional = new Temporada(internacional, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 02, 00, 38, 05, 00, 00, 20);
		Temporada temporada_04_internacional = new Temporada(internacional, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 12, 00, 38, 04, 00, 00, 20);
		Temporada temporada_05_internacional = new Temporada(internacional, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38, 06, 00, 04, 18);
		Temporada temporada_06_internacional = new Temporada(internacional, "2017", 02, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 00, 00, 38,  8, 00, 04, 17);
		Temporada temporada_07_internacional = new Temporada(internacional, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 00, 00, 38, 06, 00, 00, 13);
		Temporada temporada_08_internacional = new Temporada(internacional, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 10, 00, 38,  8, 00, 00, 17);
		Temporada temporada_09_internacional = new Temporada(internacional, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 10, 00, 38, 01, 00, 00, 13);
		Temporada temporada_10_internacional = new Temporada(internacional, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 12, 00, 38, 04, 00, 00, 13);
		
		//Persistindo temporadas do Internacional
		temporadaDao.adiciona(temporada_01_internacional);
		temporadaDao.adiciona(temporada_02_internacional);
		temporadaDao.adiciona(temporada_03_internacional);
		temporadaDao.adiciona(temporada_04_internacional);
		temporadaDao.adiciona(temporada_05_internacional);
		temporadaDao.adiciona(temporada_06_internacional);
		temporadaDao.adiciona(temporada_07_internacional);
		temporadaDao.adiciona(temporada_08_internacional);
		temporadaDao.adiciona(temporada_09_internacional);
		temporadaDao.adiciona(temporada_10_internacional);
		
		clubeDao.atualiza(internacional);
		
		// Criação e Persistência do São Paulo
		Clube saoPaulo = new Clube("São Paulo", "São Paulo", Categoria.BRASILEIRO);
		clubeDao.adiciona(saoPaulo);
		
		// Adicionando Datas das Temporadas do São Paulo
		string_temp_01_inicio = "22/01/2012";
		string_temp_01_final = "12/12/2012";
		string_temp_02_inicio = "19/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "19/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "30/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "05/02/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "19/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "27/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "15/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
				
		// Convertendo Datas das Temporadas do São Paulo
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}

		// Adicionando Temporadas do São Paulo
		Temporada temporada_01_saoPaulo = new Temporada(saoPaulo, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 10, 00, 38,  9, 00, 00, 21);
		Temporada temporada_02_saoPaulo = new Temporada(saoPaulo, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 01, 16, 02, 38, 00, 00, 00, 21);
		Temporada temporada_03_saoPaulo = new Temporada(saoPaulo, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00,  8, 00, 38, 06, 00, 00, 16);
		Temporada temporada_04_saoPaulo = new Temporada(saoPaulo, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00,  8, 00, 38, 06, 00, 00, 17);
		Temporada temporada_05_saoPaulo = new Temporada(saoPaulo, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 14, 00, 38, 02, 00, 00, 16);
		Temporada temporada_06_saoPaulo = new Temporada(saoPaulo, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 02, 00, 38, 06, 00, 00, 16);
		Temporada temporada_07_saoPaulo = new Temporada(saoPaulo, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 04, 00, 38, 06, 00, 00, 16);
		Temporada temporada_08_saoPaulo = new Temporada(saoPaulo, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 02, 00, 38, 02, 00, 00, 18);
		Temporada temporada_09_saoPaulo = new Temporada(saoPaulo, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 13, 00, 38, 10, 00, 00, 16);
		Temporada temporada_10_saoPaulo = new Temporada(saoPaulo, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 10, 00, 38, 10, 00, 00, 13);
		
		//Persistindo temporadas do São Paulo
		temporadaDao.adiciona(temporada_01_saoPaulo);
		temporadaDao.adiciona(temporada_02_saoPaulo);
		temporadaDao.adiciona(temporada_03_saoPaulo);
		temporadaDao.adiciona(temporada_04_saoPaulo);
		temporadaDao.adiciona(temporada_05_saoPaulo);
		temporadaDao.adiciona(temporada_06_saoPaulo);
		temporadaDao.adiciona(temporada_07_saoPaulo);
		temporadaDao.adiciona(temporada_08_saoPaulo);
		temporadaDao.adiciona(temporada_09_saoPaulo);
		temporadaDao.adiciona(temporada_10_saoPaulo);
		
		clubeDao.atualiza(saoPaulo);
		
		// Criação e Persistência do Santos
		Clube santos = new Clube("Santos", "São Paulo", Categoria.BRASILEIRO);
		clubeDao.adiciona(santos);
		
		// Adicionando Datas das Temporadas do Santos
		string_temp_01_inicio = "21/01/2012";
		string_temp_01_final = "01/12/2012";
		string_temp_02_inicio = "19/01/2013";
		string_temp_02_final = "08/12/2013";
		string_temp_03_inicio = "18/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "30/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "03/02/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "19/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "26/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "14/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "18/12/2011";
		string_temp_09_antes = "09/12/2021";
		
		// Convertendo Datas das Temporadas do Santos
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Santos
		Temporada temporada_01_santos = new Temporada(santos, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 12, 02, 38, 00, 00, 00, 23);
		Temporada temporada_02_santos = new Temporada(santos, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00, 00, 00, 38,  8, 00, 00, 23);
		Temporada temporada_03_santos = new Temporada(santos, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 00, 00, 38, 11, 00, 00, 19);
		Temporada temporada_04_santos = new Temporada(santos, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 14, 00, 00, 19);
		Temporada temporada_05_santos = new Temporada(santos, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 00, 00, 38,  9, 00, 00, 19);
		Temporada temporada_06_santos = new Temporada(santos, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 10, 00, 38, 04, 00, 00, 14);
		Temporada temporada_07_santos = new Temporada(santos, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00,  8, 00, 38, 04, 00, 00, 16);
		Temporada temporada_08_santos = new Temporada(santos, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 02, 00, 38,  8, 00, 00, 16);
		Temporada temporada_09_santos = new Temporada(santos, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00,  8, 00, 38, 06, 00, 00, 12);
		Temporada temporada_10_santos = new Temporada(santos, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 06, 00, 38, 06, 00, 00, 12);
		
		//Persistindo temporadas do Santos
		temporadaDao.adiciona(temporada_01_santos);
		temporadaDao.adiciona(temporada_02_santos);
		temporadaDao.adiciona(temporada_03_santos);
		temporadaDao.adiciona(temporada_04_santos);
		temporadaDao.adiciona(temporada_05_santos);
		temporadaDao.adiciona(temporada_06_santos);
		temporadaDao.adiciona(temporada_07_santos);
		temporadaDao.adiciona(temporada_08_santos);
		temporadaDao.adiciona(temporada_09_santos);
		temporadaDao.adiciona(temporada_10_santos);
		
		clubeDao.atualiza(santos);
		
		// Criação e Persistência do Palmeiras
		Clube palmeiras = new Clube("Palemiras", "São Paulo", Categoria.BRASILEIRO);
		clubeDao.adiciona(palmeiras);
		
		// Adicionando Datas das Temporadas do Palmeiras
		string_temp_01_inicio = "22/01/2012";
		string_temp_01_final = "01/12/2012";
		string_temp_02_inicio = "20/01/2013";
		string_temp_02_final = "30/11/2013";
		string_temp_03_inicio = "18/01/2014";
		string_temp_03_final = "07/12/2014";
		string_temp_04_inicio = "31/01/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "31/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "05/02/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "18/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "23/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "14/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
		
		// Convertendo Datas das Temporadas do Palmeiras
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do Palmeiras
		Temporada temporada_01_palmeiras = new Temporada(palmeiras, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 00, 04, 00, 38, 11, 00, 00, 20);
		Temporada temporada_02_palmeiras = new Temporada(palmeiras, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00,  8, 00, 38, 02, 00, 00, 20);
		Temporada temporada_03_palmeiras = new Temporada(palmeiras, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 00, 00, 38,  8, 00, 00, 17);
		Temporada temporada_04_palmeiras = new Temporada(palmeiras, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 00, 00, 38, 13, 00, 00, 19);
		Temporada temporada_05_palmeiras = new Temporada(palmeiras, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00, 06, 00, 38, 04, 00, 00, 17);
		Temporada temporada_06_palmeiras = new Temporada(palmeiras, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00,  8, 00, 38, 04, 00, 00, 16);
		Temporada temporada_07_palmeiras = new Temporada(palmeiras, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00, 12, 00, 38, 06, 00, 00, 18);
		Temporada temporada_08_palmeiras = new Temporada(palmeiras, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 10, 00, 38, 04, 00, 00, 16);
		Temporada temporada_09_palmeiras = new Temporada(palmeiras, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 02, 12, 02, 38, 04, 00, 00, 16);
		Temporada temporada_10_palmeiras = new Temporada(palmeiras, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 12, 00, 38, 06, 01, 00, 16);
		
		//Persistindo temporadas do Palmeiras
		temporadaDao.adiciona(temporada_01_palmeiras);
		temporadaDao.adiciona(temporada_02_palmeiras);
		temporadaDao.adiciona(temporada_03_palmeiras);
		temporadaDao.adiciona(temporada_04_palmeiras);
		temporadaDao.adiciona(temporada_05_palmeiras);
		temporadaDao.adiciona(temporada_06_palmeiras);
		temporadaDao.adiciona(temporada_07_palmeiras);
		temporadaDao.adiciona(temporada_08_palmeiras);
		temporadaDao.adiciona(temporada_09_palmeiras);
		temporadaDao.adiciona(temporada_10_palmeiras);
		
		clubeDao.atualiza(palmeiras);
		
		// Criação e Persistência do Corinthians
		Clube corinthians = new Clube("Corinthians", "São Paulo", Categoria.BRASILEIRO);
		clubeDao.adiciona(corinthians);
		
		// Adicionando Datas das Temporadas do Corinthians
		string_temp_01_inicio = "21/01/2012";
		string_temp_01_final = "16/12/2012";
		string_temp_02_inicio = "20/01/2013";
		string_temp_02_final = "07/12/2013";
		string_temp_03_inicio = "19/01/2014";
		string_temp_03_final = "06/12/2014";
		string_temp_04_inicio = "01/02/2015";
		string_temp_04_final = "06/12/2015";
		string_temp_05_inicio = "31/01/2016";
		string_temp_05_final = "11/12/2016";
		string_temp_06_inicio = "04/02/2017";
		string_temp_06_final = "03/12/2017";
		string_temp_07_inicio = "17/01/2018";
		string_temp_07_final = "02/12/2018";
		string_temp_08_inicio = "20/01/2019";
		string_temp_08_final = "08/12/2019";
		string_temp_09_inicio = "25/01/2022";
		string_temp_09_final = "13/11/2022";
		string_temp_10_inicio = "15/01/2023";
		string_temp_10_final = "06/12/2023";
		
		string_temp_01_antes = "04/12/2011";
		string_temp_09_antes = "09/12/2021";
		
		// Convertendo Datas das Temporadas do Corinthians
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
		
		// Adicionando Temporadas do
		Temporada temporada_01_corinthians = new Temporada(corinthians, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, 00, 02, 14, 00, 38, 00, 00, 00, 20);
		Temporada temporada_02_corinthians = new Temporada(corinthians, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, 21, 00,  8, 02, 38, 04, 00, 00, 23);
		Temporada temporada_03_corinthians = new Temporada(corinthians, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, 39, 00, 00, 00, 38,  8, 00, 00, 15);
		Temporada temporada_04_corinthians = new Temporada(corinthians, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, 00, 00, 10, 00, 38, 02, 00, 00, 17);
		Temporada temporada_05_corinthians = new Temporada(corinthians, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, 00, 00,  8, 00, 38, 04, 00, 00, 17);
		Temporada temporada_06_corinthians = new Temporada(corinthians, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, 00, 00, 06, 00, 38, 06, 00, 00, 18);
		Temporada temporada_07_corinthians = new Temporada(corinthians, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, 32, 00,  8, 00, 38,  8, 00, 00, 18);
		Temporada temporada_08_corinthians = new Temporada(corinthians, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, 27, 00, 10, 00, 38,  8, 00, 00, 18);
		Temporada temporada_09_corinthians = new Temporada(corinthians, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, 00, 00, 10, 00, 38, 10, 00, 00, 14);
		Temporada temporada_10_corinthians = new Temporada(corinthians, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, 00, 00, 14, 00, 38,  8, 00, 00, 13);
		
		//Persistindo temporadas do 
		temporadaDao.adiciona(temporada_01_corinthians);
		temporadaDao.adiciona(temporada_02_corinthians);
		temporadaDao.adiciona(temporada_03_corinthians);
		temporadaDao.adiciona(temporada_04_corinthians);
		temporadaDao.adiciona(temporada_05_corinthians);
		temporadaDao.adiciona(temporada_06_corinthians);
		temporadaDao.adiciona(temporada_07_corinthians);
		temporadaDao.adiciona(temporada_08_corinthians);
		temporadaDao.adiciona(temporada_09_corinthians);
		temporadaDao.adiciona(temporada_10_corinthians);
		
		clubeDao.atualiza(corinthians);
		
		// Criação e Persistência do Bayern de Munique
		Clube bayernDeMunique = new Clube("Bayern de Munique", "Alemanha", Categoria.EUROPEU);
		clubeDao.adiciona(bayernDeMunique);
		
		// Adicionando Datas das Temporadas do Bayern de Munique
		string_temp_01_inicio = "01/08/2011";
		string_temp_01_final = "14/05/2012";
		string_temp_02_inicio = "01/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "12/08/2013";
		string_temp_03_final = "01/06/2014";
		string_temp_04_inicio = "27/07/2014";
		string_temp_04_final = "17/05/2015";
		string_temp_05_inicio = "13/08/2015";
		string_temp_05_final = "23/05/2016";
		string_temp_06_inicio = "01/08/2016";
		string_temp_06_final = "21/05/2017";
		string_temp_07_inicio = "14/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "05/08/2018";
		string_temp_08_final = "19/05/2019";
		string_temp_09_inicio = "13/08/2021";
		string_temp_09_final = "14/05/2022";
		string_temp_10_inicio = "30/07/2022";
		string_temp_10_final = "27/05/2023";
		
		string_temp_01_antes = "14/05/2011";
		string_temp_09_antes = "22/05/2021";
		
		// Convertendo Datas das Temporadas do Bayern de Munique
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Bayern de Munique
		Temporada temporada_01_bayernDeMunique = new Temporada(bayernDeMunique, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 68, 00,  8, 00, 34, 05, 01);
		Temporada temporada_02_bayernDeMunique = new Temporada(bayernDeMunique, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 72, 00, 15, 00, 34, 06, 00);
		Temporada temporada_03_bayernDeMunique = new Temporada(bayernDeMunique, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 72, 00, 13, 00, 34, 06, 01);
		Temporada temporada_04_bayernDeMunique = new Temporada(bayernDeMunique, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 77, 02, 12, 01, 34, 06, 01);
		Temporada temporada_05_bayernDeMunique = new Temporada(bayernDeMunique, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 70, 00, 12, 00, 34, 05, 01);
		Temporada temporada_06_bayernDeMunique = new Temporada(bayernDeMunique, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 67, 00, 12, 00, 34, 06, 01);
		Temporada temporada_07_bayernDeMunique = new Temporada(bayernDeMunique, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 63, 00, 10, 00, 34, 05, 01);
		Temporada temporada_08_bayernDeMunique = new Temporada(bayernDeMunique, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 63, 00, 12, 00, 34, 06, 01);
		Temporada temporada_09_bayernDeMunique = new Temporada(bayernDeMunique, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 56, 00, 10, 00, 34, 02, 01);
		Temporada temporada_10_bayernDeMunique = new Temporada(bayernDeMunique, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 87, 00, 10, 00, 34, 04, 01);
		
		//Persistindo temporadas do Bayern de Munique
		temporadaDao.adiciona(temporada_01_bayernDeMunique);
		temporadaDao.adiciona(temporada_02_bayernDeMunique);
		temporadaDao.adiciona(temporada_03_bayernDeMunique);
		temporadaDao.adiciona(temporada_04_bayernDeMunique);
		temporadaDao.adiciona(temporada_05_bayernDeMunique);
		temporadaDao.adiciona(temporada_06_bayernDeMunique);
		temporadaDao.adiciona(temporada_07_bayernDeMunique);
		temporadaDao.adiciona(temporada_08_bayernDeMunique);
		temporadaDao.adiciona(temporada_09_bayernDeMunique);
		temporadaDao.adiciona(temporada_10_bayernDeMunique);
		
		clubeDao.atualiza(bayernDeMunique);
		
		// Criação e Persistência do Borussia Dortmund
		Clube borussiaDortmund = new Clube("Borussia Dortmund", "Alemanha", Categoria.EUROPEU);
		clubeDao.adiciona(borussiaDortmund);
		
		// Adicionando Datas das Temporadas do Borussia Dortmund
		string_temp_01_inicio = "23/07/2011";
		string_temp_01_final = "12/05/2012";
		string_temp_02_inicio = "12/08/2012";
		string_temp_02_final = "25/05/2013";
		string_temp_03_inicio = "27/07/2013";
		string_temp_03_final = "17/05/2014";
		string_temp_04_inicio = "13/08/2014";
		string_temp_04_final = "30/05/2015";
		string_temp_05_inicio = "30/07/2015";
		string_temp_05_final = "21/05/2016";
		string_temp_06_inicio = "14/08/2016";
		string_temp_06_final = "27/05/2017";
		string_temp_07_inicio = "05/08/2017";
		string_temp_07_final = "12/05/2018";
		string_temp_08_inicio = "20/08/2018";
		string_temp_08_final = "18/05/2019";
		string_temp_09_inicio = "07/08/2021";
		string_temp_09_final = "14/05/2022";
		string_temp_10_inicio = "29/07/2022";
		string_temp_10_final = "27/05/2023";
		
		string_temp_01_antes = "14/05/2011";
		string_temp_09_antes = "22/05/2021";
		
		// Convertendo Datas das Temporadas do Borussia Dortmund
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Borussia Dortmund
		Temporada temporada_01_borussiaDortmund = new Temporada(borussiaDortmund, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 68, 00, 06, 00, 34, 06, 01);
		Temporada temporada_02_borussiaDortmund = new Temporada(borussiaDortmund, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 72, 00, 13, 00, 34, 04, 01);
		Temporada temporada_03_borussiaDortmund = new Temporada(borussiaDortmund, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 72, 00, 10, 00, 34, 06, 01);
		Temporada temporada_04_borussiaDortmund = new Temporada(borussiaDortmund, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 77, 00,  8, 00, 34, 06, 01);
		Temporada temporada_05_borussiaDortmund = new Temporada(borussiaDortmund, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 70, 00, 16, 00, 34, 06, 00);
		Temporada temporada_06_borussiaDortmund = new Temporada(borussiaDortmund, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 67, 00, 10, 00, 34, 06, 01);
		Temporada temporada_07_borussiaDortmund = new Temporada(borussiaDortmund, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 63, 00, 10, 00, 34, 03, 01);
		Temporada temporada_08_borussiaDortmund = new Temporada(borussiaDortmund, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 63, 00,  8, 00, 34, 03, 00);
		Temporada temporada_09_borussiaDortmund = new Temporada(borussiaDortmund, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 56, 00,  8, 00, 34, 03, 01);
		Temporada temporada_10_borussiaDortmund = new Temporada(borussiaDortmund, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 87, 00,  8, 00, 34, 04, 00);
		
		//Persistindo temporadas do Borussia Dortmund
		temporadaDao.adiciona(temporada_01_borussiaDortmund);
		temporadaDao.adiciona(temporada_02_borussiaDortmund);
		temporadaDao.adiciona(temporada_03_borussiaDortmund);
		temporadaDao.adiciona(temporada_04_borussiaDortmund);
		temporadaDao.adiciona(temporada_05_borussiaDortmund);
		temporadaDao.adiciona(temporada_06_borussiaDortmund);
		temporadaDao.adiciona(temporada_07_borussiaDortmund);
		temporadaDao.adiciona(temporada_08_borussiaDortmund);
		temporadaDao.adiciona(temporada_09_borussiaDortmund);
		temporadaDao.adiciona(temporada_10_borussiaDortmund);
		
		clubeDao.atualiza(borussiaDortmund);
		
		// Criação e Persistência do Atletico de Madrid
		Clube atleticoDeMadrid = new Clube("Atletico de Madrid", "Espanha", Categoria.EUROPEU);
		clubeDao.adiciona(atleticoDeMadrid);
		
		// Adicionando Datas das Temporadas do Atletico de Madrid
		string_temp_01_inicio = "28/07/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "19/08/2012";
		string_temp_02_final = "01/06/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "24/05/2014";
		string_temp_04_inicio = "19/08/2014";
		string_temp_04_final = "23/05/2015";
		string_temp_05_inicio = "22/08/2015";
		string_temp_05_final = "28/05/2016";
		string_temp_06_inicio = "21/08/2016";
		string_temp_06_final = "21/05/2017";
		string_temp_07_inicio = "19/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "15/08/2018";
		string_temp_08_final = "18/05/2019";
		string_temp_09_inicio = "15/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "15/08/2022";
		string_temp_10_final = "04/05/2023";
		
		string_temp_01_antes = "21/05/2011";
		string_temp_09_antes = "22/05/2021";
			
		// Convertendo Datas das Temporadas do Atletico de Madrid
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Atletico de Madrid
		Temporada temporada_01_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 55, 00, 19, 00, 38, 02, 00);
		Temporada temporada_02_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 48, 00,  8, 01, 38,  9, 00);
		Temporada temporada_03_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 48, 00, 13, 00, 38,  8, 02);
		Temporada temporada_04_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 10, 00, 38, 06, 02);
		Temporada temporada_05_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 47, 00, 13, 00, 38, 06, 00);
		Temporada temporada_06_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 57, 00, 12, 00, 38,  8, 00);
		Temporada temporada_07_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 51, 00, 15, 00, 38, 06, 00);
		Temporada temporada_08_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 48, 00,  8, 01, 38, 04, 00);
		Temporada temporada_09_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 47, 00, 10, 00, 38, 02, 01);
		Temporada temporada_10_atleticoDeMadrid = new Temporada(atleticoDeMadrid, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 64, 00, 06, 00, 38, 05, 00);
		
		//Persistindo temporadas do Atletico de Madrid
		temporadaDao.adiciona(temporada_01_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_02_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_03_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_04_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_05_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_06_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_07_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_08_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_09_atleticoDeMadrid);
		temporadaDao.adiciona(temporada_10_atleticoDeMadrid);
		
		clubeDao.atualiza(atleticoDeMadrid);
		
		// Criação e Persistência do Barcelona
		Clube barcelona = new Clube("Barcelona", "Espanha", Categoria.EUROPEU);
		clubeDao.adiciona(barcelona);
		
		// Adicionando Datas das Temporadas do Barcelona
		string_temp_01_inicio = "14/08/2011";
		string_temp_01_final = "25/05/2012";
		string_temp_02_inicio = "19/08/2012";
		string_temp_02_final = "01/06/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "17/05/2014";
		string_temp_04_inicio = "24/08/2014";
		string_temp_04_final = "06/06/2015";
		string_temp_05_inicio = "11/08/2015";
		string_temp_05_final = "22/05/2016";
		string_temp_06_inicio = "14/08/2016";
		string_temp_06_final = "27/05/2017";
		string_temp_07_inicio = "13/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "12/08/2018";
		string_temp_08_final = "25/05/2019";
		string_temp_09_inicio = "15/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "13/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "28/05/2011";
		string_temp_09_antes = "22/05/2021";
		
		// Convertendo Datas das Temporadas do Barcelona
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Barcelona
		Temporada temporada_01_barcelona = new Temporada(barcelona, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 51, 02, 12, 01, 38,  9, 02);
		Temporada temporada_02_barcelona = new Temporada(barcelona, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 48, 00, 12, 00, 38,  8, 02);
		Temporada temporada_03_barcelona = new Temporada(barcelona, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 48, 00, 10, 00, 38,  9, 02);
		Temporada temporada_04_barcelona = new Temporada(barcelona, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 13, 00, 38,  9, 00);
		Temporada temporada_05_barcelona = new Temporada(barcelona, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 47, 02, 10, 01, 38,  9, 02);
		Temporada temporada_06_barcelona = new Temporada(barcelona, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 57, 00, 10, 00, 38,  9, 02);
		Temporada temporada_07_barcelona = new Temporada(barcelona, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 51, 00, 10, 00, 38,  9, 02);
		Temporada temporada_08_barcelona = new Temporada(barcelona, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 48, 00, 12, 00, 38,  9, 01);
		Temporada temporada_09_barcelona = new Temporada(barcelona, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 47, 00, 12, 00, 38, 02, 01);
		Temporada temporada_10_barcelona = new Temporada(barcelona, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 64, 00,  8, 00, 38, 05, 02);
		
		//Persistindo temporadas do Barcelona
		temporadaDao.adiciona(temporada_01_barcelona);
		temporadaDao.adiciona(temporada_02_barcelona);
		temporadaDao.adiciona(temporada_03_barcelona);
		temporadaDao.adiciona(temporada_04_barcelona);
		temporadaDao.adiciona(temporada_05_barcelona);
		temporadaDao.adiciona(temporada_06_barcelona);
		temporadaDao.adiciona(temporada_07_barcelona);
		temporadaDao.adiciona(temporada_08_barcelona);
		temporadaDao.adiciona(temporada_09_barcelona);
		temporadaDao.adiciona(temporada_10_barcelona);
		
		clubeDao.atualiza(barcelona);
		
		// Criação e Persistência do Real Madrid
		Clube realMadrid = new Clube("Real Madrid", "Espanha", Categoria.EUROPEU);
		clubeDao.adiciona(realMadrid);
		
		// Adicionando Datas das Temporadas do Real Madrid
		string_temp_01_inicio = "14/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "19/08/2012";
		string_temp_02_final = "01/06/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "24/05/2014";
		string_temp_04_inicio = "12/08/2014";
		string_temp_04_final = "23/05/2015";
		string_temp_05_inicio = "23/08/2015";
		string_temp_05_final = "28/05/2016";
		string_temp_06_inicio = "09/08/2016";
		string_temp_06_final = "03/06/2017";
		string_temp_07_inicio = "08/08/2017";
		string_temp_07_final = "26/05/2018";
		string_temp_08_inicio = "15/08/2018";
		string_temp_08_final = "19/05/2019";
		string_temp_09_inicio = "14/08/2021";
		string_temp_09_final = "28/05/2022";
		string_temp_10_inicio = "10/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "21/05/2011";
		string_temp_09_antes = "22/05/2021";
			
		// Convertendo Datas das Temporadas do Real Madrid
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Real Madrid
		Temporada temporada_01_realMadrid = new Temporada(realMadrid, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 51, 00, 12, 00, 38, 06, 02);
		Temporada temporada_02_realMadrid = new Temporada(realMadrid, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 48, 00, 12, 00, 38,  9, 02);
		Temporada temporada_03_realMadrid = new Temporada(realMadrid, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 48, 00, 13, 00, 38,  9, 00);
		Temporada temporada_04_realMadrid = new Temporada(realMadrid, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 02, 12, 01, 38, 04, 02);
		Temporada temporada_05_realMadrid = new Temporada(realMadrid, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 47, 00, 13, 00, 38, 01, 00);
		Temporada temporada_06_realMadrid = new Temporada(realMadrid, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 57, 02, 13, 01, 38, 06, 00);
		Temporada temporada_07_realMadrid = new Temporada(realMadrid, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 51, 02, 13, 01, 38, 06, 02);
		Temporada temporada_08_realMadrid = new Temporada(realMadrid, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 48, 02,  8, 01, 38,  8, 00);
		Temporada temporada_09_realMadrid = new Temporada(realMadrid, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 47, 00, 13, 00, 38, 03, 02);
		Temporada temporada_10_realMadrid = new Temporada(realMadrid, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 64, 02, 12, 01, 38, 06, 02);
		
		//Persistindo temporadas do Real Madrid
		temporadaDao.adiciona(temporada_01_realMadrid);
		temporadaDao.adiciona(temporada_02_realMadrid);
		temporadaDao.adiciona(temporada_03_realMadrid);
		temporadaDao.adiciona(temporada_04_realMadrid);
		temporadaDao.adiciona(temporada_05_realMadrid);
		temporadaDao.adiciona(temporada_06_realMadrid);
		temporadaDao.adiciona(temporada_07_realMadrid);
		temporadaDao.adiciona(temporada_08_realMadrid);
		temporadaDao.adiciona(temporada_09_realMadrid);
		temporadaDao.adiciona(temporada_10_realMadrid);
		
		clubeDao.atualiza(realMadrid);
		
		// Criação e Persistência do Sevilla
		Clube sevilla = new Clube("Sevilla", "Espanha", Categoria.EUROPEU);
		clubeDao.adiciona(sevilla);
		
		// Adicionando Datas das Temporadas do Sevilla
		string_temp_01_inicio = "18/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "18/08/2012";
		string_temp_02_final = "01/06/2013";
		string_temp_03_inicio = "01/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "12/08/2014";
		string_temp_04_final = "27/05/2015";
		string_temp_05_inicio = "11/08/2015";
		string_temp_05_final = "22/05/2016";
		string_temp_06_inicio = "09/08/2016";
		string_temp_06_final = "20/05/2017";
		string_temp_07_inicio = "16/08/2017";
		string_temp_07_final = "19/05/2018";
		string_temp_08_inicio = "26/07/2018";
		string_temp_08_final = "18/05/2019";
		string_temp_09_inicio = "15/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "12/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "21/05/2011";
		string_temp_09_antes = "23/05/2021";

		// Convertendo Datas das Temporadas do Sevilla
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Sevilla
		Temporada temporada_01_sevilla = new Temporada(sevilla, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 51, 00, 02, 00, 38, 04, 00);
		Temporada temporada_02_sevilla = new Temporada(sevilla, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 48, 00, 00, 00, 38,  8, 00);
		Temporada temporada_03_sevilla = new Temporada(sevilla, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 52, 00, 19, 00, 38, 02, 00);
		Temporada temporada_04_sevilla = new Temporada(sevilla, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 15, 01, 38, 06, 00);
		Temporada temporada_05_sevilla = new Temporada(sevilla, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 47, 00, 15, 01, 38,  9, 00);
		Temporada temporada_06_sevilla = new Temporada(sevilla, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 57, 00,  8, 01, 38, 04, 02);
		Temporada temporada_07_sevilla = new Temporada(sevilla, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 51, 00, 12, 00, 38,  9, 00);
		Temporada temporada_08_sevilla = new Temporada(sevilla, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 48, 00, 16, 00, 38, 06, 01);
		Temporada temporada_09_sevilla = new Temporada(sevilla, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 47, 00, 10, 00, 38, 04, 00);
		Temporada temporada_10_sevilla = new Temporada(sevilla, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 64, 00, 15, 00, 38, 05, 00);
		
		//Persistindo temporadas do Sevilla
		temporadaDao.adiciona(temporada_01_sevilla);
		temporadaDao.adiciona(temporada_02_sevilla);
		temporadaDao.adiciona(temporada_03_sevilla);
		temporadaDao.adiciona(temporada_04_sevilla);
		temporadaDao.adiciona(temporada_05_sevilla);
		temporadaDao.adiciona(temporada_06_sevilla);
		temporadaDao.adiciona(temporada_07_sevilla);
		temporadaDao.adiciona(temporada_08_sevilla);
		temporadaDao.adiciona(temporada_09_sevilla);
		temporadaDao.adiciona(temporada_10_sevilla);
		
		clubeDao.atualiza(sevilla);
		
		// Criação e Persistência da Inter de Milão
		Clube interDeMilao = new Clube("Inter de Milão", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(interDeMilao);
		
		// Adicionando Datas das Temporadas da Inter de Milão
		string_temp_01_inicio = "06/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "02/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "20/08/2014";
		string_temp_04_final = "31/05/2015";
		string_temp_05_inicio = "23/08/2015";
		string_temp_05_final = "14/05/2016";
		string_temp_06_inicio = "21/08/2016";
		string_temp_06_final = "28/05/2017";
		string_temp_07_inicio = "20/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "19/08/2018";
		string_temp_08_final = "26/05/2019";
		string_temp_09_inicio = "21/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "13/08/2022";
		string_temp_10_final = "10/06/2023";
		
		string_temp_01_antes = "29/05/2011";
		string_temp_09_antes = "23/05/2021";
		
		// Convertendo Datas das Temporadas da Inter de Milão
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas da Inter de Milão
		Temporada temporada_01_interDeMilao = new Temporada(interDeMilao, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 52, 00,  8, 00, 38, 02, 01);
		Temporada temporada_02_interDeMilao = new Temporada(interDeMilao, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 55, 00, 14, 00, 38, 04, 00);
		Temporada temporada_03_interDeMilao = new Temporada(interDeMilao, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00, 00, 00, 38, 03, 00);
		Temporada temporada_04_interDeMilao = new Temporada(interDeMilao, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 12, 00, 38, 02, 00);
		Temporada temporada_05_interDeMilao = new Temporada(interDeMilao, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00, 00, 00, 38, 04, 00);
		Temporada temporada_06_interDeMilao = new Temporada(interDeMilao, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00, 06, 00, 38, 02, 00);
		Temporada temporada_07_interDeMilao = new Temporada(interDeMilao, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 00, 00, 38, 02, 00);
		Temporada temporada_08_interDeMilao = new Temporada(interDeMilao, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00, 10, 00, 38, 02, 00);
		Temporada temporada_09_interDeMilao = new Temporada(interDeMilao, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00,  8, 00, 38, 05, 01);
		Temporada temporada_10_interDeMilao = new Temporada(interDeMilao, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 13, 00, 38, 05, 01);
		
		//Persistindo temporadas da Inter de Milão
		temporadaDao.adiciona(temporada_01_interDeMilao);
		temporadaDao.adiciona(temporada_02_interDeMilao);
		temporadaDao.adiciona(temporada_03_interDeMilao);
		temporadaDao.adiciona(temporada_04_interDeMilao);
		temporadaDao.adiciona(temporada_05_interDeMilao);
		temporadaDao.adiciona(temporada_06_interDeMilao);
		temporadaDao.adiciona(temporada_07_interDeMilao);
		temporadaDao.adiciona(temporada_08_interDeMilao);
		temporadaDao.adiciona(temporada_09_interDeMilao);
		temporadaDao.adiciona(temporada_10_interDeMilao);
		
		clubeDao.atualiza(interDeMilao);
		
		// Criação e Persistência do Milan
		Clube milan = new Clube("Milan", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(milan);
		
		// Adicionando Datas das Temporadas do Milan
		string_temp_01_inicio = "06/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "26/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "20/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "31/08/2014";
		string_temp_04_final = "30/05/2015";
		string_temp_05_inicio = "17/08/2015";
		string_temp_05_final = "21/05/2016";
		string_temp_06_inicio = "21/08/2016";
		string_temp_06_final = "28/05/2017";
		string_temp_07_inicio = "27/07/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "25/08/2018";
		string_temp_08_final = "26/05/2019";
		string_temp_09_inicio = "23/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "13/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
		
		// Convertendo Datas das Temporadas do Milan
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Milan
		Temporada temporada_01_milan = new Temporada(milan, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 52, 00, 10, 00, 38, 04, 01);
		Temporada temporada_02_milan = new Temporada(milan, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 51, 00,  8, 00, 38, 02, 00);
		Temporada temporada_03_milan = new Temporada(milan, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00, 10, 00, 38, 02, 00);
		Temporada temporada_04_milan = new Temporada(milan, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 00, 00, 38, 02, 00);
		Temporada temporada_05_milan = new Temporada(milan, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00, 00, 00, 38, 07, 00);
		Temporada temporada_06_milan = new Temporada(milan, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00, 00, 00, 38, 02, 01);
		Temporada temporada_07_milan = new Temporada(milan, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 14, 00, 38, 05, 00);
		Temporada temporada_08_milan = new Temporada(milan, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00, 06, 00, 38, 04, 01);
		Temporada temporada_09_milan = new Temporada(milan, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00, 06, 00, 38, 04, 00);
		Temporada temporada_10_milan = new Temporada(milan, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 12, 00, 38, 01, 01);
		
		//Persistindo temporadas do Milan
		temporadaDao.adiciona(temporada_01_milan);
		temporadaDao.adiciona(temporada_02_milan);
		temporadaDao.adiciona(temporada_03_milan);
		temporadaDao.adiciona(temporada_04_milan);
		temporadaDao.adiciona(temporada_05_milan);
		temporadaDao.adiciona(temporada_06_milan);
		temporadaDao.adiciona(temporada_07_milan);
		temporadaDao.adiciona(temporada_08_milan);
		temporadaDao.adiciona(temporada_09_milan);
		temporadaDao.adiciona(temporada_10_milan);
		
		clubeDao.atualiza(milan);
		
		// Criação e Persistência da Roma
		Clube roma = new Clube("Roma", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(roma);
		
		// Adicionando Datas das Temporadas da Roma
		string_temp_01_inicio = "18/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "26/08/2012";
		string_temp_02_final = "26/05/2013";
		string_temp_03_inicio = "25/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "30/08/2014";
		string_temp_04_final = "31/05/2015";
		string_temp_05_inicio = "22/08/2015";
		string_temp_05_final = "14/05/2016";
		string_temp_06_inicio = "17/08/2016";
		string_temp_06_final = "28/05/2017";
		string_temp_07_inicio = "20/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "19/08/2018";
		string_temp_08_final = "26/05/2019";
		string_temp_09_inicio = "19/08/2021";
		string_temp_09_final = "25/05/2022";
		string_temp_10_inicio = "14/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas da Roma
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas da Roma
		Temporada temporada_01_roma = new Temporada(roma, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 48, 00, 02, 00, 38, 02, 00);
		Temporada temporada_02_roma = new Temporada(roma, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 51, 00, 00, 00, 38, 05, 00);
		Temporada temporada_03_roma = new Temporada(roma, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00, 00, 00, 38, 04, 00);
		Temporada temporada_04_roma = new Temporada(roma, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 10, 00, 38, 02, 00);
		Temporada temporada_05_roma = new Temporada(roma, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00,  8, 00, 38, 01, 00);
		Temporada temporada_06_roma = new Temporada(roma, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00, 12, 00, 38, 04, 00);
		Temporada temporada_07_roma = new Temporada(roma, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 12, 00, 38, 01, 00);
		Temporada temporada_08_roma = new Temporada(roma, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00,  8, 00, 38, 02, 00);
		Temporada temporada_09_roma = new Temporada(roma, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00, 15, 00, 38, 02, 00);
		Temporada temporada_10_roma = new Temporada(roma, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 15, 00, 38, 02, 00);
		
		//Persistindo temporadas da Roma
		temporadaDao.adiciona(temporada_01_roma);
		temporadaDao.adiciona(temporada_02_roma);
		temporadaDao.adiciona(temporada_03_roma);
		temporadaDao.adiciona(temporada_04_roma);
		temporadaDao.adiciona(temporada_05_roma);
		temporadaDao.adiciona(temporada_06_roma);
		temporadaDao.adiciona(temporada_07_roma);
		temporadaDao.adiciona(temporada_08_roma);
		temporadaDao.adiciona(temporada_09_roma);
		temporadaDao.adiciona(temporada_10_roma);
		
		clubeDao.atualiza(roma);
		
		// Criação e Persistência da Lazio
		Clube lazio = new Clube("Lazio", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(lazio);
		
		// Adicionando Datas das Temporadas da Lazio
		string_temp_01_inicio = "18/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "22/08/2012";
		string_temp_02_final = "26/05/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "24/08/2014";
		string_temp_04_final = "31/05/2015";
		string_temp_05_inicio = "08/08/2015";
		string_temp_05_final = "15/05/2016";
		string_temp_06_inicio = "21/08/2016";
		string_temp_06_final = "28/05/2017";
		string_temp_07_inicio = "13/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "18/08/2018";
		string_temp_08_final = "26/05/2019";
		string_temp_09_inicio = "21/08/2021";
		string_temp_09_final = "21/05/2022";
		string_temp_10_inicio = "14/08/2022";
		string_temp_10_final = "03/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas da Lazio
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas da Lazio
		Temporada temporada_01_lazio = new Temporada(lazio, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 48, 00, 10, 00, 38, 02, 00);
		Temporada temporada_02_lazio = new Temporada(lazio, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 51, 00, 14, 00, 38, 05, 00);
		Temporada temporada_03_lazio = new Temporada(lazio, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00,  8, 00, 38, 02, 01);
		Temporada temporada_04_lazio = new Temporada(lazio, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 00, 00, 38, 07, 00);
		Temporada temporada_05_lazio = new Temporada(lazio, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00, 12, 00, 38, 02, 01);
		Temporada temporada_06_lazio = new Temporada(lazio, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00, 00, 00, 38, 05, 00);
		Temporada temporada_07_lazio = new Temporada(lazio, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 12, 00, 38, 04, 01);
		Temporada temporada_08_lazio = new Temporada(lazio, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00,  8, 00, 38, 05, 00);
		Temporada temporada_09_lazio = new Temporada(lazio, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00,  8, 00, 38, 02, 00);
		Temporada temporada_10_lazio = new Temporada(lazio, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 10, 00, 38, 02, 00);
		
		//Persistindo temporadas da Lazio
		temporadaDao.adiciona(temporada_01_lazio);
		temporadaDao.adiciona(temporada_02_lazio);
		temporadaDao.adiciona(temporada_03_lazio);
		temporadaDao.adiciona(temporada_04_lazio);
		temporadaDao.adiciona(temporada_05_lazio);
		temporadaDao.adiciona(temporada_06_lazio);
		temporadaDao.adiciona(temporada_07_lazio);
		temporadaDao.adiciona(temporada_08_lazio);
		temporadaDao.adiciona(temporada_09_lazio);
		temporadaDao.adiciona(temporada_10_lazio);
		
		clubeDao.atualiza(lazio);
		
		// Criação e Persistência da Juventus
		Clube juventus = new Clube("Juventus", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(juventus);
		
		// Adicionando Datas das Temporadas da Juventus
		string_temp_01_inicio = "11/09/2011";
		string_temp_01_final = "20/05/2012";
		string_temp_02_inicio = "11/08/2012";
		string_temp_02_final = "18/05/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "30/08/2014";
		string_temp_04_final = "06/06/2015";
		string_temp_05_inicio = "08/08/2015";
		string_temp_05_final = "21/05/2016";
		string_temp_06_inicio = "20/08/2016";
		string_temp_06_final = "03/06/2017";
		string_temp_07_inicio = "13/08/2017";
		string_temp_07_final = "19/05/2018";
		string_temp_08_inicio = "18/08/2018";
		string_temp_08_final = "26/05/2019";
		string_temp_09_inicio = "22/08/2021";
		string_temp_09_final = "21/05/2022";
		string_temp_10_inicio = "15/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas da Juventus
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas da Juventus
		Temporada temporada_01_juventus = new Temporada(juventus, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 38, 00, 00, 00, 38, 05, 00);
		Temporada temporada_02_juventus = new Temporada(juventus, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 55, 00, 10, 00, 38, 04, 01);
		Temporada temporada_03_juventus = new Temporada(juventus, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00, 14, 00, 38, 02, 01);
		Temporada temporada_04_juventus = new Temporada(juventus, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 13, 00, 38, 05, 01);
		Temporada temporada_05_juventus = new Temporada(juventus, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00,  8, 00, 38, 05, 01);
		Temporada temporada_06_juventus = new Temporada(juventus, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00, 13, 00, 38, 05, 01);
		Temporada temporada_07_juventus = new Temporada(juventus, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 10, 00, 38, 05, 01);
		Temporada temporada_08_juventus = new Temporada(juventus, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00, 10, 00, 38, 02, 01);
		Temporada temporada_09_juventus = new Temporada(juventus, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00,  8, 00, 38, 05, 01);
		Temporada temporada_10_juventus = new Temporada(juventus, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 14, 00, 38, 04, 00);
		
		//Persistindo temporadas da Juventus
		temporadaDao.adiciona(temporada_01_juventus);
		temporadaDao.adiciona(temporada_02_juventus);
		temporadaDao.adiciona(temporada_03_juventus);
		temporadaDao.adiciona(temporada_04_juventus);
		temporadaDao.adiciona(temporada_05_juventus);
		temporadaDao.adiciona(temporada_06_juventus);
		temporadaDao.adiciona(temporada_07_juventus);
		temporadaDao.adiciona(temporada_08_juventus);
		temporadaDao.adiciona(temporada_09_juventus);
		temporadaDao.adiciona(temporada_10_juventus);
		
		clubeDao.atualiza(juventus);
		
		// Criação e Persistência do Napoli
		Clube napoli = new Clube("Napoli", "Itália", Categoria.EUROPEU);
		clubeDao.adiciona(napoli);
		
		// Adicionando Datas das Temporadas do Napoli
		string_temp_01_inicio = "10/09/2011";
		string_temp_01_final = "20/05/2012";
		string_temp_02_inicio = "11/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "25/08/2013";
		string_temp_03_final = "18/05/2014";
		string_temp_04_inicio = "19/08/2014";
		string_temp_04_final = "31/05/2015";
		string_temp_05_inicio = "23/08/2015";
		string_temp_05_final = "14/05/2016";
		string_temp_06_inicio = "21/08/2016";
		string_temp_06_final = "28/05/2017";
		string_temp_07_inicio = "16/08/2017";
		string_temp_07_final = "20/05/2018";
		string_temp_08_inicio = "18/08/2018";
		string_temp_08_final = "25/05/2019";
		string_temp_09_inicio = "22/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "15/08/2022";
		string_temp_10_final = "04/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas do Napoli
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Napoli
		Temporada temporada_01_napoli = new Temporada(napoli, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 38, 00,  8, 00, 38, 05, 00);
		Temporada temporada_02_napoli = new Temporada(napoli, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 55, 00,  8, 00, 38, 01, 01);
		Temporada temporada_03_napoli = new Temporada(napoli, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 49, 00, 10, 00, 38, 05, 00);
		Temporada temporada_04_napoli = new Temporada(napoli, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 50, 00, 16, 00, 38, 04, 01);
		Temporada temporada_05_napoli = new Temporada(napoli, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 53, 00,  8, 00, 38, 02, 00);
		Temporada temporada_06_napoli = new Temporada(napoli, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 53, 00,  8, 00, 38, 04, 00);
		Temporada temporada_07_napoli = new Temporada(napoli, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 53, 00, 10, 00, 38, 02, 00);
		Temporada temporada_08_napoli = new Temporada(napoli, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 58, 00, 12, 00, 38, 02, 00);
		Temporada temporada_09_napoli = new Temporada(napoli, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 52, 00,  8, 00, 38, 01, 00);
		Temporada temporada_10_napoli = new Temporada(napoli, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 69, 00, 10, 00, 38, 01, 00);
		
		//Persistindo temporadas do Napoli
		temporadaDao.adiciona(temporada_01_napoli);
		temporadaDao.adiciona(temporada_02_napoli);
		temporadaDao.adiciona(temporada_03_napoli);
		temporadaDao.adiciona(temporada_04_napoli);
		temporadaDao.adiciona(temporada_05_napoli);
		temporadaDao.adiciona(temporada_06_napoli);
		temporadaDao.adiciona(temporada_07_napoli);
		temporadaDao.adiciona(temporada_08_napoli);
		temporadaDao.adiciona(temporada_09_napoli);
		temporadaDao.adiciona(temporada_10_napoli);
		
		clubeDao.atualiza(napoli);
		
		// Criação e Persistência do do Liverpool
		Clube liverpool = new Clube("Liverpool", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(liverpool);
		
		// Adicionando Datas das Temporadas do Liverpool
		string_temp_01_inicio = "13/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "02/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "17/08/2013";
		string_temp_03_final = "11/05/2014";
		string_temp_04_inicio = "17/08/2014";
		string_temp_04_final = "24/05/2015";
		string_temp_05_inicio = "09/08/2015";
		string_temp_05_final = "18/05/2016";
		string_temp_06_inicio = "14/08/2016";
		string_temp_06_final = "21/05/2017";
		string_temp_07_inicio = "12/08/2017";
		string_temp_07_final = "26/05/2018";
		string_temp_08_inicio = "12/08/2018";
		string_temp_08_final = "01/06/2019";
		string_temp_09_inicio = "14/08/2021";
		string_temp_09_final = "28/05/2022";
		string_temp_10_inicio = "30/07/2022";
		string_temp_10_final = "28/05/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas do Liverpool
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Liverpool
		Temporada temporada_01_liverpool = new Temporada(liverpool, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 34, 00, 00, 00, 38, 06, 00, 07);
		Temporada temporada_02_liverpool = new Temporada(liverpool, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 42, 00, 12, 00, 38, 02, 00, 02);
		Temporada temporada_03_liverpool = new Temporada(liverpool, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 38, 00, 00, 00, 38, 03, 00, 02);
		Temporada temporada_04_liverpool = new Temporada(liverpool, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00,  8, 00, 38, 07, 00, 05);
		Temporada temporada_05_liverpool = new Temporada(liverpool, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00, 15, 00, 38, 04, 00, 06);
		Temporada temporada_06_liverpool = new Temporada(liverpool, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00, 00, 00, 38, 03, 00, 06);
		Temporada temporada_07_liverpool = new Temporada(liverpool, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00, 15, 00, 38, 02, 00, 01);
		Temporada temporada_08_liverpool = new Temporada(liverpool, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 13, 00, 38, 01, 00, 01);
		Temporada temporada_09_liverpool = new Temporada(liverpool, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 00, 13, 00, 38, 06, 00, 06);
		Temporada temporada_10_liverpool = new Temporada(liverpool, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00,  8, 00, 38, 03, 01, 02);
		
		//Persistindo temporadas do Liverpool
		temporadaDao.adiciona(temporada_01_liverpool);
		temporadaDao.adiciona(temporada_02_liverpool);
		temporadaDao.adiciona(temporada_03_liverpool);
		temporadaDao.adiciona(temporada_04_liverpool);
		temporadaDao.adiciona(temporada_05_liverpool);
		temporadaDao.adiciona(temporada_06_liverpool);
		temporadaDao.adiciona(temporada_07_liverpool);
		temporadaDao.adiciona(temporada_08_liverpool);
		temporadaDao.adiciona(temporada_09_liverpool);
		temporadaDao.adiciona(temporada_10_liverpool);
		
		clubeDao.atualiza(liverpool);
		
		// Criação e Persistência do Tottenham
		Clube tottenham = new Clube("Tottenham", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(tottenham);
		
		// Adicionando Datas das Temporadas do Tottenham
		string_temp_01_inicio = "18/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "18/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "11/05/2014";
		string_temp_04_inicio = "16/08/2014";
		string_temp_04_final = "24/05/2015";
		string_temp_05_inicio = "08/08/2015";
		string_temp_05_final = "15/05/2016";
		string_temp_06_inicio = "13/08/2016";
		string_temp_06_final = "13/05/2017";
		string_temp_07_inicio = "13/08/2017";
		string_temp_07_final = "13/05/2018";
		string_temp_08_inicio = "11/08/2018";
		string_temp_08_final = "01/06/2019";
		string_temp_09_inicio = "15/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "06/08/2022";
		string_temp_10_final = "28/05/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas do Tottenham
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Tottenham
		Temporada temporada_01_tottenham = new Temporada(tottenham, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 34, 00,  8, 00, 38, 06, 00, 01);
		Temporada temporada_02_tottenham = new Temporada(tottenham, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 38, 00, 12, 00, 38, 02, 00, 02);
		Temporada temporada_03_tottenham = new Temporada(tottenham, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 38, 00, 12, 00, 38, 01, 00, 03);
		Temporada temporada_04_tottenham = new Temporada(tottenham, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00, 10, 00, 38, 03, 00, 06);
		Temporada temporada_05_tottenham = new Temporada(tottenham, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00, 10, 00, 38, 04, 00, 01);
		Temporada temporada_06_tottenham = new Temporada(tottenham, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00,  8, 00, 38, 05, 00, 04);
		Temporada temporada_07_tottenham = new Temporada(tottenham, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00,  8, 00, 38, 07, 00, 02);
		Temporada temporada_08_tottenham = new Temporada(tottenham, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 13, 00, 38, 02, 00, 05);
		Temporada temporada_09_tottenham = new Temporada(tottenham, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 00,  8, 00, 38, 03, 00, 05);
		Temporada temporada_10_tottenham = new Temporada(tottenham, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00,  8, 00, 38, 03, 00, 01);
		
		//Persistindo temporadas do Tottenham
		temporadaDao.adiciona(temporada_01_tottenham);
		temporadaDao.adiciona(temporada_02_tottenham);
		temporadaDao.adiciona(temporada_03_tottenham);
		temporadaDao.adiciona(temporada_04_tottenham);
		temporadaDao.adiciona(temporada_05_tottenham);
		temporadaDao.adiciona(temporada_06_tottenham);
		temporadaDao.adiciona(temporada_07_tottenham);
		temporadaDao.adiciona(temporada_08_tottenham);
		temporadaDao.adiciona(temporada_09_tottenham);
		temporadaDao.adiciona(temporada_10_tottenham);
		
		clubeDao.atualiza(tottenham);
		
		// Criação e Persistência do Arsenal
		Clube arsenal = new Clube("Arsenal", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(arsenal);
		
		// Adicionando Datas das Temporadas do Arsenal
		string_temp_01_inicio = "13/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "18/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "17/08/2013";
		string_temp_03_final = "17/05/2014";
		string_temp_04_inicio = "10/08/2014";
		string_temp_04_final = "30/05/2015";
		string_temp_05_inicio = "02/08/2015";
		string_temp_05_final = "15/05/2016";
		string_temp_06_inicio = "14/08/2016";
		string_temp_06_final = "27/05/2017";
		string_temp_07_inicio = "06/08/2017";
		string_temp_07_final = "13/05/2018";
		string_temp_08_inicio = "12/08/2018";
		string_temp_08_final = "29/05/2019";
		string_temp_09_inicio = "13/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "05/08/2022";
		string_temp_10_final = "28/05/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "23/05/2021";
			
		// Convertendo Datas das Temporadas do Arsenal
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Arsenal
		Temporada temporada_01_arsenal = new Temporada(arsenal, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 34, 00, 10, 00, 38, 03, 00, 03);
		Temporada temporada_02_arsenal = new Temporada(arsenal, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 38, 00,  8, 00, 38, 04, 00, 03);
		Temporada temporada_03_arsenal = new Temporada(arsenal, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 38, 00, 10, 00, 38, 06, 00, 02);
		Temporada temporada_04_arsenal = new Temporada(arsenal, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00, 10, 00, 38, 06, 01, 01);
		Temporada temporada_05_arsenal = new Temporada(arsenal, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00,  8, 00, 38, 05, 01, 02);
		Temporada temporada_06_arsenal = new Temporada(arsenal, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00,  8, 00, 38, 06, 00, 03);
		Temporada temporada_07_arsenal = new Temporada(arsenal, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00, 14, 00, 38, 01, 01, 06);
		Temporada temporada_08_arsenal = new Temporada(arsenal, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 15, 00, 38, 02, 00, 03);
		Temporada temporada_09_arsenal = new Temporada(arsenal, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 00, 00, 00, 38, 01, 00, 06);
		Temporada temporada_10_arsenal = new Temporada(arsenal, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00,  8, 00, 38, 02, 00, 01);
		
		//Persistindo temporadas do Arsenal
		temporadaDao.adiciona(temporada_01_arsenal);
		temporadaDao.adiciona(temporada_02_arsenal);
		temporadaDao.adiciona(temporada_03_arsenal);
		temporadaDao.adiciona(temporada_04_arsenal);
		temporadaDao.adiciona(temporada_05_arsenal);
		temporadaDao.adiciona(temporada_06_arsenal);
		temporadaDao.adiciona(temporada_07_arsenal);
		temporadaDao.adiciona(temporada_08_arsenal);
		temporadaDao.adiciona(temporada_09_arsenal);
		temporadaDao.adiciona(temporada_10_arsenal);
		
		clubeDao.atualiza(arsenal);
		
		// Criação e Persistência do Chelsea
		Clube chelsea = new Clube("Chelsea", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(chelsea);
		
		// Adicionando Datas das Temporadas do Chelsea
		string_temp_01_inicio = "14/08/2011";
		string_temp_01_final = "19/05/2012";
		string_temp_02_inicio = "12/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "18/08/2013";
		string_temp_03_final = "11/05/2014";
		string_temp_04_inicio = "18/08/2014";
		string_temp_04_final = "24/05/2015";
		string_temp_05_inicio = "02/08/2015";
		string_temp_05_final = "15/05/2016";
		string_temp_06_inicio = "15/08/2016";
		string_temp_06_final = "27/05/2017";
		string_temp_07_inicio = "06/08/2017";
		string_temp_07_final = "19/05/2018";
		string_temp_08_inicio = "05/08/2018";
		string_temp_08_final = "29/05/2019";
		string_temp_09_inicio = "11/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "06/08/2022";
		string_temp_10_final = "28/05/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "29/05/2021";
			
		// Convertendo Datas das Temporadas do Chelsea
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Chelsea
		Temporada temporada_01_chelsea = new Temporada(chelsea, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 34, 00, 13, 00, 38, 07, 00, 03);
		Temporada temporada_02_chelsea = new Temporada(chelsea, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 42, 02, 15, 01, 38, 07, 01, 05);
		Temporada temporada_03_chelsea = new Temporada(chelsea, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 38, 00, 12, 01, 38, 03, 00, 03);
		Temporada temporada_04_chelsea = new Temporada(chelsea, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00,  8, 00, 38, 02, 00, 06);
		Temporada temporada_05_chelsea = new Temporada(chelsea, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00,  8, 00, 38, 04, 01, 02);
		Temporada temporada_06_chelsea = new Temporada(chelsea, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00, 00, 00, 38, 06, 00, 03);
		Temporada temporada_07_chelsea = new Temporada(chelsea, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00,  8, 00, 38, 07, 01, 05);
		Temporada temporada_08_chelsea = new Temporada(chelsea, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 15, 00, 38, 03, 01, 06);
		Temporada temporada_09_chelsea = new Temporada(chelsea, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 02, 10, 01, 38, 06, 00, 06);
		Temporada temporada_10_chelsea = new Temporada(chelsea, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00, 10, 00, 38, 01, 00, 01);
		
		//Persistindo temporadas do Chelsea
		temporadaDao.adiciona(temporada_01_chelsea);
		temporadaDao.adiciona(temporada_02_chelsea);
		temporadaDao.adiciona(temporada_03_chelsea);
		temporadaDao.adiciona(temporada_04_chelsea);
		temporadaDao.adiciona(temporada_05_chelsea);
		temporadaDao.adiciona(temporada_06_chelsea);
		temporadaDao.adiciona(temporada_07_chelsea);
		temporadaDao.adiciona(temporada_08_chelsea);
		temporadaDao.adiciona(temporada_09_chelsea);
		temporadaDao.adiciona(temporada_10_chelsea);
		
		clubeDao.atualiza(chelsea);
		
		// Criação e Persistência do Manchester United
		Clube manchesterUnited = new Clube("Manchester United", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(manchesterUnited);
		
		// Adicionando Datas das Temporadas do Manchester United
		string_temp_01_inicio = "07/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "20/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "11/08/2013";
		string_temp_03_final = "11/05/2014";
		string_temp_04_inicio = "16/08/2014";
		string_temp_04_final = "24/05/2015";
		string_temp_05_inicio = "08/08/2015";
		string_temp_05_final = "21/05/2016";
		string_temp_06_inicio = "07/08/2016";
		string_temp_06_final = "24/05/2017";
		string_temp_07_inicio = "08/08/2017";
		string_temp_07_final = "19/05/2018";
		string_temp_08_inicio = "10/08/2018";
		string_temp_08_final = "12/05/2019";
		string_temp_09_inicio = "14/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "07/08/2022";
		string_temp_10_final = "03/06/2023";
		
		string_temp_01_antes = "28/05/2011";
		string_temp_09_antes = "26/05/2021";
			
		// Convertendo Datas das Temporadas do Manchester United
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Manchester United
		Temporada temporada_01_manchesterUnited = new Temporada(manchesterUnited, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 38, 00, 10, 00, 38, 02, 01, 03);
		Temporada temporada_02_manchesterUnited = new Temporada(manchesterUnited, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 38, 00,  8, 00, 38, 06, 00, 02);
		Temporada temporada_03_manchesterUnited = new Temporada(manchesterUnited, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 42, 00, 10, 00, 38, 01, 01, 05);
		Temporada temporada_04_manchesterUnited = new Temporada(manchesterUnited, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00, 00, 00, 38, 05, 00, 01);
		Temporada temporada_05_manchesterUnited = new Temporada(manchesterUnited, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00, 12, 00, 38, 07, 00, 02);
		Temporada temporada_06_manchesterUnited = new Temporada(manchesterUnited, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00, 15, 00, 38, 04, 01, 06);
		Temporada temporada_07_manchesterUnited = new Temporada(manchesterUnited, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00,  8, 01, 38, 06, 00, 03);
		Temporada temporada_08_manchesterUnited = new Temporada(manchesterUnited, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 10, 00, 38, 04, 00, 01);
		Temporada temporada_09_manchesterUnited = new Temporada(manchesterUnited, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 00,  8, 00, 38, 02, 00, 01);
		Temporada temporada_10_manchesterUnited = new Temporada(manchesterUnited, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00, 12, 00, 38, 06, 00, 06);
		
		//Persistindo temporadas do Manchester United
		temporadaDao.adiciona(temporada_01_manchesterUnited);
		temporadaDao.adiciona(temporada_02_manchesterUnited);
		temporadaDao.adiciona(temporada_03_manchesterUnited);
		temporadaDao.adiciona(temporada_04_manchesterUnited);
		temporadaDao.adiciona(temporada_05_manchesterUnited);
		temporadaDao.adiciona(temporada_06_manchesterUnited);
		temporadaDao.adiciona(temporada_07_manchesterUnited);
		temporadaDao.adiciona(temporada_08_manchesterUnited);
		temporadaDao.adiciona(temporada_09_manchesterUnited);
		temporadaDao.adiciona(temporada_10_manchesterUnited);
		
		clubeDao.atualiza(manchesterUnited);
		
		// Criação e Persistência do Manchester City
		Clube manchesterCity = new Clube("Manchester City", "Inglaterra", Categoria.EUROPEU);
		clubeDao.adiciona(manchesterCity);
		
		// Adicionando Datas das Temporadas do Manchester City
		string_temp_01_inicio = "07/08/2011";
		string_temp_01_final = "13/05/2012";
		string_temp_02_inicio = "12/08/2012";
		string_temp_02_final = "19/05/2013";
		string_temp_03_inicio = "19/08/2013";
		string_temp_03_final = "11/05/2014";
		string_temp_04_inicio = "10/08/2014";
		string_temp_04_final = "24/05/2015";
		string_temp_05_inicio = "10/08/2015";
		string_temp_05_final = "15/05/2016";
		string_temp_06_inicio = "13/08/2016";
		string_temp_06_final = "21/05/2017";
		string_temp_07_inicio = "12/08/2017";
		string_temp_07_final = "13/05/2018";
		string_temp_08_inicio = "05/08/2018";
		string_temp_08_final = "18/05/2019";
		string_temp_09_inicio = "07/08/2021";
		string_temp_09_final = "22/05/2022";
		string_temp_10_inicio = "30/07/2022";
		string_temp_10_final = "10/06/2023";
		
		string_temp_01_antes = "22/05/2011";
		string_temp_09_antes = "29/05/2021";
			
		// Convertendo Datas das Temporadas do Manchester City
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do Manchester City
		Temporada temporada_01_manchesterCity = new Temporada(manchesterCity, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, 38, 00, 10, 00, 38, 01, 01, 05);
		Temporada temporada_02_manchesterCity = new Temporada(manchesterCity, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, 42, 00, 06, 00, 38, 06, 01, 01);
		Temporada temporada_03_manchesterCity = new Temporada(manchesterCity, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, 38, 00,  8, 00, 38, 05, 00, 06);
		Temporada temporada_04_manchesterCity = new Temporada(manchesterCity, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, 40, 00,  8, 00, 38, 02, 01, 02);
		Temporada temporada_05_manchesterCity = new Temporada(manchesterCity, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, 40, 00, 12, 00, 38, 03, 00, 06);
		Temporada temporada_06_manchesterCity = new Temporada(manchesterCity, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, 40, 00, 10, 00, 38, 06, 00, 02);
		Temporada temporada_07_manchesterCity = new Temporada(manchesterCity, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, 40, 00, 10, 00, 38, 03, 00, 06);
		Temporada temporada_08_manchesterCity = new Temporada(manchesterCity, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, 40, 00, 10, 00, 38, 06, 01, 06);
		Temporada temporada_09_manchesterCity = new Temporada(manchesterCity, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, 40, 00, 12, 00, 38, 05, 01, 02);
		Temporada temporada_10_manchesterCity = new Temporada(manchesterCity, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, 57, 00, 13, 00, 38, 06, 01, 03);
		
		//Persistindo temporadas do Manchester City
		temporadaDao.adiciona(temporada_01_manchesterCity);
		temporadaDao.adiciona(temporada_02_manchesterCity);
		temporadaDao.adiciona(temporada_03_manchesterCity);
		temporadaDao.adiciona(temporada_04_manchesterCity);
		temporadaDao.adiciona(temporada_05_manchesterCity);
		temporadaDao.adiciona(temporada_06_manchesterCity);
		temporadaDao.adiciona(temporada_07_manchesterCity);
		temporadaDao.adiciona(temporada_08_manchesterCity);
		temporadaDao.adiciona(temporada_09_manchesterCity);
		temporadaDao.adiciona(temporada_10_manchesterCity);
		
		clubeDao.atualiza(manchesterCity);
		
		/*
		// Adicionando Datas das Temporadas do 
		string_temp_01_inicio = "";
		string_temp_01_final = "";
		string_temp_02_inicio = "";
		string_temp_02_final = "";
		string_temp_03_inicio = "";
		string_temp_03_final = "";
		string_temp_04_inicio = "";
		string_temp_04_final = "";
		string_temp_05_inicio = "";
		string_temp_05_final = "";
		string_temp_06_inicio = "";
		string_temp_06_final = "";
		string_temp_07_inicio = "";
		string_temp_07_final = "";
		string_temp_08_inicio = "";
		string_temp_08_final = "";
		string_temp_09_inicio = "";
		string_temp_09_final = "";
		string_temp_10_inicio = "";
		string_temp_10_final = "";
		
		string_temp_01_antes = "";
		string_temp_09_antes = "";
				
		// Convertendo Datas das Temporadas do 
		try {
		    temp_01_inicio = dateFormat.parse(string_temp_01_inicio);
		    temp_01_final = dateFormat.parse(string_temp_01_final);
		    temp_02_inicio = dateFormat.parse(string_temp_02_inicio);
		    temp_02_final = dateFormat.parse(string_temp_02_final);
		    temp_03_inicio = dateFormat.parse(string_temp_03_inicio);
		    temp_03_final = dateFormat.parse(string_temp_03_final);
		    temp_04_inicio = dateFormat.parse(string_temp_04_inicio);
		    temp_04_final = dateFormat.parse(string_temp_04_final);
		    temp_05_inicio = dateFormat.parse(string_temp_05_inicio);
		    temp_05_final = dateFormat.parse(string_temp_05_final);
		    temp_06_inicio = dateFormat.parse(string_temp_06_inicio);
		    temp_06_final = dateFormat.parse(string_temp_06_final);
		    temp_07_inicio = dateFormat.parse(string_temp_07_inicio);
		    temp_07_final = dateFormat.parse(string_temp_07_final);
		    temp_08_inicio = dateFormat.parse(string_temp_08_inicio);
		    temp_08_final = dateFormat.parse(string_temp_08_final);
		    temp_09_inicio = dateFormat.parse(string_temp_09_inicio);
		    temp_09_final = dateFormat.parse(string_temp_09_final);
		    temp_10_inicio = dateFormat.parse(string_temp_10_inicio);
		    temp_10_final = dateFormat.parse(string_temp_10_final);
		    temp_01_antes = dateFormat.parse(string_temp_01_antes);
		    temp_09_antes = dateFormat.parse(string_temp_09_antes);
		} catch (ParseException e) {
		    e.printStackTrace();
		    // Trate a exceção de forma apropriada para o seu caso
		}
				
		// Adicionando Temporadas do 
		Temporada temporada_01_ = new Temporada(, "2011/12", 01, temp_01_inicio, temp_01_final, temp_01_antes, );
		Temporada temporada_02_ = new Temporada(, "2012/13", 01, temp_02_inicio, temp_02_final, temp_01_final, );
		Temporada temporada_03_ = new Temporada(, "2013/14", 01, temp_03_inicio, temp_03_final, temp_02_final, );
		Temporada temporada_04_ = new Temporada(, "2014/15", 01, temp_04_inicio, temp_04_final, temp_03_final, );
		Temporada temporada_05_ = new Temporada(, "2015/16", 01, temp_05_inicio, temp_05_final, temp_04_final, );
		Temporada temporada_06_ = new Temporada(, "2016/17", 01, temp_06_inicio, temp_06_final, temp_05_final, );
		Temporada temporada_07_ = new Temporada(, "2017/18", 01, temp_07_inicio, temp_07_final, temp_06_final, );
		Temporada temporada_08_ = new Temporada(, "2018/19", 01, temp_08_inicio, temp_08_final, temp_07_final, );
		Temporada temporada_09_ = new Temporada(, "2021/22", 01, temp_09_inicio, temp_09_final, temp_09_antes, );
		Temporada temporada_10_ = new Temporada(, "2022/23", 01, temp_10_inicio, temp_10_final, temp_09_final, );
		
		//Persistindo temporadas do 
		temporadaDao.adiciona(temporada_01_);
		temporadaDao.adiciona(temporada_02_);
		temporadaDao.adiciona(temporada_03_);
		temporadaDao.adiciona(temporada_04_);
		temporadaDao.adiciona(temporada_05_);
		temporadaDao.adiciona(temporada_06_);
		temporadaDao.adiciona(temporada_07_);
		temporadaDao.adiciona(temporada_08_);
		temporadaDao.adiciona(temporada_09_);
		temporadaDao.adiciona(temporada_10_);
		
		// Adicionando Temporadas do 
		Temporada temporada_01_ = new Temporada(, "2012", 01, temp_01_inicio, temp_01_final, temp_01_antes, );
		Temporada temporada_02_ = new Temporada(, "2013", 01, temp_02_inicio, temp_02_final, temp_01_final, );
		Temporada temporada_03_ = new Temporada(, "2014", 01, temp_03_inicio, temp_03_final, temp_02_final, );
		Temporada temporada_04_ = new Temporada(, "2015", 01, temp_04_inicio, temp_04_final, temp_03_final, );
		Temporada temporada_05_ = new Temporada(, "2016", 01, temp_05_inicio, temp_05_final, temp_04_final, );
		Temporada temporada_06_ = new Temporada(, "2017", 01, temp_06_inicio, temp_06_final, temp_05_final, );
		Temporada temporada_07_ = new Temporada(, "2018", 01, temp_07_inicio, temp_07_final, temp_06_final, );
		Temporada temporada_08_ = new Temporada(, "2019", 01, temp_08_inicio, temp_08_final, temp_07_final, );
		Temporada temporada_09_ = new Temporada(, "2022", 01, temp_09_inicio, temp_09_final, temp_09_antes, );
		Temporada temporada_10_ = new Temporada(, "2023", 01, temp_10_inicio, temp_10_final, temp_09_final, );
		
		clubeDao.atualiza();
		*/
		
		/*
		// Inserção Clubes Brasileiros sem estadual
		Clube cruzeiroSemEstadual = new Clube("Cruzeiro (S.E.)", "Minas Gerais", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube atleticoSemEstadual = new Clube("Atlético (S.E.)", "Minas Gerais", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube flamengoSemEstadual = new Clube("Flamengo (S.E.)", "Rio de Janeiro", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube vascoSemEstadual = new Clube("Vasco (S.E.)", "Rio de Janeiro", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube fluminenseSemEstadual = new Clube("Fluminense (S.E.)", "Rio de Janeiro", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube botafogoSemEstadual = new Clube("Botafogo (S.E.)", "Rio de Janeiro", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube gremioSemEstadual = new Clube("Grêmio (S.E.)", "Rio Grande do Sul", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube internacionalSemEstadual = new Clube("Internacional (S.E.)", "Rio Grande do Sul", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube saoPauloSemEstadual = new Clube("São Paulo (S.E.)", "São Paulo", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube santosSemEstadual = new Clube("Santos (S.E.)", "São Paulo", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube palmeirasSemEstadual = new Clube("Palemiras (S.E.)", "São Paulo", Categoria.BRASILEIRO_SEM_ESTADUAL);
		Clube corinthiansSemEstadual = new Clube("Corinthians (S.E.)", "São Paulo", Categoria.BRASILEIRO_SEM_ESTADUAL);
		
		clubeDao.adiciona(cruzeiroSemEstadual);
		clubeDao.adiciona(atleticoSemEstadual);
		clubeDao.adiciona(flamengoSemEstadual);
		clubeDao.adiciona(vascoSemEstadual);
		clubeDao.adiciona(fluminenseSemEstadual);
		clubeDao.adiciona(botafogoSemEstadual);
		clubeDao.adiciona(gremioSemEstadual);
		clubeDao.adiciona(internacionalSemEstadual);
		clubeDao.adiciona(saoPauloSemEstadual);
		clubeDao.adiciona(santosSemEstadual);
		clubeDao.adiciona(palmeirasSemEstadual);
		clubeDao.adiciona(corinthiansSemEstadual);
		*/
	}
}
