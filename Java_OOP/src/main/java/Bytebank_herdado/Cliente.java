package Bytebank_herdado;

public class Cliente implements Autenticavel   {
    private Autenticador autenticador;

    public Cliente(){
        this.autenticador=new Autenticador();
    }
    @Override
    public boolean autentica(int senha) {
      return autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }
}
