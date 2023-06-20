package view.pages.components.lanchecardapio;

import java.util.Scanner;



public class Lanches_Menu_Ingredients {
     Scanner scanner=new Scanner(System.in);
   Paes_Lanche paes=new Paes_Lanche();
   Molhos_Lanche molhos=new Molhos_Lanche();
    Coberturas_Lanche coberturas=new Coberturas_Lanche();
     public  void ingredient(){
   
    int chooseOfOption;
        System.out.println("==========INGREDIENTES===========");
    System.out.println("           1-paes");
    System.out.println("           2-coberturas");
    System.out.println("           3-molhos");
    System.out.println("           4-voltar");
     chooseOfOption=scanner.nextInt();
      switch (chooseOfOption) {


        case 1:
         paes.paessTypes();
    
            break;
        case 2:
    coberturas.coberturaTypes();

            break;
        case 3:
         coberturas.coberturaTypes();
   
            
            break;
        case 4:
            
            break;
      
        default:
            break;
      } 
    }}
