package Classes;

import Dados.ExemplarDAO;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jhonatan
 */
public class Exemplar {

    private String codigoLivro;
    private String codigoExemplar;
    private String DataInicial;
    private String DataFinal;
    private String Situação;
    private ExemplarDAO exemplarDAO = new ExemplarDAO();

    public void setSituação(String Situação) {
        this.Situação = Situação;
    }
    

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public void setCodigoExemplar(String codigoExemplar) {
        this.codigoExemplar = codigoExemplar;
    }

    public void setDataInicial(String DataInicial) {
        this.DataInicial = DataInicial;
    }

    public void setDataFinal(String DataFinal) {
        this.DataFinal = DataFinal;
    }

   

    public String getDadosExemplar() {
        return codigoLivro + ";" + codigoExemplar + ";" + Situação + ";" + DataInicial + ";" + DataFinal;
    }

    public void executarAcao(Action acao, String dados) throws IOException {
        switch (acao) {

            case ADCIONAR:
                exemplarDAO.addExemplar(getDadosExemplar());
                break;

            case EXCLUIR:
                exemplarDAO.deleteExemplar(dados);
                break;

            case EDITAR:
               exemplarDAO.editarExemplar(dados);
                break;

            case RESERVAR:
                break;

            case EMPRESTIMO:
                break;

            case DEVOLVER:
                break;
        }
    }

    public ArrayList<String> getListExemplar() throws IOException {
        return exemplarDAO.getExemplar();
    }

    public enum Action {
        ADCIONAR, EXCLUIR, EDITAR, RESERVAR, EMPRESTIMO, DEVOLVER

    }
}
