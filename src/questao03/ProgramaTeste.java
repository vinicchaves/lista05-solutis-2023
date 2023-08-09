package questao03;

public class ProgramaTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Rua da Solutis, 1234", "71947845487", 1, 2000, 100);

        System.out.println("Dados da pessoa:\nNome: " + empregado1.getNome() + "\nEndereço: " + empregado1.getEndereco() + "\nTelefone: " + empregado1.getTelefone() + "\nSetor: " + empregado1.getCodigoSetor() + "\nValor Salário Base: R$" + empregado1.getSalarioBase() + "\nValor dos impostos: R$" + empregado1.getImposto());
        System.out.println("Salário final: R$" + empregado1.calcularSalario());
        empregado1.setSalarioBase(10000);
        empregado1.setImposto(2500);
        System.out.println("Salário final atualizado: R$" + empregado1.calcularSalario());
    }
}
