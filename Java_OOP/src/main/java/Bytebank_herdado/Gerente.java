package Bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {
    private Autenticador autenticador;

    public Gerente(String nome, String cpf, double salario){
        this.autenticador=new Autenticador();
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
        System.out.println("Gerente "+nome+", cadastrado com sucesso.");
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    public double getBonificacao(){
        return super.getSalario();
    }
}
