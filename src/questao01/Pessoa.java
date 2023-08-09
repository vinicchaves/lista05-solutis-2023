package questao01;

public class Pessoa
{
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){

    }
    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    // área de teste abaixo
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Rubem Chaves", "Rua ... Salvador BA", "71999999999");
        System.out.println("Dados da pessoa:\nNome: " + pessoa1.getNome() + "\nEndereço: " + pessoa1.getEndereco() + "\nTelefone: " + pessoa1.getTelefone());
    pessoa1.setEndereco("Rua Tal tal tal Salvador/BA");
        System.out.println("Endereço atualizado: " + pessoa1.getEndereco() );
    }
}
