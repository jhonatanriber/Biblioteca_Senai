package Classes;


public abstract class Pessoa {
    
    private Integer codigo = 0;
    private String nome = "";
    private String sexo = "";
    private String cpf = "";
    private String telefone = "";
    private String dtNascimento = "";

    public String getNome() {
        return nome;    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDtaNascimento() {
        return dtNascimento;
    }

    public void setDtaNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }
   
    
}
