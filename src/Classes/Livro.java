package Classes;

import ClassesDAO.LivroDAO;
import java.io.IOException;
import java.util.ArrayList;

public class Livro {

    private String codigo = "";
    private String titulo = "";
    private String autor = "";
    private String editora = "";
    private String edicao = "";
    private String ano = "";
    private String paginas = "";
    private String quantidade = "";
    private String status = "";
    private String caminhoImagem = "";
    LivroDAO livroDAO = new LivroDAO();
    Exemplar exemplar = new Exemplar();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getDadosLivro() {
        return codigo + ";" + titulo + ";" + autor + ";" + editora + ";" + edicao + ";" + ano + ";" + paginas + ";" + quantidade + ";" + status;
    }

    
    public ArrayList<String> getListLivros() throws IOException {
        return livroDAO.getLivro();
    }

    public void executarAcao(Action acao, int linha) throws IOException {
        switch (acao) {

            case ADCIONAR:
                livroDAO.addLivro(getDadosLivro() + livroDAO.setImagemLivro(codigo, caminhoImagem));
                break;

            case EXCLUIR:
                livroDAO.deleteLivro(linha);
                break;

            case EDITAR:
                livroDAO.editLivro(linha, getDadosLivro() + livroDAO.setImagemLivro(codigo, caminhoImagem));
                break;

        }
    }

    public enum Action {
        ADCIONAR, EXCLUIR, EDITAR
    }

}
