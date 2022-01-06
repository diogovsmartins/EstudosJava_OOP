package Java_io;

import java.io.Serializable;

public class Cliente implements Serializable  {
    private static final long serialVersionUID=1116241507917843982L;
    /*SerialVersionUID é usado em toda classe que será serializada porque cada arquivo criado usando esta classe
    terá esse serial e caso um dos 2 não sejam compativeis, o java vai dizer que eles não são compativeis
    portanto é boa pratica sempre colocar essa constante com uma serialVersionUID para que quando um objeto for
    serializado ele possa ser reaberto novamente. Caso eles estejam corretos e sejam iguais o java não verá
    problema na hora de abrir um arquivo que foi serializado a menos que um atributo tenha sido alterado na classe
    nesse caso é preciso atualizar o serialVersionUID também.
     */
    private String nome;
    private String cpf;
    private String profissao;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
