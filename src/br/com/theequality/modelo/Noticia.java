package br.com.theequality.modelo;

public class Noticia {
	private String titulo;
	private String descricao;
	private String imagem;
	private String link;

	public Noticia(String titulo, String descricao, String imagem, String link) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.imagem = imagem;
		this.link = link;
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
