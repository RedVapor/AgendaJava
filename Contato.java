
public class Contato {

    private String nome;
    private String telefone;
    private Endereco endereco;
    private String email;

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos
    public void adicionarTelefone(String newTelefone) {
        this.telefone = newTelefone;
    }

    public void adicionarEmail(String newEmail) {
        this.email = newEmail;
    }

    public Contato(String nome, String telefone, Endereco endereco, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "\nTelefone: " + this.getTelefone() +
                "\nEndereço: " + this.getEndereco() +
                "\nEmail: " + this.getEmail();
    }
}