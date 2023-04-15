import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class login {
    

    public void log() throws FileNotFoundException, IOException {


        Scanner ler = new Scanner(System.in);
        String caminho = ("c:\\users\\Marcelo Torres\\desktop\\txt\\arquivo.txt");
        FileReader arq = new FileReader(caminho);
        BufferedReader lerArq = new BufferedReader(arq);

        String linha = lerArq.readLine();
        String linha2 = lerArq.readLine();

        System.out.println("------ Login ------");
        System.out.println("Nome de usuário: ");
        String id = ler.nextLine();
        System.out.println("Sua senha: ");
        String senha = ler.nextLine();


        if(id.equals(linha) || senha.equals(linha2)) {
            System.out.println("Logado com sucesso.");
        }else{
            System.out.println("Não foi possível completar o login. Revise seus dados e tente novamente.");
        }

    }
}
