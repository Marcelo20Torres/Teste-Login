import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Registrar {

    public void reg()  throws IOException  {

        Scanner ler = new Scanner(System.in);
        FileWriter arq = new FileWriter("c:\\users\\Marcelo Torres\\desktop\\txt\\arquivo.txt");
        PrintWriter gravArq = new PrintWriter(arq);


        String id, senha ;


            System.out.println("------ Registrar ------");
            System.out.println("Informe o nome de usuário: ");
            id = ler.nextLine();
            System.out.println("Digite uma senha: ");
            senha = ler.nextLine();


            gravArq.printf("%s%n%s", id, senha);

        arq.close();

        String caminho = ("c:\\users\\Marcelo Torres\\desktop\\txt\\arquivo.txt");
        File arqui = new File(caminho);

        if (arqui.exists()){

            System.out.println("Usuário registrado com sucesso.");

        }else{
            System.out.println("Não foi possível registrar usuário.");
            
        }
        

    
    }        
}
