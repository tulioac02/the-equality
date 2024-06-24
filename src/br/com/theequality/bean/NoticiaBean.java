package br.com.theequality.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.theequality.modelo.Noticia;

@ManagedBean
@ViewScoped
public class NoticiaBean {

    private List<Noticia> noticias;

    @PostConstruct
    public void init() {
        noticias = new ArrayList<>();
        noticias.add(new Noticia(
                "Por que os Estaduais estão perdendo relevância? E o que fazer com eles?",
                "Os Estaduais fazem parte da história do futebol brasileiro, mas hoje cada vez mais chegamos à conclusão de que ele não faz mais sentido. E por que ainda existe? Um fator preponderante é a política",
                "estaduais.png",
                "https://trivela.com.br/brasil/por-que-os-estaduais-estao-perdendo-relevancia-e-o-que-fazer-com-eles/"
        ));
        noticias.add(new Noticia(
                "Em alta: CBF registrou 1.276 clubes em 2022",
                "Diretoria de Registro, Transferência e Licenciamento contabiliza aumento de 19% de equipes profissionais e amadoras no ano passado",
                "clubes.jpeg",
                "https://www.cbf.com.br/a-cbf/informes/index/em-alta-cbf-registrou-1-276-clubes-em-2022"
        ));
        noticias.add(new Noticia(
                "Os impérios esportivos mais valiosos do mundo em 2023",
                "No ano, o valor das equipes que lideram os gigantes do esporte cresceu 23%, totalizando R$ 174 bilhões",
                "imperios.jpeg",
                "https://forbes.com.br/forbes-money/2023/01/os-imperios-esportivos-mais-valiosos-do-mundo-em-2023/"
        ));
        noticias.add(new Noticia(
                "Por que os Estaduais estão perdendo relevância? E o que fazer com eles?",
                "Os Estaduais fazem parte da história do futebol brasileiro, mas hoje cada vez mais chegamos à conclusão de que ele não faz mais sentido. E por que ainda existe? Um fator preponderante é a política",
                "estaduais.png",
                "https://trivela.com.br/brasil/por-que-os-estaduais-estao-perdendo-relevancia-e-o-que-fazer-com-eles/"
        ));
        noticias.add(new Noticia(
                "Em alta: CBF registrou 1.276 clubes em 2022",
                "Diretoria de Registro, Transferência e Licenciamento contabiliza aumento de 19% de equipes profissionais e amadoras no ano passado",
                "clubes.jpeg",
                "https://www.cbf.com.br/a-cbf/informes/index/em-alta-cbf-registrou-1-276-clubes-em-2022"
        ));
        noticias.add(new Noticia(
                "Os impérios esportivos mais valiosos do mundo em 2023",
                "No ano, o valor das equipes que lideram os gigantes do esporte cresceu 23%, totalizando R$ 174 bilhões",
                "imperios.jpeg",
                "https://forbes.com.br/forbes-money/2023/01/os-imperios-esportivos-mais-valiosos-do-mundo-em-2023/"
        ));
        noticias.add(new Noticia(
                "Por que os Estaduais estão perdendo relevância? E o que fazer com eles?",
                "Os Estaduais fazem parte da história do futebol brasileiro, mas hoje cada vez mais chegamos à conclusão de que ele não faz mais sentido. E por que ainda existe? Um fator preponderante é a política",
                "estaduais.png",
                "https://trivela.com.br/brasil/por-que-os-estaduais-estao-perdendo-relevancia-e-o-que-fazer-com-eles/"
        ));
        noticias.add(new Noticia(
                "Em alta: CBF registrou 1.276 clubes em 2022",
                "Diretoria de Registro, Transferência e Licenciamento contabiliza aumento de 19% de equipes profissionais e amadoras no ano passado",
                "clubes.jpeg",
                "https://www.cbf.com.br/a-cbf/informes/index/em-alta-cbf-registrou-1-276-clubes-em-2022"
        ));
        noticias.add(new Noticia(
                "Os impérios esportivos mais valiosos do mundo em 2023",
                "No ano, o valor das equipes que lideram os gigantes do esporte cresceu 23%, totalizando R$ 174 bilhões",
                "imperios.jpeg",
                "https://forbes.com.br/forbes-money/2023/01/os-imperios-esportivos-mais-valiosos-do-mundo-em-2023/"
        ));
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

}
