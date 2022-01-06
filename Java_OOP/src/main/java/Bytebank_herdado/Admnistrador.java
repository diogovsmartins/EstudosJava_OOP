package Bytebank_herdado;

public class Admnistrador extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Admnistrador(){
        this.autenticador=new Autenticador();
    }
    @Override
    public boolean autentica(int senha) {
      return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

}
