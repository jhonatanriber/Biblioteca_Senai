package Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static sun.security.jgss.GSSUtil.login;


public class Dados_Users {
    
    String caminhoArquivo = ""; 

    public boolean readLogin(String login, String senha) throws FileNotFoundException, IOException {
        caminhoArquivo = (new File("..").getCanonicalPath())+"\\BibliotecaSenai\\Banco\\Users\\";
        boolean result = false;
            FileReader arquivo = new FileReader(caminhoArquivo+login+".user");
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

                FileWriter arquivo = new FileWriter(caminho);
                PrintWriter gravarArquivo = new PrintWriter(arquivo);
                gravarArquivo.println(texto);
                gravarArquivo.close();
                System.out.println("Inclusão feita com Sucesso");
                
        }

    

}
