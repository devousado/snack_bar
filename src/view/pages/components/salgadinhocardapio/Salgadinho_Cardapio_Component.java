package view.pages.components.salgadinhocardapio;

import java.util.Scanner;

public class Salgadinho_Cardapio_Component {
     Scanner scanner=new Scanner(System.in);
     Salgadino_Menu salgadino_Menu=new Salgadino_Menu();
     
          public void  salgadinhocardapio(){


        System.out.println("================Salgadinho Cardapio==============");
        System.out.println(" preço: 2500");
        System.out.println(" deseja personalizar o seu  lanche?");
        System.out.println("1-sim");
        System.out.println("2-voltar");
        int  choose= scanner.nextInt();
          switch (choose) {

            case 1:
            
        salgadino_Menu.ingredient();
             
              break;
              case 2:
              

              break;
          
            default:
              break;
          }
     

                             
      


                              }
    
}
