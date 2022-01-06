package Bytebank_herdado;

public class TestaSistema {

    public static void main(String[] args) {
        SistemaInterno sistema= new SistemaInterno();

       Gerente gerente1= new Gerente("Roberval", "123.456.789.12", 2500);
        gerente1.setSenha(1234);//senha certa

        Admnistrador adm= new Admnistrador();
        adm.setSenha(123);//senha errada

        sistema.autentica(gerente1);
        sistema.autentica(adm);
    }
}
