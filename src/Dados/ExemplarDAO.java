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
    LivroDAO livroDAO = new LivroDAO();
    private String localizacaoExemplar = "/BibliotecaSenai/Banco/Livros/Exemplares.csv";

    public void addExemplar(String dados) throws IOException {

        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoExemplar, true);
        PrintWriter arquivoExemplar = new PrintWriter(arquivo);
        arquivoExemplar.write(dados + "\r\n");
        arquivoExemplar.close();
    }

    public void editarExemplar(String dados) throws IOException {
        ArrayList<String> exemplar = getExemplar();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoExemplar, false);
        PrintWriter arquivoExemplar = new PrintWriter(arquivo);
        String[] temp = dados.split(";");

        for (int i = 0; i < exemplar.size(); i++) {
            if (exemplar.get(i).contains(temp[0])) {
                if (exemplar.get(i).contains(temp[1])) {
                    exemplar.set(i, temp[0] + ";" + temp[2] + ";Disponivel");
                }
            }

        }

        for (int i = 0; i < exemplar.size(); i++) {
            arquivoExemplar.write(exemplar.get(i) + "\r\n");
        }

        arquivoExemplar.close();
    }

    public void deleteExemplar(String dados) throws IOException {
        ArrayList<String> exemplar = getExemplar();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoExemplar, false);
        PrintWriter arquivoExemplar = new PrintWriter(arquivo);
        String[] temp = dados.split(";");

        for (int i = 0; i < exemplar.size(); i++) {
            if (exemplar.get(i).contains(temp[0])) {
                if (exemplar.get(i).contains(temp[1])) {
                    exemplar.remove(i);
                }
            }

        }

        for (int i = 0; i < exemplar.size(); i++) {
            arquivoExemplar.write(exemplar.get(i) + "\r\n");
        }

        arquivoExemplar.close();
    }

    public void getQuantidade(String codigo) throws IOException {
        ArrayList<String> list_temp = getExemplar();
        int quantidade = 0;
        for (int i = 0; i < list_temp.size(); i++) {
            if (list_temp.get(i).contains(codigo)) {
                quantidade++;
            }
        }
       livroDAO.autualizarQtd(codigo, quantidade);
    }

    public void reservarExemplar() {

    }

    public void emprestimoExemplar() {

    }

    public void devolverExemplar() {

    }

    public ArrayList<String> getExemplar() throws IOException {
        ArrayList<String> listExemplar = new ArrayList<String>();
        String linha = "";
        FileReader arquivoExemplar = new FileReader((new File("..").getCanonicalPath()) + localizacaoExemplar);
        BufferedReader lerExemplar = new BufferedReader(arquivoExemplar);

        while ((linha = lerExemplar.readLine()) != null) {

            listExemplar.add(linha);

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
