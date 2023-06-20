package view.pages;

import java.util.Scanner;

import view.pages.components.lanchecardapio.Lanche_Cardapio_Component;
import view.pages.components.pizzacardapio.Pizza_Cardapio_Component;
import view.pages.components.salgadinhocardapio.Salgadinho_Cardapio_Component;



public class Productpage {
    Scanner myScanner= new Scanner(System.in);
    Pizza_Cardapio_Component  pizza_Cardapio=new Pizza_Cardapio_Component();
     Lanche_Cardapio_Component lanche_Cardapio_Component=new Lanche_Cardapio_Component();
     Salgadinho_Cardapio_Component salgadinho_Cardapio_Component=new Salgadinho_Cardapio_Component();


   public   void product(){
     
    System.out.println("  o snackbar oferece os seguintes tipos de produtos :\n ");
    System.out.println("          1- Pizzas");
    System.out.println("          2- Lanches");
    System.out.println("          3-Salgadinhos");
  
    

int chooseOfItem=myScanner.nextInt();
while (chooseOfItem!=1 && chooseOfItem!=2 && chooseOfItem!=3) {
    System.out.println("deve digitar um numero corespondente");
    chooseOfItem=myScanner.nextInt();
    
   }
      switch (chooseOfItem) {
        case  1:
         pizza_Cardapio.pizzaCardapio(); 
             break;
        case 2:
        lanche_Cardapio_Component.lancheCardapio();
      
        break;
        case 3:
        salgadinho_Cardapio_Component.salgadinhocardapio();
        
       
        break;

      
        default:
         
         
           break;
      }
   }
    

      
    
}
