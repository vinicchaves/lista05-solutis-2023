package questao04;

public class ProgramaTeste {
    public static void main(String[] args) {
      Administrador adm1 = new Administrador("Carlos", "Rua da Solutis", " 7199999999", 1, 3000,100, 1000 );

        System.out.println("Dados da pessoa:\nNome: " + adm1.getNome() + "\nEndereço: " + adm1.getEndereco() + "\nTelefone: " + adm1.getTelefone() + "\nSetor: " + adm1.getCodigoSetor() + "\nValor Salário Base: R$" + adm1.getSalarioBase() + "\nValor dos impostos: R$" + adm1.getImposto() + "\nAjuda de Custos: R$" + adm1.getAjudaDeCusto());
        System.out.println("Salário final: R$" + adm1.calcularSalario());
        adm1.setAjudaDeCusto(2500);
        System.out.println("Salário final: R$" + adm1.calcularSalario());
    }
}
