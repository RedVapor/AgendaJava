public class ContatoProfissional extends Contato {
    private String empresa;
    private String cargo;

    ///
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ContatoProfissional(String nome, String telefone, Endereco endereco, String email, String empresa,
            String cargo) {
        super(nome, telefone, endereco, email);
        this.empresa = empresa;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nEmpresa: "
                + this.getEmpresa()
                + "\nCargo: "
                + this.getCargo();
    }
}
