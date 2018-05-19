package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
   
 
    public void setDados(String titulo, String codigo, String editora, String autor, String edicao, String ano,
                         String paginas, String quantidade, String status) throws IOException {
        this.titulo = titulo;
        this.codigo = codigo;
        this.editora = editora;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.paginas = paginas;
        this.quantidade = quantidade;
        this.status = status;
        
    }

    //Inclusão do Livro
    public void setLivro() throws IOException{
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros\\Livros.csv",true);
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        arquivoLivro.write(getDados()+"\r\n");
        arquivoLivro.close();
        System.out.println("Inclusão feita com Sucesso");
    }

    //Ler Livros Cadastrados
    public ArrayList<String> getLivro() throws Exception {
        ArrayList<String> listaLivros = new ArrayList<String>();
        String linha = "";
        FileReader arquivoLivro = new FileReader((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros\\Livros.csv");
        BufferedReader lerLivro = new BufferedReader(arquivoLivro);

        while ((linha = lerLivro.readLine()) != null) {
         listaLivros.add(linha);
         }
        lerLivro.close();

        return listaLivros;
    }

    public String getDados() {

        String saida = codigo + ";" + titulo + ";" + autor + ";" + editora + ";"
                + edicao + ";" + ano + ";" + paginas + ";" + quantidade + ";" + status;
        return saida;
    }
    
}
