package br.com.theequality.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Conversor {
	public static Calendar converteStringParaCalendar(String dataString) {
		Calendar calendar = Calendar.getInstance();
		 try {
	            // Definir o formato da data
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            
	            // Analisar a string da data para um objeto Date
	            Date data = sdf.parse(dataString);
	            
	            // Definir o valor da data no objeto Calendar
	            calendar.setTime(data);
	            
	            // Exibir o resultado
//	            System.out.println("Data convertida: " + calendar.getTime());
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		return calendar;
	}
}
