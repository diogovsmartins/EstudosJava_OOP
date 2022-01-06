package Bytebank_herdado;
        //contrato autenticavel
            //quem assinar esse crontrato precisa implementar os metodos
                //metodo setSenha e autentica

public abstract interface Autenticavel{
    //classes abstratas que herdam de outra classe abstrata não são obrigadas a ter os metodos abstrados da super class

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);


}
