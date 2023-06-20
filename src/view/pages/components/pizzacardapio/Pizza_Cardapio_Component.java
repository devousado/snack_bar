package view.pages.components.pizzacardapio;

import java.util.Scanner;

public class Pizza_Cardapio_Component {
      Scanner  scanner= new Scanner( System.in);
       Pizza_menu_ingredient pizza_menu_ingredient=new Pizza_menu_ingredient();
    public void  pizzaCardapio(){


        System.out.println("=================Pizza Cardapio==============");
        System.out.println(" preço: 2500");
        System.out.println(" deseja personalizar a sua  a sua pizza");
        System.out.println("1-sim");
        System.out.println("2-voltar");
        int  choose= scanner.nextInt();
          switch (choose) {
            case 1:
             pizza_menu_ingredient.ingredient();      
              break;
              case 2:
              

              break;
          
            default:
              break;
          }
     

                             
      


                              }
    
}
