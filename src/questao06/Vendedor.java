package questao06;

import questao03.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;
    public Vendedor(){

    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao){
        super(nome, endereco, telefone, codigoSetor, salarioBase,imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
        System.out.println("Valor de vendas atualizado.");

    }

    public void setComissao(double comissao){
        this.comissao = comissao;
        System.out.println("Valor de comissão atualizado.");
    }

    public double getValorVendas(){
        return valorVendas;
    }

    public double getComissao(){
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas*(comissao/100));
    }
}
