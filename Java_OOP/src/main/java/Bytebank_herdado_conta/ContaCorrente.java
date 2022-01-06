package Bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public double sacar(double valor) {
        double valorSaque=valor-0.20;
        return super.sacar(valorSaque);
    }

    @Override
    public double depositar(double valor){
        if(valor>0){
        super.saldo+=valor;
        return super.saldo;
        }
        return super.saldo;
    }

    @Override
    public double getImposto() {
        return super.saldo*0.01;
    }
}
