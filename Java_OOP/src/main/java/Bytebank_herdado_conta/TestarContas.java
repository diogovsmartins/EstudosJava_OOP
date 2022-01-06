package Bytebank_herdado_conta;

public class TestarContas {

    public static void main(String[] args) {

        ContaCorrente cc= new ContaCorrente(8765,4321);
        cc.depositar(100);

        ContaPoupanca cp=new ContaPoupanca(1234,5678);
        cp.depositar(200);

        cp.transferir(50, cc);
        System.out.println("Saldo da conta corrente:"+cc.getSaldo());
        System.out.println("Saldo da conta Poupança:"+cp.getSaldo());

        System.out.println(cc.sacar(50));
        System.out.println(cc.getImposto());
    }
}
