package questao06;

public class ProgramaTeste {
    public static void main(String[] args) {
        Vendedor vd1 = new Vendedor("Julia", "Rua da Solutis", "71879879798", 3, 3000, 200, 1000, 10);
        System.out.println("Dados da pessoa:\nNome: " + vd1.getNome() + "\nEndereço: " + vd1.getEndereco() + "\nTelefone: " + vd1.getTelefone() + "\nSetor: " + vd1.getCodigoSetor() + "\nValor Salário Base: R$" + vd1.getSalarioBase() + "\nValor dos impostos: R$" + vd1.getImposto() + "\nValor de Vendas: R$" + vd1.getValorVendas() + "\nComissao (%):" + vd1.getComissao());
        System.out.println("Salário final: R$" + vd1.calcularSalario());
        vd1.setComissao(50);
        System.out.println("Salário final: R$" + vd1.calcularSalario());
        vd1.setValorVendas(10000);
        System.out.println("Salário final: R$" + vd1.calcularSalario());
    }
}
