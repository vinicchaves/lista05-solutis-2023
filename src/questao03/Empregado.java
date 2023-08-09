package questao03;

import questao01.Pessoa;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(){

    }
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto){
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;

    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
        System.out.println("O salário base foi atualizado.");

    }

    public void setImposto(double imposto){
        this.imposto = imposto;
        System.out.println("O valor de imposto foi atualizado.");
    }

    public int getCodigoSetor(){
        return codigoSetor;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public double calcularSalario(){
        return salarioBase - imposto;
    }
}
