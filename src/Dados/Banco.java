/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Classes.Livro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jhonatan Santos
 */
public class Banco {
    private String linha = "";
    private static Banco banco = null;

    public static Banco get(){
        if(banco == null){
            banco = new Banco();
        }
        return banco;
    }
    //Inclusão do Livro
    public void gravarLivro() throws IOException {
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros.txt");
        PrintWriter arquivoLivro = new PrintWriter(arquivo);
        arquivoLivro.println(Livro.get().getLivro());
        arquivoLivro.close();
        System.out.println("Inclusão feita com Sucesso");

    }

    //Ler Livros Cadastrados
    public ArrayList<String> lerLivro() throws Exception {
        ArrayList<String> listaLivros = new ArrayList<String>();
       
        FileReader arquivoLivro = new FileReader((new File("..").getCanonicalPath()) + "\\BibliotecaSenai\\Banco\\Livros.txt");
        BufferedReader lerLivro = new BufferedReader(arquivoLivro);

        while ((linha = lerLivro.readLine()) != null) {
            listaLivros.add(linha);
        }
        lerLivro.close();
        
        return listaLivros;
    }

}
