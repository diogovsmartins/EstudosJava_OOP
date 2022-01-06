package Bytebank_encapsulado;



public class CriaConta {
    public static void main(String[] args) {
      Conta primeiraConta = new Conta(1334, 2997);

      Conta segundaConta=new Conta(2315, 1842);
        //System.out.println(segundaConta.agencia=123453);
        //é possivel mudar os valores de um objeto instanciado mas não do esquema original
      Conta terceiraConta= new Conta(1052, 8821);
        terceiraConta.depositar(200);
        //valores sempre são zerados quando um objeto é instanceado

        //terceiraConta.sacar(150);
        terceiraConta.transferir(64.33, segundaConta);
        System.out.println(segundaConta.getSaldo());
        System.out.println(terceiraConta.getSaldo());
    }
}
