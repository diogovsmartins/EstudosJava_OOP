package Bytebank_encapsulado;

public class TestarGettersESetters {

    public static void main(String[] args) {
        Conta conta = new Conta(7221, 2215);
        conta.setTitular(new Cliente());
        conta.getTitular().setNome("Diogo Vinicius");
        conta.getTitular().setCpf("123.456.789.12");
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getNome()+"\n"+
                conta.getTitular().getCpf()+"\n"+conta.getTitular().getProfissao());
    }
}
