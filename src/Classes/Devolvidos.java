package Classes;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Devolvidos {

    private String codigo = "";
    private String titulo = "";
    private String autor = "";
    private String editora = "";
    private String CaminhoArquivo = "";

    public Devolvidos(){
        
    }
    
    public Devolvidos(String codigo, String titulo, String autor, String editora) throws IOException{
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.CaminhoArquivo = (new File("..").getCanonicalPath())+"\\BibliotecaSenai\\Banco\\Livros\\Livros.csv";        
    }
    
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

    public void gravar() throws IOException {

        FileWriter arquivo = new FileWriter(CaminhoArquivo);
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
        gravarArquivo.println(this.desmaterializar());
        gravarArquivo.close();
        System.out.println("Inclusão feita com Sucesso");

    }
    
    public ArrayList<Devolvidos> ler() throws Exception {
      try{
         ArrayList<Devolvidos> listaDeLivros = new ArrayList<Devolvidos>();
         FileReader fr = new FileReader(CaminhoArquivo);
         BufferedReader br  = new BufferedReader(fr);
         String linha = "";
         while((linha=br.readLine())!=null){
                Devolvidos objetoLivro = new Devolvidos();
                objetoLivro.materializar(linha);
                listaDeLivros.add(objetoLivro);
            }
            br.close();
            return listaDeLivros;
            
      }catch(Exception erro){
         throw erro;
      }   
    }
   
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        
        if(vetorString.length != 8) 
            throw new Exception("Faltam dados na String");
        
        codigo  = vetorString[0];
        titulo  = vetorString[1];
        autor   = vetorString[2];
        editora = vetorString[3];      

    }

    public String desmaterializar() {
        String saida = codigo + ";" + titulo + ";"+ autor +";"+ editora;        
        return saida;
    }

}

