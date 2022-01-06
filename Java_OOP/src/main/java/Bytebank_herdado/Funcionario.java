package Bytebank_herdado;

//classes abstratas não podem ser instanciadas sem um tipo concreto que seja filho, exemplo:
// Funcionario x = new Funcionario(), isso não vai funcionar pois o objeto não é concreto ele é um "conceito"
//Funcionario x=new Gerente(), desse jeito vai funcionar pois o ele é de um tipo concreto que é filho da super class funcionario
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;
        System.out.println("Funcionário "+this.nome+" cadastrado com sucesso.");
    }

    public Funcionario() {

    }
    //metodo sem corpo
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
