package Bytebank_herdado_conta;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getImposto(){
        return (365*3.00)*0.1;
    };
    //valor total do seguro de vida é 3 reais por dia e o imposto é 10% do total.
}
