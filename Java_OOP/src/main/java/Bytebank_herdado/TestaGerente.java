package Bytebank_herdado;

public class TestaGerente {

    public static void main(String[] args) {
        Gerente gerente= new Gerente("Diogo", "123.345.312.22", 3000);
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());
        System.out.println(gerente.autentica(1234));


        Autenticavel teste= new Admnistrador();
        teste.setSenha(1234);
        System.out.println(teste.autentica(1234));
    }
}
