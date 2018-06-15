/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author jhonatan
 */
public class AlunoDAO {

    private String localizacaoUsuarios = "/BibliotecaSenai/Banco/Livros/Users.csv";

    public void adicionar(String dados) throws IOException {
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoUsuarios, true);
        PrintWriter arquivoUser = new PrintWriter(arquivo);
        arquivoUser.write(dados + "\r\n");
        arquivoUser.close();
    }

    public void editar(int linha, String dados) throws IOException {
        ArrayList<String> users = getUsers();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoUsuarios, false);
        PrintWriter arquivoUsers = new PrintWriter(arquivo);
        users.set(linha, dados);
        for (int i = 0; i < users.size(); i++) {
            arquivoUsers.write(users.get(i) + "\r\n");
        }
        arquivoUsers.close();

    }

    public void excluir(int linha) throws IOException {
        ArrayList<String> users = getUsers();
        FileWriter arquivo = new FileWriter((new File("..").getCanonicalPath()) + localizacaoUsuarios, false);
        PrintWriter arquivoUsers = new PrintWriter(arquivo);

        users.remove(linha);
        for (int i = 0; i < users.size(); i++) {
            arquivoUsers.write(users.get(i) + "\r\n");
        }
        arquivoUsers.close();

    }

    public ArrayList<String> getUsers() throws IOException {
        ArrayList<String> listLivro = new ArrayList<String>();
        String linha = "";
        FileReader arquivoUser = new FileReader((new File("..").getCanonicalPath()) + localizacaoUsuarios);
        BufferedReader lerUsers = new BufferedReader(arquivoUser);

        while ((linha = lerUsers.readLine()) != null) {
            listLivro.add(linha);
        }
        lerUsers.close();

        return listLivro;
    }

}
