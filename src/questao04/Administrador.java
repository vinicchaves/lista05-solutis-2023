package questao04;


import questao03.*;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(){

    }
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto){
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto){
        this.ajudaDeCusto=ajudaDeCusto;
        System.out.println("Valor da ajuda de custo foi atualizado.");
    }

    public double getAjudaDeCusto(){
        return ajudaDeCusto;
    }
    public double calcularSalario(){
        return super.calcularSalario() + ajudaDeCusto;
    }

}
