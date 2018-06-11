/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

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
 * @author jhonatan
 */
public class ExemplarDAO {

    private String localizacaoExemplar = "/BibliotecaSenai/Banco/Livros/Exemplares.csv";

    public void addExemplar(String dados) throws IOException {

        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoExemplar, true);
        PrintWriter arquivoExemplar = new PrintWriter(arquivo);
        arquivoExemplar.write(dados + "\r\n");
        arquivoExemplar.close();
    }

    public void editarExemplar(int linha, String dados) throws IOException {

    }

    public void deleteExemplar(int linha) throws IOException {

    }

    public void reservarExemplar() {

    }

    public void emprestimoExemplar() {

    }

    public void devolverExemplar() {

    }

    public ArrayList<String> getExemplar(String codigo) throws IOException {
        ArrayList<String> listExemplar = new ArrayList<String>();
        String linha = "";
        FileReader arquivoExemplar = new FileReader((new File("..").getCanonicalPath()) + localizacaoExemplar);
        BufferedReader lerExemplar = new BufferedReader(arquivoExemplar);

        while ((linha = lerExemplar.readLine()) != null) {
            if (linha.contains(codigo)) {
                listExemplar.add(linha);
            }

        }
        lerExemplar.close();

        return listExemplar;

    }
    /*
    public ArrayList<String> getReservasLivro() {

    }

    public ArrayList<String> getEmprestimosLivro() {

    }

    public ArrayList<String> getDevolvidosLivro() {

    }

    public ArrayList<String> getMultasLivro() {

    }


     */
}
