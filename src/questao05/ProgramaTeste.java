package questao05;

public class ProgramaTeste {
    public static void main(String[] args) {
        Operario op1 = new Operario("Jocival", "Rua da Solutis", "71464464465", 2, 2000,100, 1000, 10);

        System.out.println("Dados da pessoa:\nNome: " + op1.getNome() + "\nEndereço: " + op1.getEndereco() + "\nTelefone: " + op1.getTelefone() + "\nSetor: " + op1.getCodigoSetor() + "\nValor Salário Base: R$" + op1.getSalarioBase() + "\nValor dos impostos: R$" + op1.getImposto() + "\nValor de Produção: R$" + op1.getValorProducao() + "\nComissao (%):" + op1.getComissao());
        System.out.println("Salário final: R$" + op1.calcularSalario());
        op1.setComissao(50);
        System.out.println("Salário final: R$" + op1.calcularSalario());

    }

}
