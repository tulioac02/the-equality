package br.com.theequality.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.theequality.modelo.Temporada;

@ManagedBean
@ViewScoped
public class SimuladorBean {

	// Datas e Dias de Desconto
	private Date dataPrimeiroJogoAtual;
	private Date dataUltimoJogoAtual;
	private Date dataUltimoJogoAnterior;
	private Integer diasDeDesconto;

	// Jogos por Campeonato
	private Integer jogosCopaIntercontinental;
	private Integer jogosCopaContinental;
	private Integer jogosSupercopaContinental;
	private Integer jogosCampeonatoNacional;
	private Integer jogosCopaNacional;
	private Integer jogosSupercopaNacional;
	private Integer jogosCopaSecundaria;
	private Integer jogosCampeonatoEstadual;

	// Resultados
	private Long duracaoPeriodoDeAtividades;
	private Long intervaloPeriodoDeAtividades;
	private Integer numeroTotalDeJogos;
	private Double intervaloBrutoEntreJogos;
	private Double intervaloLiquidoEntreJogos;

	// Notações
	private String notacaoDuracaoPeriodoDeAtividades;
	private String notacaoIntervaloPeriodoDeAtividades;
	private String notacaoNumeroTotalDeJogos;
	private String notacaoIntervaloBrutoEntreJogos;
	private String notacaoIntervaloLiquidoEntreJogos;

	public Date getDataPrimeiroJogoAtual() {
		return dataPrimeiroJogoAtual;
	}

	public void setDataPrimeiroJogoAtual(Date dataPrimeiroJogoAtual) {
		this.dataPrimeiroJogoAtual = dataPrimeiroJogoAtual;
	}

	public Date getDataUltimoJogoAtual() {
		return dataUltimoJogoAtual;
	}

	public void setDataUltimoJogoAtual(Date dataUltimoJogoAtual) {
		this.dataUltimoJogoAtual = dataUltimoJogoAtual;
	}

	public Date getDataUltimoJogoAnterior() {
		return dataUltimoJogoAnterior;
	}

	public void setDataUltimoJogoAnterior(Date dataUltimoJogoAnterior) {
		this.dataUltimoJogoAnterior = dataUltimoJogoAnterior;
	}

	public Integer getDiasDeDesconto() {
		return diasDeDesconto;
	}

	public void setDiasDeDesconto(Integer diasDeDesconto) {
		this.diasDeDesconto = diasDeDesconto;
	}

	public Integer getJogosCopaIntercontinental() {
		return jogosCopaIntercontinental;
	}

	public void setJogosCopaIntercontinental(Integer jogosCopaIntercontinental) {
		this.jogosCopaIntercontinental = jogosCopaIntercontinental;
	}

	public Integer getJogosCopaContinental() {
		return jogosCopaContinental;
	}

	public void setJogosCopaContinental(Integer jogosCopaContinental) {
		this.jogosCopaContinental = jogosCopaContinental;
	}

	public Integer getJogosSupercopaContinental() {
		return jogosSupercopaContinental;
	}

	public void setJogosSupercopaContinental(Integer jogosSupercopaContinental) {
		this.jogosSupercopaContinental = jogosSupercopaContinental;
	}

	public Integer getJogosCampeonatoNacional() {
		return jogosCampeonatoNacional;
	}

	public void setJogosCampeonatoNacional(Integer jogosCampeonatoNacional) {
		this.jogosCampeonatoNacional = jogosCampeonatoNacional;
	}

	public Integer getJogosCopaNacional() {
		return jogosCopaNacional;
	}

	public void setJogosCopaNacional(Integer jogosCopaNacional) {
		this.jogosCopaNacional = jogosCopaNacional;
	}

	public Integer getJogosSupercopaNacional() {
		return jogosSupercopaNacional;
	}

	public void setJogosSupercopaNacional(Integer jogosSupercopaNacional) {
		this.jogosSupercopaNacional = jogosSupercopaNacional;
	}

	public Integer getJogosCopaSecundaria() {
		return jogosCopaSecundaria;
	}

	public void setJogosCopaSecundaria(Integer jogosCopaSecundaria) {
		this.jogosCopaSecundaria = jogosCopaSecundaria;
	}

	public Integer getJogosCampeonatoEstadual() {
		return jogosCampeonatoEstadual;
	}

	public void setJogosCampeonatoEstadual(Integer jogosCampeonatoEstadual) {
		this.jogosCampeonatoEstadual = jogosCampeonatoEstadual;
	}

	public Long getDuracaoPeriodoDeAtividades() {
		return duracaoPeriodoDeAtividades;
	}

	public void setDuracaoPeriodoDeAtividades(Long duracaoPeriodoDeAtividades) {
		this.duracaoPeriodoDeAtividades = duracaoPeriodoDeAtividades;
	}

	public Long getIntervaloPeriodoDeAtividades() {
		return intervaloPeriodoDeAtividades;
	}

	public void setIntervaloPeriodoDeAtividades(Long intervaloPeriodoDeAtividades) {
		this.intervaloPeriodoDeAtividades = intervaloPeriodoDeAtividades;
	}

	public Integer getNumeroTotalDeJogos() {
		return numeroTotalDeJogos;
	}

	public void setNumeroTotalDeJogos(Integer numeroTotalDeJogos) {
		this.numeroTotalDeJogos = numeroTotalDeJogos;
	}

	public Double getIntervaloBrutoEntreJogos() {
		return intervaloBrutoEntreJogos;
	}

	public void setIntervaloBrutoEntreJogos(Double intervaloBrutoEntreJogos) {
		this.intervaloBrutoEntreJogos = intervaloBrutoEntreJogos;
	}

	public Double getIntervaloLiquidoEntreJogos() {
		return intervaloLiquidoEntreJogos;
	}

	public void setIntervaloLiquidoEntreJogos(Double intervaloLiquidoEntreJogos) {
		this.intervaloLiquidoEntreJogos = intervaloLiquidoEntreJogos;
	}

	public String getNotacaoDuracaoPeriodoDeAtividades() {
		return notacaoDuracaoPeriodoDeAtividades;
	}

	public void setNotacaoDuracaoPeriodoDeAtividades(String notacaoDuracaoPeriodoDeAtividades) {
		this.notacaoDuracaoPeriodoDeAtividades = notacaoDuracaoPeriodoDeAtividades;
	}

	public String getNotacaoIntervaloPeriodoDeAtividades() {
		return notacaoIntervaloPeriodoDeAtividades;
	}

	public void setNotacaoIntervaloPeriodoDeAtividades(String notacaoIntervaloPeriodoDeAtividades) {
		this.notacaoIntervaloPeriodoDeAtividades = notacaoIntervaloPeriodoDeAtividades;
	}

	public String getNotacaoNumeroTotalDeJogos() {
		return notacaoNumeroTotalDeJogos;
	}

	public void setNotacaoNumeroTotalDeJogos(String notacaoNumeroTotalDeJogos) {
		this.notacaoNumeroTotalDeJogos = notacaoNumeroTotalDeJogos;
	}

	public String getNotacaoIntervaloBrutoEntreJogos() {
		return notacaoIntervaloBrutoEntreJogos;
	}

	public void setNotacaoIntervaloBrutoEntreJogos(String notacaoIntervaloBrutoEntreJogos) {
		this.notacaoIntervaloBrutoEntreJogos = notacaoIntervaloBrutoEntreJogos;
	}

	public String getNotacaoIntervaloLiquidoEntreJogos() {
		return notacaoIntervaloLiquidoEntreJogos;
	}

	public void setNotacaoIntervaloLiquidoEntreJogos(String notacaoIntervaloLiquidoEntreJogos) {
		this.notacaoIntervaloLiquidoEntreJogos = notacaoIntervaloLiquidoEntreJogos;
	}

	private Temporada temporadaSelecionada;

	public Temporada getTemporadaSelecionada() {
		return temporadaSelecionada;
	}

	public void setTemporadaSelecionada(Temporada temporadaSelecionada) {
		this.temporadaSelecionada = temporadaSelecionada;
	}

	// Método para inicializar os campos com os dados da temporada selecionada
	@PostConstruct
	public void init() {
		FacesContext context = FacesContext.getCurrentInstance();

		// Recupera a temporada selecionada da sessão
		temporadaSelecionada = (Temporada) context.getExternalContext().getSessionMap().get("temporadaSelecionada");

		// Inicializa os campos com os dados da temporada selecionada
		if (temporadaSelecionada != null) {
			this.dataPrimeiroJogoAtual = temporadaSelecionada.getDataPrimeiroJogoAtual();
			this.dataUltimoJogoAtual = temporadaSelecionada.getDataUltimoJogoAtual();
			this.dataUltimoJogoAnterior = temporadaSelecionada.getDataUltimoJogoAnterior();
			this.diasDeDesconto = temporadaSelecionada.getDiasDeDesconto();
			this.jogosCopaIntercontinental = temporadaSelecionada.getJogosCopaIntercontinental();
			this.jogosCopaContinental = temporadaSelecionada.getJogosCopaContinental();
			this.jogosSupercopaContinental = temporadaSelecionada.getJogosCopaIntercontinental();
			this.jogosCampeonatoNacional = temporadaSelecionada.getJogosCampeonatoNacional();
			this.jogosCopaNacional = temporadaSelecionada.getJogosCopaNacional();
			this.jogosSupercopaNacional = temporadaSelecionada.getJogosSupercopaNacional();
			this.jogosCopaSecundaria = temporadaSelecionada.getJogosCopaSecundaria();
			this.jogosCampeonatoEstadual = temporadaSelecionada.getJogosCampeonatoEstadual();
			// Inicialize outros campos conforme necessário
		} else {
			// Trate o caso em que não há temporada selecionada
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Nenhuma temporada selecionada!"));
		}
		
		context.getExternalContext().getSessionMap().remove("temporadaSelecionada");
	}

	public void validaDataPrimeiroJogoAtual(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		Date dataPrimeiroJogoAtual = (Date) value;

		if (dataUltimoJogoAtual != null && dataPrimeiroJogoAtual.after(dataUltimoJogoAtual)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser posterior à Data da Última Partida da Temporada Atual"));
		}

		else if (dataUltimoJogoAnterior != null && dataPrimeiroJogoAtual.before(dataUltimoJogoAnterior)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Última Partida da Temporada Anterior"));
		}

		if (dataUltimoJogoAtual != null && dataPrimeiroJogoAtual != null) {
			long diffInMillis = dataUltimoJogoAtual.getTime() - dataPrimeiroJogoAtual.getTime();
			long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
			if (diffInDays > 365) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"A diferença entre a Primeira e a Última Partida da Temporada Atual não pode ser superior a 365 dias"));
			}
		}
	}

	public void validaDataUltimoJogoAtual(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		Date dataUltimoJogoAtual = (Date) value;
		if (dataPrimeiroJogoAtual != null && dataUltimoJogoAtual.before(dataPrimeiroJogoAtual)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Primeira Partida da Temporada Atual"));
		}
		else if (dataUltimoJogoAnterior != null && dataUltimoJogoAtual.before(dataUltimoJogoAnterior)) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Última Partida da Temporada Anterior"));
		}
		
		if (dataPrimeiroJogoAtual != null && dataUltimoJogoAtual != null) {
			long diffInMillis = dataUltimoJogoAtual.getTime() - dataPrimeiroJogoAtual.getTime();
			long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
			if (diffInDays > 365) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"A diferença entre a Primeira e a Última Partida da Temporada Atual não pode ser superior a 365 dias"));
			}
		}
	}

	public void validaDataUltimoJogoAnterior(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		if (value != null) {
			Date dataUltimoJogoAnterior = (Date) value;

			if (dataPrimeiroJogoAtual != null && dataUltimoJogoAnterior.after(dataPrimeiroJogoAtual)) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"Esta Data não pode ser posterior à Data da Primeira Partida da Temporada Atual"));
			}

			else if (dataUltimoJogoAtual != null && dataUltimoJogoAnterior.after(dataUltimoJogoAtual)) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"Esta Data não pode ser posterior à Data da Última Partida da Temporada Atual"));
			}
		} else {
			return;
		}

	}

	public void calcular() {
		FacesContext context = FacesContext.getCurrentInstance();

		if (dataPrimeiroJogoAtual == null) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro",
					"Data do Primeiro Jogo Temporada Atual é obrigatória"));
			return;
		} else if (dataUltimoJogoAtual == null) {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro",
					"Data do Último Jogo da Temporada Atual é obrigatória"));
			return;
		}

		LocalDate primeiroJogoAtual = dataPrimeiroJogoAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate ultimoJogoAtual = dataUltimoJogoAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate ultimoJogoAnterior = null;
		if (dataUltimoJogoAnterior != null) {
			ultimoJogoAnterior = dataUltimoJogoAnterior.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		}

		duracaoPeriodoDeAtividades = ChronoUnit.DAYS.between(primeiroJogoAtual, ultimoJogoAtual);

		if (duracaoPeriodoDeAtividades == 0) {
			notacaoDuracaoPeriodoDeAtividades = "Sem informação";
		} else if (duracaoPeriodoDeAtividades >= 305) {
			notacaoDuracaoPeriodoDeAtividades = "Inadequado por excesso";
		} else if (duracaoPeriodoDeAtividades >= 200) {
			notacaoDuracaoPeriodoDeAtividades = "Adequado";
		} else if (duracaoPeriodoDeAtividades < 200) {
			notacaoDuracaoPeriodoDeAtividades = "Inadequado por ausência";
		}

		if (ultimoJogoAnterior != null) {
			intervaloPeriodoDeAtividades = ChronoUnit.DAYS.between(ultimoJogoAnterior, primeiroJogoAtual);
		} else {
			intervaloPeriodoDeAtividades = (long) 0;
		}
		if (intervaloPeriodoDeAtividades == 0) {
			notacaoIntervaloPeriodoDeAtividades = "Sem informação";
		} else if (intervaloPeriodoDeAtividades > 90) {
			notacaoIntervaloPeriodoDeAtividades = "Inadequado por excesso";
		} else if (intervaloPeriodoDeAtividades >= 60) {
			notacaoIntervaloPeriodoDeAtividades = "Adequado";
		} else if (intervaloPeriodoDeAtividades < 60) {
			notacaoIntervaloPeriodoDeAtividades = "Inadequado por ausência";
		}

		numeroTotalDeJogos = (jogosCopaIntercontinental != null ? jogosCopaIntercontinental : 0)
				+ (jogosCopaContinental != null ? jogosCopaContinental : 0)
				+ (jogosSupercopaContinental != null ? jogosSupercopaContinental : 0)
				+ (jogosCampeonatoNacional != null ? jogosCampeonatoNacional : 0)
				+ (jogosCopaNacional != null ? jogosCopaNacional : 0)
				+ (jogosSupercopaNacional != null ? jogosSupercopaNacional : 0)
				+ (jogosCopaSecundaria != null ? jogosCopaSecundaria : 0)
				+ (jogosCampeonatoEstadual != null ? jogosCampeonatoEstadual : 0);

		if (numeroTotalDeJogos == 0) {
			notacaoNumeroTotalDeJogos = "Sem informação";
		} else if (numeroTotalDeJogos > 69) {
			notacaoNumeroTotalDeJogos = "Inadequado por excesso";
		} else if (numeroTotalDeJogos >= 30) {
			notacaoNumeroTotalDeJogos = "Adequado";
		} else if (numeroTotalDeJogos < 30) {
			notacaoNumeroTotalDeJogos = "Inadequado por ausência";
		}

		int diasDeDescontoCorrigido = (diasDeDesconto != null) ? diasDeDesconto : 0;

		if (numeroTotalDeJogos > 0) {
			BigDecimal bruto = BigDecimal.valueOf((double) duracaoPeriodoDeAtividades / numeroTotalDeJogos);
			intervaloBrutoEntreJogos = bruto.setScale(2, RoundingMode.HALF_UP).doubleValue();

			BigDecimal liquido = BigDecimal
					.valueOf((double) (duracaoPeriodoDeAtividades - diasDeDescontoCorrigido) / numeroTotalDeJogos);
			intervaloLiquidoEntreJogos = liquido.setScale(2, RoundingMode.HALF_UP).doubleValue();
		} else {
			intervaloBrutoEntreJogos = (double) 0;
			intervaloLiquidoEntreJogos = (double) 0;
		}

		if (intervaloBrutoEntreJogos == 0) {
			notacaoIntervaloBrutoEntreJogos = "Sem informação";
		} else if (intervaloBrutoEntreJogos > 7.0) {
			notacaoIntervaloBrutoEntreJogos = "Inadequado por excesso";
		} else if (intervaloBrutoEntreJogos >= 3.0) {
			notacaoIntervaloBrutoEntreJogos = "Adequado";
		} else if (intervaloBrutoEntreJogos < 3.00) {
			notacaoIntervaloBrutoEntreJogos = "Inadequado por ausência";
		}

		if (intervaloLiquidoEntreJogos == 0.0) {
			notacaoIntervaloLiquidoEntreJogos = "Sem informação";
		} else if (intervaloLiquidoEntreJogos > 7.0) {
			notacaoIntervaloLiquidoEntreJogos = "Inadequado por excesso";
		} else if (intervaloLiquidoEntreJogos >= 3.0) {
			notacaoIntervaloLiquidoEntreJogos = "Adequado";
		} else if (intervaloLiquidoEntreJogos < 3.0) {
			notacaoIntervaloLiquidoEntreJogos = "Inadequado por ausência";
		}
	}

	public void limpar() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("temporadaSelecionada");

		this.dataPrimeiroJogoAtual = null;
		this.dataUltimoJogoAtual = null;
		this.dataUltimoJogoAnterior = null;
		this.diasDeDesconto = null;
		this.jogosCopaIntercontinental = null;
		this.jogosCopaContinental = null;
		this.jogosSupercopaContinental = null;
		this.jogosCampeonatoNacional = null;
		this.jogosCopaNacional = null;
		this.jogosSupercopaNacional = null;
		this.jogosCopaSecundaria = null;
		this.jogosCampeonatoEstadual = null;
		this.duracaoPeriodoDeAtividades = null;
		this.intervaloPeriodoDeAtividades = null;
		this.numeroTotalDeJogos = null;
		this.intervaloBrutoEntreJogos = null;
		this.intervaloLiquidoEntreJogos = null;

		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Limpeza realizada com sucesso!", null));
	}
}