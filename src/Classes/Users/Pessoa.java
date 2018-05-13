
package Classes.Users;

/**
 *
 * @author Jhonatan Santos
 */

public abstract class Pessoa {
    
    private String nome,sexo,edereco;
    private float cpf,telefone;
    private int dtaNascimento,id;

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

    public String getEdereco() {
        return edereco;
    }

    public void setEdereco(String edereco) {
        this.edereco = edereco;
    }

    public float getCpf() {
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public float getTelefone() {
        return telefone;
    }

    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }

    public int getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaNascimento(int dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
