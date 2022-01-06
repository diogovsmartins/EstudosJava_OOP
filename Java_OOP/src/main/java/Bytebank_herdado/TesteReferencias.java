package Bytebank_herdado;

public class TesteReferencias {

    public static void main(String[] args) {
        ControleBonificacao controle = new ControleBonificacao();

        Gerente gerente= new Gerente("Diogo Martins", "123.456.789.10", 5000);

        Funcionario funcionario = new Gerente ("Diogenes", "123,456,789,99", 2000);

        EditorDeVideo editor= new EditorDeVideo();
        editor.setSalario(2500);

        controle.registra(gerente);
        controle.registra(funcionario);
        controle.registra(editor);

        System.out.println(controle.getSoma());
    }

}
