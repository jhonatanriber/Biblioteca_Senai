/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author Jhonatan Santos
 */
public class LivroDAO {

    private String localizacaoLivro = "/BibliotecaSenai/Banco/Livros/Livros.csv";
    private String localizacaoImagens = "/BibliotecaSenai/Banco/Livros/Imagens/";

    public void addLivro(String dados) throws IOException {

        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoLivro, true);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        arquivoLivro.write(dados + "\r\n");
        arquivoLivro.close();
    }

    public void editLivro(int linha, String dados) throws IOException {
        ArrayList<String> livros = getLivro();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoLivro, false);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        livros.set(linha, dados);
        for (int i = 0; i < livros.size(); i++) {
            arquivoLivro.write(livros.get(i) + "\r\n");
        }
        arquivoLivro.close();

    }

    public void deleteLivro(int linha) throws IOException {
        ArrayList<String> livros = getLivro();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoLivro, false);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);

        livros.remove(linha);
        for (int i = 0; i < livros.size(); i++) {
            arquivoLivro.write(livros.get(i) + "\r\n");
        }
        arquivoLivro.close();
    }

    public void autualizarQtd(String codigo, int quantidade) throws IOException {
        ArrayList<String> livros = getLivro();
        String dados = "";
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoLivro, false);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).contains(codigo)) {
                String[] list_temp = livros.get(i).split(";");
                livros.set(i, list_temp[0] + ";" + list_temp[1] + ";" + list_temp[2] + ";" + list_temp[3]
                        + ";" + list_temp[4] + ";" + list_temp[5] + ";" + list_temp[6] + ";" + quantidade
                        + ";" + list_temp[8]);
            }

        }
        for (int i = 0; i < livros.size(); i++) {
            arquivoLivro.write(livros.get(i) + "\r\n");

        }
        arquivoLivro.close();
    }

    public void reservarLivro() {

    }

    public void emprestimoLivro() {

    }

    public void devolverLivro() {

    }

    public ArrayList<String> getLivro() throws IOException {
        ArrayList<String> listLivro = new ArrayList<String>();
        String linha = "";
        FileReader arquivoLivro = new FileReader((new File("..").getCanonicalPath()) + localizacaoLivro);
        BufferedReader lerLivro = new BufferedReader(arquivoLivro);

        while ((linha = lerLivro.readLine()) != null) {
            listLivro.add(linha);
        }
        lerLivro.close();

        return listLivro;
    }

    public String setImagemLivro(String codigo, String caminhoImagem) throws IOException {
        String caminhoDestino = (new File("..").getCanonicalPath()) + localizacaoImagens + codigo + ".jpg";
        BufferedImage imagem = ImageIO.read(new File(caminhoImagem));
        File outputfile = new File(caminhoDestino);
        ImageIO.write(imagem, "jpg", outputfile);
        return caminhoDestino;
    }
    /*
    public ArrayList<String> getReservasLivro(){
      

    }

    public ArrayList<String> getEmprestimosLivro() {

    }

    public ArrayList<String> getDevolvidosLivro() {

    }

    public ArrayList<String> getMultasLivro() {

    }
     */
}
