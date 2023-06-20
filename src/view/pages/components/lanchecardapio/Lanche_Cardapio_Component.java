package view.pages.components.lanchecardapio;

import java.util.Scanner;

public class Lanche_Cardapio_Component {
     Scanner scanner=new Scanner( System.in);
     Lanches_Menu_Ingredients lanches_Menu_Ingredients=new Lanches_Menu_Ingredients();

      public void  lancheCardapio(){


        System.out.println("=================Lanche Cardapio==============");
        System.out.println(" preço: 2500");
        System.out.println(" deseja personalizar o seu  lanche?");
        System.out.println("1-sim");
        System.out.println("2-voltar");
        int  choose= scanner.nextInt();
          switch (choose) {

            case 1:
            lanches_Menu_Ingredients.ingredient();
             
              break;
              case 2:
              

              break;
          
            default:
              break;
          }
     

                             
      


                              }
    
    
    
}
