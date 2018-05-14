package Classes.Users;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dados_Users {

    public boolean readLogin(String login, String senha) throws FileNotFoundException, IOException {
        boolean result = false;
            FileReader arquivo = new FileReader("Banco/Users/" + login + ".user");
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha = "";
            linha = lerArquivo.readLine();
            if (linha.trim().contains("Login")) {
                String auxLogin = linha.split(";")[1];
                String auxSenha = linha.split(";")[2];
                if (auxLogin.equals(login) && auxSenha.equals(senha)) {
                    result = true;
                } 
            }
           arquivo.close();
        return result;
    }

    public void Write(String caminho, String acao, String texto) throws IOException {

        switch (acao) {
            case "Login":
                break;
            case "Dados":
                break;
            case "Emprestimos":
                break;
            case "Reservas":
                break;
            case "Devolvidos":
                break;
            case "Novo":
                FileWriter arquivo = new FileWriter(caminho);
                PrintWriter gravarArquivo = new PrintWriter(arquivo);
                gravarArquivo.println(texto);
                gravarArquivo.close();
                System.out.println("Inclusão feita com Sucesso");
                break;
        }

    }

}
