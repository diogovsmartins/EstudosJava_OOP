package Bytebank_encapsulado;

public class CriarContaComCliente {

    public static void main(String[] args) {
        Conta contaDoDiogo= new Conta(1921, 5112);
        contaDoDiogo.setTitular(new Cliente());
        contaDoDiogo.getTitular().setNome("diogo martins");
        System.out.println(contaDoDiogo.getTitular().getNome());
        contaDoDiogo.depositar(200);
        System.out.println(contaDoDiogo.getSaldo());

    }
}
