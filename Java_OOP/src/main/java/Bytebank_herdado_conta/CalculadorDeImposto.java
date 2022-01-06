package Bytebank_herdado_conta;

public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel tributavel){
        double valor=tributavel.getImposto();
        this.totalImposto+=valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
