package br.com.theequality.bean;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import br.com.theequality.dao.DAO;
import br.com.theequality.modelo.Clube;
import br.com.theequality.modelo.Temporada;
import br.com.theequality.util.Calculadora;

@ManagedBean
@ViewScoped
public class TemporadaBean {
	private Temporada temporada = new Temporada();

	private Integer temporadaId;

	private Integer clubeId;

	private List<Temporada> temporadas;

	public Temporada getTemporada() {
		return temporada;
	}

	public Integer getTemporadaId() {
		return temporadaId;
	}

	public Integer getClubeId() {
		return clubeId;
	}

	public void setClubeId(Integer clubeId) {
		this.clubeId = clubeId;
	}

	public List<Temporada> getTemporadas() {

		DAO<Temporada> dao = new DAO<Temporada>(Temporada.class);

		if (this.temporadas == null) {
			this.temporadas = dao.listaTodos();
		}

		return temporadas;
	}

	public List<Clube> getClubes() {
		return new DAO<Clube>(Clube.class).listaTodos();
	}

	public void carregarTemporadaPelaId() {
		this.temporada = new DAO<Temporada>(Temporada.class).buscaPorId(temporadaId);
	}

	public void carregar(Temporada temporada) {
		System.out.println("Carregando temporada " + temporada.getTemporada());
		this.temporada = temporada;
		this.clubeId = temporada.getClube().getId();
	}

	public void validaDataPrimeiroJogoAtual(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		Date dataPrimeiroJogoAtual = (Date) value;

		if (temporada.getDataUltimoJogoAtual() != null
				&& dataPrimeiroJogoAtual.after(temporada.getDataUltimoJogoAtual())) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser posterior à Data da Última Partida da Temporada Atual"));
		}

		else if (temporada.getDataUltimoJogoAnterior() != null
				&& dataPrimeiroJogoAtual.before(temporada.getDataUltimoJogoAnterior())) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Última Partida da Temporada Anterior"));
		}

		if (temporada.getDataUltimoJogoAtual() != null && dataPrimeiroJogoAtual != null) {
			long diffInMillis = temporada.getDataUltimoJogoAtual().getTime() - dataPrimeiroJogoAtual.getTime();
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

		if (temporada.getDataPrimeiroJogoAtual() != null
				&& dataUltimoJogoAtual.before(temporada.getDataPrimeiroJogoAtual())) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Primeira Partida da Temporada Atual"));
		}

		else if (temporada.getDataUltimoJogoAnterior() != null
				&& dataUltimoJogoAtual.before(temporada.getDataUltimoJogoAnterior())) {
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
					"Esta Data não pode ser anterior à Data da Última Partida da Temporada Anterior"));
		}

		if (temporada.getDataPrimeiroJogoAtual() != null && dataUltimoJogoAtual != null) {
			long diffInMillis = dataUltimoJogoAtual.getTime() - temporada.getDataPrimeiroJogoAtual().getTime();
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

			if (temporada.getDataPrimeiroJogoAtual() != null
					&& dataUltimoJogoAnterior.after(temporada.getDataPrimeiroJogoAtual())) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"Esta Data não pode ser posterior à Data da Primeira Partida da Temporada Atual"));
			}
			else if (temporada.getDataUltimoJogoAtual() != null
					&& dataUltimoJogoAnterior.after(temporada.getDataUltimoJogoAtual())) {
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro de Validação",
						"Esta Data não pode ser posterior à Data da Última Partida da Temporada Atual"));
			}
		} else {
			return;
		}

	}

	public void remover(Temporada temporada) {
		System.out.println("Removendo clube " + temporada.getTemporada());
		FacesContext context = FacesContext.getCurrentInstance();

		// Associa o clube com o clube da temporada
		Clube clube = temporada.getClube();

		// Remover a temporada do clube
		clube.removeTemporada(temporada);

		// Recalcula as médias do clube (opcional)
		Calculadora.recalcularMedias(clube);

		// Atualizar o clube no banco de dados
		new DAO<Clube>(Clube.class).atualiza(clube);

		// Remoção da temporada do banco de dados
		new DAO<Temporada>(Temporada.class).remove(temporada);

		// Removendo a temporada da lista
		temporadas.remove(temporada);

		// Limpando a temporada
		temporada = new Temporada();

		// Atualiza a lista de temporadas
		temporadas = new DAO<Temporada>(Temporada.class).listaTodos();

		context.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Temporada removida com sucesso!"));
	}

	public void gravar() {
		System.out.println("Gravando temporada " + this.temporada.getTemporada());

		FacesContext context = FacesContext.getCurrentInstance();

		if (this.clubeId != null) {
			
			DAO<Clube> clubeDao = new DAO<Clube>(Clube.class);
			DAO<Temporada> temporadaDao = new DAO<Temporada>(Temporada.class);

			if (this.temporada.getId() == null) {
				try {
					// Cria o clube e associa faz ele receber o clube referente a id
					Clube clube = clubeDao.buscaPorId(this.clubeId);

					// Adiciona o clube na temporada
					temporada.setClube(clube);

					// Calcula os resultados da temporada
					Calculadora.calculaResultados(temporada);

					// Adiciona a temporada no banco de dados
					temporadaDao.adiciona(temporada);

					// Adiciona a temporada no clube
					clube.addTemporada(temporada);

					// Recalcula as médias do clube (opcional)
					Calculadora.recalcularMedias(clube);

					// Atualiza o clube
					clubeDao.atualiza(clube);

					// Atualiza a lista de temporadas
					temporadas = temporadaDao.listaTodos();

					context.addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Temporada criada com sucesso!"));
				} catch (Exception e) {
					context.addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Erro ao criar a temporada!"));
				}
			} else {
				try {
					// Calcula os resultados da temporada
					Calculadora.calculaResultados(temporada);

					// Associa o clube com o clube da temporada
					Clube clube = temporada.getClube();

					if (clubeId == clube.getId()) {

						// Recalcula as médias do clube
						Calculadora.recalcularMedias(clube);

						// Atualiza o clube no banco de dados
						clubeDao.atualiza(clube);

					} else {

						// Remover a temporada do clube atual
						clube.removeTemporada(temporada);

						// Recalcula as médias do clube (opcional)
						Calculadora.recalcularMedias(clube);

						// Atualizar o clube no banco de dados
						clubeDao.atualiza(clube);

						// Busca o novo clube
						clube = new DAO<Clube>(Clube.class).buscaPorId(clubeId);

						// Adiciona a temporada no clube
						clube.addTemporada(temporada);

						// Recalcula as médias do clube (opcional)
						Calculadora.recalcularMedias(clube);

						// Atualiza o clube
						clubeDao.atualiza(clube);
						
						// Adiciona a tmporada ao novo clube
						this.temporada.setClube(clube);

					}
					
					// Atualiza os dados da temporada
					temporadaDao.atualiza(temporada);

					// Atualiza a lista de temporadas
					temporadas = temporadaDao.listaTodos();

					context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso",
							"Temporada atualizada com sucesso!"));

				} catch (Exception e) {
					context.addMessage(null,
							new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Erro ao atualizar a temporada!"));
				}
			}

			temporada = new Temporada();
			clubeId = null;

		} else {
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Clube não selecionado"));
			return;
		}
	}
	
	public void limpar() {
//        this.temporada.set(null);
		this.temporada.setClube(null);
		this.temporada.setTemporada(null);
		this.temporada.setDataPrimeiroJogoAtual(null);
		this.temporada.setDataUltimoJogoAtual(null);
		this.temporada.setDataUltimoJogoAnterior(null);
		this.temporada.setDiasDeDesconto(null);
		this.temporada.setDivisaoNacional(null);
		
		this.temporada.setJogosCopaIntercontinental(null);
		this.temporada.setJogosCopaContinental(null);
		this.temporada.setJogosSupercopaContinental(null);
		this.temporada.setJogosCampeonatoNacional(null);
		this.temporada.setJogosCopaNacional(null);
		this.temporada.setJogosSupercopaNacional(null);
		this.temporada.setJogosCopaSecundaria(null);
		this.temporada.setJogosCampeonatoEstadual(null);
    }
}
