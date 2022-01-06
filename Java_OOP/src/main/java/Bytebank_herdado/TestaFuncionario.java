package Bytebank_herdado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario diogo= new Gerente("Diogo Martins", "123.456.789.10", 2000);
        System.out.println(diogo.getCpf());
        System.out.println(diogo.getBonificacao());

        Funcionario designer= new Designer();
        System.out.println(designer.getBonificacao());

    }
}
