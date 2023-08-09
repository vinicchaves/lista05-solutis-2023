package questao05;

import questao03.*;

public class Operario extends Empregado {
   private double valorProducao;
   private double comissao;

    public Operario(){

    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase,imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao(){
        return valorProducao;
    }
    public void setValorProducao(double valorProducao){
        this.valorProducao = valorProducao;
        System.out.println("Valor de produção atualizado.");
    }
    public double getComissao(){
        return comissao;
    }
    public void setComissao(double comissao){
        this.comissao = comissao;
        System.out.println("Valor da comissão atualizado.");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao*(comissao/100));
    }
}
