import java.util.Scanner;;

public class Autenticar {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int opc;

        login log = new login();
        
        Registrar re1 = new Registrar();

        System.out.println("------Teste------");
        System.out.println("   1- Login\n  2- Registrar      ");
            opc = ler.nextInt();

        switch (opc)    {
            case 1:
                log.log();
            break;

            case 2:
                re1.reg();
            break;

            default:
                System.out.println("Opção inválida");
            break;
            
        }

        


        
        


    }
}
