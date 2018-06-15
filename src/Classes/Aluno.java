package Classes;

import ClassesDAO.AlunoDAO;
import java.io.IOException;

public class Aluno extends Pessoa {
    AlunoDAO alunoDAO = new AlunoDAO();

    private String curso, numMatricula;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getDados() {
        return getCodigo() + ";" + getNome() + ";" + getCpf() + ";" + getDtaNascimento() + ";" + getTelefone();
    }

    public void execAcao(Action acao,int select) throws IOException {
        switch (acao) {
            case ADCIONAR:
                alunoDAO.adicionar(getDados());
                
                break;
            case EXCLUIR:
                alunoDAO.editar(select,getDados());
                
                break;
                
            case EDITAR:
                alunoDAO.excluir(select);
                break;
        }
    }

    public enum Action {
        ADCIONAR, EXCLUIR, EDITAR
    }

}
