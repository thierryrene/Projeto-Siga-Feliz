
package siga.feliz;

import java.util.Scanner;

/**
 *
 * @author eliseunetto
 * @version 2.0
 */
public class ControlePassagens {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] janela = new int[24];
        int[] corredor = new int[24];
        int opcao, poltrona;
        char jc = 'J';
        
        do{
        System.out.println("\n*******************************");
        System.out.println("*  MENU - Venda de Passagens  *");
        System.out.println("*   1 - Vender a Passagem     *");
        System.out.println("*   2 - Mapa de Ocupações     *");
        System.out.println("*   3 - Sair                  *");
        System.out.println("*******************************");
        opcao = scan.nextInt();
        
        if (opcao == 1 || opcao ==2 || opcao ==3){
            switch (opcao){
                case 1:
                     // Verifica se todos os lugares estão ocupados
                    int k, l, cont = 0;
                    for(k = 0; k < janela.length; k++){
                        for(l = 0; l < corredor.length;l++){
                            if(janela[k] == 1 && corredor[k] == 1){
                               cont++;
                            }
                        }
                    }
                    if (cont == 4){
                         System.out.println("\n>< >< >< >< >< >< >< >< >< >< ");
                         System.out.println(" Ônibus  *** L O T A D O ***");
                         System.out.println(">< >< >< >< >< >< >< >< >< >< \n");
                         break;
                    }
                    
                    // Solicita o N˚ da Poltrona e valida o N˚ da Poltrona
                    do{
                        System.out.print("Digite o número da Poltrona (1 a 24): ");
                        poltrona = scan.nextInt();
                            if (poltrona < 1 || poltrona > 24){
                                System.out.print("\n >>> ERRO <<<\n");
                            }
                        } while (poltrona < 1 || poltrona > 24);
                    
                        
                    // Solicita se Janela ou Corredor e valida o assento
                    int lado = 5;
                    do {
                        System.out.print("Digite (J) Janela ou (C) Corredor: ");
                        jc = scan.next().charAt(0);
                            if(jc == 'J' || jc == 'j'){
                                lado = 0;
                            }else if (jc == 'C' || jc == 'c'){
                                lado = 1;
                            } else {
                                System.out.println("\n>> TIPO ERRADO << \n");
                            }
                        }while (lado != 0 && lado != 1);
                    
                    // Testa se a Poltrona está disponível, faz atribuição e muda o status da Poltrona (lugar)
                    if(jc == 'J' || jc == 'j'){
                        if (janela[poltrona -1] == 0){
                            janela[poltrona - 1] = 1;
                        } else {
                            System.out.println("\n >>> ERRO <<<  Poltrona OCUPADA \nTente outro Assento ou consulte o 'Mapa de Ocupação'\n");
                            break;
                        }
                    } else {
                        if(corredor[poltrona -1] == 0){
                        corredor[poltrona - 1] = 1;
                        } else {
                            System.out.println("\n >>> ERRO <<<  Poltrona OCUPADA \nTente outro Assento ou consulte o 'Mapa de Ocupação'\n");
                            break;
                        }
                    }
                    // Exibe qual o LUGAR foi vendido
                    System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
                    System.out.println(" Venda efetuada com sucesso: " + ((lado == 0)? "Janela, " : "Corredor, ") + "Poltrona: " + poltrona);
                    System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n");
                    break;
                case 2:
                    System.out.println("\n================================");
                    System.out.println("M A P A   D E   O C U P A Ç Ã O:");
                    System.out.println("================================");
                    
                    System.out.println(" JANELA           CORREDOR");
                    int i = 0;
                    for (i = 0; i < janela.length; i++){ // corre o vetor
                        System.out.print((i+1) + " - ");
                        if (janela[i] != 0){
                            System.out.print("Ocupado      " + (i+1) + " - ");
                        } else {
                            System.out.print("Livre        " + (i+1) + " - ");
                        } 
                        if (corredor[i] != 0){ // corre o vetor
                            System.out.println("Ocupado");
                        } else {
                            System.out.println("Livre");
                        }
                    }      
                    break;
                default:
                    System.out.println("\nEncerrando o Programa 'Controle de Passagens'");
                    System.exit(0);
            }
        }else{
            System.out.println("\n >>> E R R O <<< \nEntre com a Opção ( 1, 2, 3 ) correspondente\n");
        }
        } while (opcao != 1 || opcao != 2);
    }
}
