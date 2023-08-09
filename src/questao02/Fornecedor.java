package questao02;

import questao01.Pessoa;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida){
super(nome, endereco, telefone);
this.valorCredito = valorCredito;
this.valorDivida = valorDivida;
}

    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
        System.out.println("Valor de crédito atualizado.");
    }
    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
        System.out.println("Valor de dívida atualizado.");
    }

    double getValorCredito(){
        return valorCredito;
    }
    double getValorDivida(){
        return valorDivida;
    }

    public double obterSaldo(){
        return valorCredito - valorDivida;
    }
}
