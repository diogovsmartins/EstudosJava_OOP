package Bytebank_encapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        if(agencia<=0 || numero<=0){
            System.out.println("Valores negativos não são aceitos pelo sistema, digite um  valor valido.");
        }else{
            System.out.println("Conta criada com sucesso.");
            System.out.println("Total de contas criadas: "+total);
        }
    }


    public double sacar(double valor){
        if (valor<=saldo){
            this.saldo -= valor;
            return this.saldo;
        }
        return this.saldo;
    }

    public double depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
            return this.saldo;
        }
        return this.saldo;
    }

    public double transferir(double valor, Conta destino){
      if(saldo>0){
          this.sacar(valor);
          destino.depositar(valor);
          return this.saldo;
      }
      return this.saldo;
    };

    public double getSaldo(){
        return this.saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
