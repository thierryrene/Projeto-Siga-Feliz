
package siga.feliz;
import java.util.Scanner;
/**
 * Eliseu Netto
 * Luis Felipe Assumpção Fleury - RA 20748214 
 * Thierry
 * William 
 */
public class SigaFeliz {

    static Scanner entrada = new Scanner(System.in);
    static byte[] J = new byte[24];
    static byte[] C = new byte[24];
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu  = "";
        System.out.println("Sistema Siga Feliz");
        do {
            System.out.println("\n*******************************");
            System.out.println("*  MENU - Venda de Passagens  *");
            System.out.println("*   1 - Vender a Passagem     *");
            System.out.println("*   2 - Mapa de Ocupações     *");
            System.out.println("*   3 - Sair                  *");
            System.out.println("*******************************");
            menu = entrada.next();
            entrada.nextLine();
            if (menu.equals("1")) {
                Venda();
            } else if (menu.equals("2")){
                MapaAssentos();
            } else if (!menu.equals("3")){
                System.out.println("\n >>> E R R O <<< \nEntre com a Opção ( 1, 2, 3 ) correspondente\n");
            }
        } 
        while (!menu.equals("3"));
        System.out.println("\nEncerrando o Programa 'Controle de Passagens'");
        System.out.println("Obrigado.");        
        System.exit(0);
    }
    
    static void Venda()
    {
        // Declara variaveis
        byte poltrona = 0;
        String tipo = "";
        
        // Pega numero do assento
        do {
            System.out.println("Qual o numero da poltrona desejado de (1 a 24)?");
            while (!entrada.hasNextByte())
            {
                System.out.println("Valor inválido! Qual o numero da poltrona desejado de (1 a 24)?");
                entrada.nextLine();
            }
            poltrona = entrada.nextByte();
            if (poltrona < 1 || poltrona > 24){
                System.out.print("Valor inválido! ");
                entrada.nextLine();
            }
        } while (poltrona < 1 || poltrona > 24);
        
        // Pega tipo de assento
        do {
            System.out.println("Você deseja Janela (J) ou Corredor (C)?");
            tipo = entrada.next();
            if (!tipo.equalsIgnoreCase("C") && !tipo.equalsIgnoreCase("J")){
                System.out.print("Valor inválido! ");
                entrada.next();
            }
        } while (!tipo.equalsIgnoreCase("C") && !tipo.equalsIgnoreCase("J"));

        // Verifica se assento esta ocupado
        if (assentoOcupado(poltrona, tipo)){
            if (OnibusCheio()){
                    System.out.println("\n>< >< >< >< >< >< >< >< >< >< ");
                    System.out.println(" Ônibus  *** L O T A D O ***");
                    System.out.println(">< >< >< >< >< >< >< >< >< >< \n");
            } else {
                    System.out.println("\n >>> ERRO <<<  Poltrona OCUPADA \nTente outro Assento ou consulte o 'Mapa de Ocupação'\n");
                            
            }
        } else {
            if(tipo.equalsIgnoreCase("C")){
                C[poltrona-1] = 1;
            } else
            {
                J[poltrona-1] = 1;
            }
            System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
            System.out.println(" Venda efetuada com sucesso:  Poltrona " + poltrona + (tipo.equalsIgnoreCase("C") ? " Corredor" : " Janela"));
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
        }
    }
    
    static Boolean assentoOcupado(Byte poltrona, String tipo){
        if(tipo.equalsIgnoreCase("C")){
            return (C[poltrona-1] == 1);
        } else {
            return (J[poltrona-1] == 1);
        }
    }
    
    
    static Boolean OnibusCheio()
    {
        Boolean ret = true;
        for (Byte poltrona = 0; poltrona < 24; poltrona++){
            if (C[poltrona] == 0 || J[poltrona] == 0){
                ret = false;
                break;
            }
        }
        return ret;
    }
    
    
    static void MapaAssentos()
    {
        System.out.println("\n================================");
        System.out.println("M A P A   D E   O C U P A Ç Ã O:");
        System.out.println("================================");
        System.out.println("JANELA\t\tCORREDOR");
        for (Byte iFileira = 1; iFileira < 25; iFileira++){
            System.out.print(iFileira + " - ");
            if(J[iFileira-1] == 1) {
                System.out.print("OCUPADA");
            } else {
                System.out.print("LIVRE");
            }
            System.out.print("\t" + iFileira + " - ");
            if(C[iFileira-1] == 1) {
                System.out.print("OCUPADA");
            } else {
                System.out.print("LIVRE");
            }
            
            System.out.println();
        }
    }
    
    
}
