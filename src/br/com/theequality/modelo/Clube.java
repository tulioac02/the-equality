package br.com.theequality.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.theequality.util.Calculadora;

@Entity
public class Clube {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String localizacao;

	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@OneToMany(mappedBy="clube", fetch=FetchType.EAGER)
	private List<Temporada> temporadas;

	private Double mediaDuracaoPeriodoDeAtividades;
	private Double mediaNumeroTotaldeJogos;
	private Double mediaIntervaloEntreJogosBruto;
	private Double mediaIntervaloEntreJogosLiquido;
	private Double mediaIntervaloPeriodoDeAtividades;
	private Double mediaDiasDeDesconto;

	// Construtor padrão (necessário para Hibernate)
    public Clube() {
        // Inicializa a lista de temporadas no construtor padrão
        this.temporadas = new ArrayList<>();
    }

	public Clube(String nome, String localizacao, Categoria categoria) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.categoria = categoria;
		this.temporadas = new ArrayList<>();
		Calculadora.recalcularMedias(this);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	public Double getMediaDuracaoPeriodoDeAtividades() {
		return mediaDuracaoPeriodoDeAtividades;
	}

	public void setMediaDuracaoPeriodoDeAtividades(Double mediaDuracaoPeriodoDeAtividades) {
		this.mediaDuracaoPeriodoDeAtividades = mediaDuracaoPeriodoDeAtividades;
	}

	public Double getMediaIntervaloPeriodoDeAtividades() {
		return mediaIntervaloPeriodoDeAtividades;
	}

	public void setMediaIntervaloPeriodoDeAtividades(Double mediaIntervaloPeriodoDeAtividades) {
		this.mediaIntervaloPeriodoDeAtividades = mediaIntervaloPeriodoDeAtividades;
	}

	public Double getMediaNumeroTotaldeJogos() {
		return mediaNumeroTotaldeJogos;
	}

	public void setMediaNumeroTotaldeJogos(Double mediaNumeroTotaldeJogos) {
		this.mediaNumeroTotaldeJogos = mediaNumeroTotaldeJogos;
	}

	public Double getMediaIntervaloEntreJogosBruto() {
		return mediaIntervaloEntreJogosBruto;
	}

	public void setMediaIntervaloEntreJogosBruto(Double mediaIntervaloEntreJogosBruto) {
		this.mediaIntervaloEntreJogosBruto = mediaIntervaloEntreJogosBruto;
	}

	public Double getMediaIntervaloEntreJogosLiquido() {
		return mediaIntervaloEntreJogosLiquido;
	}

	public void setMediaIntervaloEntreJogosLiquido(Double mediaIntervaloEntreJogosLiquido) {
		this.mediaIntervaloEntreJogosLiquido = mediaIntervaloEntreJogosLiquido;
	}

	public Double getMediaDiasDeDesconto() {
		return mediaDiasDeDesconto;
	}

	public void setMediaDiasDeDesconto(Double mediaDesconto) {
		this.mediaDiasDeDesconto = mediaDesconto;
	}
	
	public void addTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
		Calculadora.recalcularMedias(this);
	}
	
	public void removeTemporada(Temporada temporada) {
        Iterator<Temporada> iterator = this.temporadas.iterator();
        while (iterator.hasNext()) {
            Temporada temp = iterator.next();
            if (temp.equals(temporada)) {
                iterator.remove();
                return; // Sai do método após remover a temporada
            }
        }
        Calculadora.recalcularMedias(this);
    }
}
