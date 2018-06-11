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
    private String DataCadastro;
    private ExemplarDAO exemplarDAO = new ExemplarDAO();

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

    public void setDataCadastro(String DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public String getDadosExemplar() {
        return codigoLivro + ";" + codigoExemplar + ";" + DataCadastro + ";" + DataInicial + ";" + DataFinal;
    }

    public void executarAcao(Action acao, int linha) throws IOException {
        switch (acao) {

            case ADCIONAR:
                exemplarDAO.addExemplar(getDadosExemplar());
                break;

            case EXCLUIR:
                //livroDAO.deleteLivro(linha);
                break;

            case EDITAR:
                //livroDAO.editLivro(linha, getDadosLivro() + livroDAO.setImagemLivro(codigo, caminhoImagem));
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
