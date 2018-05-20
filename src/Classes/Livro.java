package Classes;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

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
    private Action action;
    BufferedImage imagem;

    public void setDados(String titulo, String codigo, String editora, String autor, String edicao, String ano,
            String paginas, String quantidade,String caminhoImagem, String status) throws IOException {
        this.titulo = titulo;
        this.codigo = codigo;
        this.editora = editora;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.paginas = paginas;
        this.quantidade = quantidade;
        this.caminhoImagem = caminhoImagem;
        this.status = status;
       

    }

    //Inclusão do Livro
    public void setLivro(Action action, String dados) throws IOException, Exception {
        boolean aux = true;
        ArrayList<String> listLivro = new ArrayList<String>();
        listLivro = getLivro();
        if (action != Action.ADCIONAR) {
            aux = false;
        }
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros\\Livros.csv", aux);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        switch (action) {
            case ADCIONAR:
                caminhoImagem = setImagemLivro(caminhoImagem,codigo);
                arquivoLivro.write(getDados() + "\r\n");
                arquivoLivro.close();
                
                break;
            case EXCLUIR:
                listLivro.remove(Integer.parseInt(dados));
                for (int i = 0; i < listLivro.size(); i++) {
                    arquivoLivro.write(listLivro.get(i) + "\r\n");
                }
                arquivoLivro.close();
                listLivro.removeAll(listLivro);
                break;

            case ALTERAR:
                listLivro.set(Integer.parseInt(dados), getDados());
                for (int i = 0; i < listLivro.size(); i++) {
                    arquivoLivro.write(listLivro.get(i) + "\r\n");
                }
                arquivoLivro.close();
                listLivro.removeAll(listLivro);
                break;
            case RESERVAR:
                break;
            case EMPRESTIMO:
                break;
            case DEVOLVER:
                break;
            case IMAGEM:
                
                break;

        }
    }

    //Ler Livros Cadastrados
    public ArrayList<String> getLivro() throws Exception {
        ArrayList<String> listLivro = new ArrayList<String>();
        String linha = "";
        FileReader arquivoLivro = new FileReader((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros\\Livros.csv");
        BufferedReader lerLivro = new BufferedReader(arquivoLivro);

        while ((linha = lerLivro.readLine()) != null) {
            listLivro.add(linha);
        }
        lerLivro.close();

        return listLivro;

    }

    public String getDados() {

        String saida = codigo + ";" + titulo + ";" + autor + ";" + editora + ";"
                + edicao + ";" + ano + ";" + paginas + ";" + quantidade + ";"+caminhoImagem +";"+ status;
        return saida;
    }

    public String setImagemLivro(String caminho,String codigo) throws IOException {
        String caminhoDestino = (new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros\\Imagens\\"+codigo+".jpg";
        imagem = ImageIO.read(new File(caminho));
        File outputfile = new File(caminhoDestino);
        ImageIO.write(imagem, "jpg", outputfile);
        return caminhoDestino;
    }

    public enum Action {
        ADCIONAR, EXCLUIR, ALTERAR, RESERVAR, EMPRESTIMO, DEVOLVER,IMAGEM
    }
}
