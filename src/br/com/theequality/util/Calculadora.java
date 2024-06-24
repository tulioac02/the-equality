package br.com.theequality.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import br.com.theequality.modelo.Clube;
import br.com.theequality.modelo.Temporada;

public class Calculadora {

	// Função para recalcular médias dos clubes
	public static void recalcularMedias(Clube clube) {
	    if (!clube.getTemporadas().isEmpty()) {
	        
	        int totalTemporadas = clube.getTemporadas().size();
	        double totalDuracaoPeriodoDeAtividades = 0;
	        double totalDiasDeDesconto = 0;
	        double totalNumeroTotaldeJogos = 0;
	        double totalIntervaloEntreJogosBruto = 0;
	        double totalIntervaloEntreJogosLiquido = 0;
	        double totalIntervaloPeriodoDeAtividades = 0;

	        // Calcula o total de cada atributo somando todos os valores
	        for (Temporada temporada : clube.getTemporadas()) {
	            totalDuracaoPeriodoDeAtividades += temporada.getDuracaoPeriodoDeAtividades();
	            totalDiasDeDesconto += temporada.getDiasDeDesconto();
	            totalNumeroTotaldeJogos += temporada.getNumeroTotaldeJogos();
	            totalIntervaloEntreJogosBruto += temporada.getIntervaloBrutoEntreJogos();
	            totalIntervaloEntreJogosLiquido += temporada.getIntervaloLiquidoEntreJogos();
	            totalIntervaloPeriodoDeAtividades += temporada.getIntervaloPeriodoDeAtividades();
	        }

	        // Calcula as médias dividindo pelo número total de temporadas
	        clube.setMediaDuracaoPeriodoDeAtividades(totalDuracaoPeriodoDeAtividades / totalTemporadas);
	        clube.setMediaDiasDeDesconto(totalDiasDeDesconto / totalTemporadas);
	        clube.setMediaNumeroTotaldeJogos(totalNumeroTotaldeJogos / totalTemporadas);

	        // Ajusta intervalo entre jogos bruto para 2 casas decimais
	        BigDecimal mediaIntervaloBrutoBD = BigDecimal.valueOf(totalIntervaloEntreJogosBruto / totalTemporadas)
	                .setScale(2, RoundingMode.HALF_UP);
	        clube.setMediaIntervaloEntreJogosBruto(mediaIntervaloBrutoBD.doubleValue());

	        // Ajusta intervalo entre jogos líquido para 2 casas decimais
	        BigDecimal mediaIntervaloLiquidoBD = BigDecimal.valueOf(totalIntervaloEntreJogosLiquido / totalTemporadas)
	                .setScale(2, RoundingMode.HALF_UP);
	        clube.setMediaIntervaloEntreJogosLiquido(mediaIntervaloLiquidoBD.doubleValue());

	        clube.setMediaIntervaloPeriodoDeAtividades(totalIntervaloPeriodoDeAtividades / totalTemporadas);
	    } else {
	        // Se não houver temporadas, define todas as médias como zero
	        clube.setMediaNumeroTotaldeJogos(0.0);
	        clube.setMediaDuracaoPeriodoDeAtividades(0.0);
	        clube.setMediaDiasDeDesconto(0.0);
	        clube.setMediaIntervaloPeriodoDeAtividades(0.0);
	        clube.setMediaIntervaloEntreJogosBruto(0.0);
	        clube.setMediaIntervaloEntreJogosLiquido(0.0);
	    }
	}


	public static int calcularDiferencaEmDias(Date dataInicio, Date dataFim) {
		Calendar inicio = Calendar.getInstance();
		inicio.setTime(dataInicio);

		Calendar fim = Calendar.getInstance();
		fim.setTime(dataFim);

		long milissegundosInicio = inicio.getTimeInMillis();
		long milissegundosFim = fim.getTimeInMillis();

		// Calcular a diferença em milissegundos
		long diferencaEmMilissegundos = milissegundosFim - milissegundosInicio;

		// Converter a diferença para dias
		long diferencaEmDias = diferencaEmMilissegundos / (24 * 60 * 60 * 1000);

		return (int) diferencaEmDias;
	}

	// Função para calcuulas as variáveis resultado das temporadas
	public static void calculaResultados(Temporada temporada) {
		if (temporada.getDataPrimeiroJogoAtual() != null && temporada.getDataUltimoJogoAtual() != null
				&& temporada.getDataUltimoJogoAnterior() != null) {
			temporada.setDuracaoPeriodoDeAtividades(
					calcularDiferencaEmDias(temporada.getDataPrimeiroJogoAtual(), temporada.getDataUltimoJogoAtual()));
			temporada.setIntervaloPeriodoDeAtividades(calcularDiferencaEmDias(temporada.getDataUltimoJogoAnterior(),
					temporada.getDataPrimeiroJogoAtual()));
		} else {
			temporada.setDuracaoPeriodoDeAtividades(0);
			temporada.setIntervaloPeriodoDeAtividades(0);
		}

		if (temporada.getJogosCopaIntercontinental() != 0 || temporada.getJogosCopaContinental() != 0
				|| temporada.getJogosSupercopaContinental() != 0 || temporada.getJogosCampeonatoNacional() != 0
				|| temporada.getJogosCopaNacional() != 0 || temporada.getJogosSupercopaNacional() != 0
				|| temporada.getJogosCopaSecundaria() != 0 || temporada.getJogosCampeonatoEstadual() != 0) {
			temporada.setNumeroTotaldeJogos(
					temporada.getJogosCopaIntercontinental() + temporada.getJogosCopaContinental()
							+ temporada.getJogosSupercopaContinental() + temporada.getJogosCampeonatoNacional()
							+ temporada.getJogosCopaNacional() + temporada.getJogosSupercopaNacional()
							+ temporada.getJogosCopaSecundaria() + temporada.getJogosCampeonatoEstadual());
		} else {
			temporada.setNumeroTotaldeJogos(0);
		}

		if (temporada.getNumeroTotaldeJogos() != 0) {

			BigDecimal duracaoBD = new BigDecimal(temporada.getDuracaoPeriodoDeAtividades());
			BigDecimal diasDeDescontoBD = new BigDecimal(temporada.getDiasDeDesconto());
			BigDecimal numeroTotalDeJogosBD = new BigDecimal(temporada.getNumeroTotaldeJogos());

			BigDecimal intervaloEntreJogosBrutoBD = duracaoBD.divide(numeroTotalDeJogosBD, 3, RoundingMode.HALF_UP);
			intervaloEntreJogosBrutoBD = intervaloEntreJogosBrutoBD.setScale(2, RoundingMode.HALF_UP);
			temporada.setIntervaloBrutoEntreJogos(intervaloEntreJogosBrutoBD.doubleValue());

			BigDecimal intervaloEntreJogosLiquidoBD = (duracaoBD.subtract(diasDeDescontoBD))
					.divide(numeroTotalDeJogosBD, 3, RoundingMode.HALF_UP);
			intervaloEntreJogosLiquidoBD = intervaloEntreJogosLiquidoBD.setScale(2, RoundingMode.HALF_UP);
			temporada.setIntervaloLiquidoEntreJogos(intervaloEntreJogosLiquidoBD.doubleValue());

		} else {
			temporada.setIntervaloBrutoEntreJogos((double) 0);
			temporada.setIntervaloLiquidoEntreJogos((double) 0);
		}
	}
}
