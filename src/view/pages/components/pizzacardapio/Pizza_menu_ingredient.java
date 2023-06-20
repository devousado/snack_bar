package view.pages.components.pizzacardapio;


import java.util.Scanner;

public class Pizza_menu_ingredient {
     Scanner scanner=new Scanner(System.in);

  public  void ingredient(){
     Coberturas_Pizza cobertura= new Coberturas_Pizza();
      Molhos_Pizza molhos=new Molhos_Pizza();
       Recheios_Pizza recheios=new Recheios_Pizza();
     int chooseOfOption;
      System.out.println("==========INGREDIENTES===========");
    System.out.println("           1-Recheios");
    System.out.println("           2-coberturas");
    System.out.println("           3-molhos");
    System.out.println("           4-voltar");
     chooseOfOption=scanner.nextInt();
      switch (chooseOfOption) {


        case 1:
             recheios.recheiosTypes();
            break;
        case 2:
   
   cobertura.coberturaTypes();
            break;
        case 3:
         molhos.molhosTypes();
            
            break;
        case 4:
            
            break;
      
        default:
            break;
      }
    

 }
    
}
