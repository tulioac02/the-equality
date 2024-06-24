package br.com.theequality.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.theequality.util.Calculadora;

@Entity
public class Temporada {

	// Variáveis iniciais
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String temporada;
	private Integer divisaoNacional;
	private Date dataPrimeiroJogoAtual;
	private Date dataUltimoJogoAtual;
	private Date dataUltimoJogoAnterior;

	private Integer diasDeDesconto;

	// Variáveis de jogos
	private Integer jogosCopaIntercontinental;
	private Integer jogosCopaContinental;
	private Integer jogosSupercopaContinental;
	private Integer jogosCampeonatoNacional;
	private Integer jogosCopaNacional;
	private Integer jogosSupercopaNacional;
	private Integer jogosCopaSecundaria;
	private Integer jogosCampeonatoEstadual;

	// Variáveis calculadas
	private Integer duracaoPeriodoDeAtividades;
	private Integer numeroTotaldeJogos;
	private Integer intervaloPeriodoDeAtividades;

	@Column(precision = 10, scale = 2)
	private Double intervaloBrutoEntreJogos;

	@Column(precision = 10, scale = 2)
	private Double intervaloLiquidoEntreJogos;

	@ManyToOne(fetch = FetchType.EAGER)
	private Clube clube;

	// Construtor padrão (necessário para Hibernate)
	public Temporada() {
	}

	// Construtor completo
	public Temporada(Clube clube, String temporada, int divisaoNacional, Date dataPrimeiroJogoAtual,
			Date dataUltimoJogoAtual, Date dataUltimoJogoAnterior, int diasDeDesconto,
			int jogosCopaIntercontinental, int jogosCopaContinental, int jogosSupercopaContinental,
			int jogosCampeonatoNacional, int jogosCopaNacional, int jogosSupercopaNacional, int jogosCopaSecundaria,
			int jogosCampeonatoEstadual) {

		// Variáveis iniciais
		this.clube = clube;
		this.temporada = temporada;
		this.divisaoNacional = Integer.valueOf(divisaoNacional);
		this.dataPrimeiroJogoAtual = dataPrimeiroJogoAtual;
		this.dataUltimoJogoAtual = dataUltimoJogoAtual;
		this.dataUltimoJogoAnterior = dataUltimoJogoAnterior;
		this.diasDeDesconto = Integer.valueOf(diasDeDesconto);

		// Variáveis de jogos
		this.jogosCopaIntercontinental = Integer.valueOf(jogosCopaIntercontinental);
		this.jogosCopaContinental = Integer.valueOf(jogosCopaContinental);
		this.jogosSupercopaContinental = Integer.valueOf(jogosSupercopaContinental);
		this.jogosCampeonatoNacional = Integer.valueOf(jogosCampeonatoNacional);
		this.jogosCopaNacional = Integer.valueOf(jogosCopaNacional);
		this.jogosSupercopaNacional = Integer.valueOf(jogosSupercopaNacional);
		this.jogosCopaSecundaria = Integer.valueOf(jogosCopaSecundaria);
		this.jogosCampeonatoEstadual = Integer.valueOf(jogosCampeonatoEstadual);

		Calculadora.calculaResultados(this);

		if (clube != null) {
			clube.addTemporada(this);
			Calculadora.recalcularMedias(clube);
		}
	}

	// Construtor sem estadual
	public Temporada(Clube clube, String temporada, int divisaoNacional, Date dataPrimeiroJogoAtual,
			Date dataUltimoJogoAtual, Date dataUltimoJogoAnterior, int diasDeDesconto,
			int jogosCopaIntercontinental, int jogosCopaContinental, int jogosSupercopaContinental,
			int jogosCampeonatoNacional, int jogosCopaNacional, int jogosSupercopaNacional, int jogosCopaSecundaria) {

		this(clube, temporada, divisaoNacional, dataPrimeiroJogoAtual, dataUltimoJogoAtual, dataUltimoJogoAnterior,
				diasDeDesconto, jogosCopaIntercontinental, jogosCopaContinental, jogosSupercopaContinental,
				jogosCampeonatoNacional, jogosCopaNacional, jogosSupercopaNacional, jogosCopaSecundaria, 0);
	}

	// Construtor sem estadual e copa secundária
	public Temporada(Clube clube, String temporada, int divisaoNacional, Date dataPrimeiroJogoAtual,
			Date dataUltimoJogoAtual, Date dataUltimoJogoAnterior, int diasDeDesconto,
			int jogosCopaIntercontinental, int jogosCopaContinental, int jogosSupercopaContinental,
			int jogosCampeonatoNacional, int jogosCopaNacional, int jogosSupercopaNacional) {

		this(clube, temporada, divisaoNacional, dataPrimeiroJogoAtual, dataUltimoJogoAtual, dataUltimoJogoAnterior,
				diasDeDesconto, jogosCopaIntercontinental, jogosCopaContinental, jogosSupercopaContinental,
				jogosCampeonatoNacional, jogosCopaNacional, jogosSupercopaNacional, 0, 0);
	}

	// Construtor sem clube
	public Temporada(String temporada, int divisaoNacional, Date dataPrimeiroJogoAtual,
			Date dataUltimoJogoAtual, Date dataUltimoJogoAnterior, int diasDeDesconto,
			int jogosCopaIntercontinental, int jogosCopaContinental, int jogosSupercopaContinental,
			int jogosCampeonatoNacional, int jogosCopaNacional, int jogosSupercopaNacional, int jogosCopaSecundaria,
			int jogosCampeonatoEstadual) {

		this(null, temporada, divisaoNacional, dataPrimeiroJogoAtual, dataUltimoJogoAtual, dataUltimoJogoAnterior,
				diasDeDesconto, jogosCopaIntercontinental, jogosCopaContinental, jogosSupercopaContinental,
				jogosCampeonatoNacional, jogosCopaNacional, jogosSupercopaNacional, jogosCopaSecundaria,
				jogosCampeonatoEstadual);

	}

//	// Construtor só com clube
//	public Temporada(Clube clube) {
//		this(clube, "", 1, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Integer getDivisaoNacional() {
		return divisaoNacional;
	}

	public void setDivisaoNacional(Integer divisaoNacional) {
		this.divisaoNacional = divisaoNacional;
	}

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

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
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

	public Integer getDuracaoPeriodoDeAtividades() {
		return duracaoPeriodoDeAtividades;
	}

	public void setDuracaoPeriodoDeAtividades(Integer duracaoPeriodoDeAtividades) {
		this.duracaoPeriodoDeAtividades = duracaoPeriodoDeAtividades;
	}

	public Integer getNumeroTotaldeJogos() {
		return numeroTotaldeJogos;
	}

	public void setNumeroTotaldeJogos(Integer numeroTotaldeJogos) {
		this.numeroTotaldeJogos = numeroTotaldeJogos;
	}

	public Integer getIntervaloPeriodoDeAtividades() {
		return intervaloPeriodoDeAtividades;
	}

	public void setIntervaloPeriodoDeAtividades(Integer intervaloPeriodoDeAtividades) {
		this.intervaloPeriodoDeAtividades = intervaloPeriodoDeAtividades;
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
}
