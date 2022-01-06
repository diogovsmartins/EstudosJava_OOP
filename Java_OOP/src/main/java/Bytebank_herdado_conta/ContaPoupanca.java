package Bytebank_herdado_conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public double depositar(double valor) {
        if(valor>0){
            this.saldo+=valor;
            return this.saldo;
        }
        return this.saldo;
    }

}
