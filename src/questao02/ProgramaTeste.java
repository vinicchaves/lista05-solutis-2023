package questao02;

public class ProgramaTeste {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Marcos", "Rua Solutis", "71994444444", 5000, 4000);

        // área de testes

        System.out.println("Dados da pessoa:\nNome: " + fornecedor1.getNome() + "\nEndereço: " + fornecedor1.getEndereco() + "\nTelefone: " + fornecedor1.getTelefone() + "\nValor Crédito: R$" + fornecedor1.getValorCredito() + "\nValor Dívida: R$" + fornecedor1.getValorDivida());
        fornecedor1.setValorCredito(10000);
        fornecedor1.setValorDivida(9500);

        System.out.println("O fornecedor " + fornecedor1.getNome() + " tem um valor de crédito atualizado de: R$" + fornecedor1.getValorCredito() + " e um valor de dívida de: R$" + fornecedor1.getValorDivida());
        System.out.println("Sendo assim, ele têm um saldo de: R$" + fornecedor1.obterSaldo());
    }
}
