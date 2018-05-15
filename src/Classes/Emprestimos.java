package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Emprestimos {

    private String codigoLivro = "";
    private String tituloLivro = "";
    private String autorLivro = "";
    private String editoraLivro = "";
    private String codigoUser = "";
    private String data = "";
    private String tempo = "";
    private String CaminhoArquivo = "";

    public Emprestimos() {

    }

    public Emprestimos(String codigoUser, String codigoLivro, String data, String tempo) throws IOException {
        this.codigoUser = codigoUser;
        this.codigoLivro = codigoLivro;
        this.data = data;
        this.tempo = tempo;
        this.CaminhoArquivo = (new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Emprestimos.csv";
    }

    public String getCodigoUser() {
        return codigoUser;
    }

    public void setCodigoUser(String codigoUser) {
        this.codigoUser = codigoUser;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getCaminhoArquivo() {
        return CaminhoArquivo;
    }

    public void setCaminhoArquivo(String CaminhoArquivo) {
        this.CaminhoArquivo = CaminhoArquivo;
    }

    public void gravar() throws IOException {

        FileWriter arquivo = new FileWriter(CaminhoArquivo);
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
        gravarArquivo.println(this.desmaterializar());
        gravarArquivo.close();
        System.out.println("Inclusão feita com Sucesso");

    }

    public ArrayList<Emprestimos> ler() throws Exception {
        try {
            ArrayList<Emprestimos> listaDeLivros = new ArrayList<Emprestimos>();
            FileReader fr = new FileReader(CaminhoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {

                Emprestimos objetoLivro = new Emprestimos();
                objetoLivro.materializar(linha);
                listaDeLivros.add(objetoLivro);
            }
            br.close();
            return listaDeLivros;

        } catch (Exception erro) {
            throw erro;
        }
    }

    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");

        if (vetorString.length != 8) {
            throw new Exception("Faltam dados na String");
        }

        codigoLivro = vetorString[0];
        data = vetorString[2];
        tempo = vetorString[3];

    }

    public String desmaterializar() {
        String saida = codigoLivro + ";" + codigoLivro + ";" + data + ";" + tempo;
        return saida;
    }

}
