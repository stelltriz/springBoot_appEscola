package br.ETS.Feedback.informacoes;

import br.ETS.Feedback.instrutor.DTO.DadosInformacoes;
import lombok.*;

@Getter //faz métodos get para todos os atributos
@Setter //faz métodos set para todos os atributos
@AllArgsConstructor //faz o construtor com todos os atributos
@NoArgsConstructor //faz o construtor padrão, sem atributos
@EqualsAndHashCode //faz o método equals e métodos hashcode

public class Informacoes {
    private String disciplina;
    private String trilha;
    private String faculdade;
    private String turma;

    public Informacoes(DadosInformacoes dadosInformacoes){
        this.disciplina = dadosInformacoes.disciplina();
        this.trilha = dadosInformacoes.trilha();
        this.faculdade = dadosInformacoes.faculdade();
        this.turma = dadosInformacoes.turma();
    }
}
