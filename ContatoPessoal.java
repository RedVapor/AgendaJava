public class ContatoPessoal extends Contato {
    private String dataAniversario;

    ///
    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public ContatoPessoal(String nome, String telefone, Endereco endereco, String email, String dataAniversario) {
        super(nome, telefone, endereco, email);
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nData de aniversário: "
                + this.getDataAniversario();
    }
}