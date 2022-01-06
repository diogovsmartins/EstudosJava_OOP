package Bytebank_herdado;

public class Autenticador {
    //classe que será usada para composição em outros objetos para reutilizar código
    private int senha;

    public boolean autentica(int senha) {
        if(this.senha==senha) {
            return true;
        }else{
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha=senha;
    }

}
