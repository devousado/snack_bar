package view.pages.components.salgadinhocardapio;

import java.util.Scanner;


public class Salgadino_Menu {

      Scanner scanner=new Scanner(System.in);
      Massa_Salgadinhos massa_Salgadinhos=new Massa_Salgadinhos();
     Tipo_Salgadinho tipo_Salgadinho=new Tipo_Salgadinho();
     Recheio_Salgadinho recheio_Salgadinho=new Recheio_Salgadinho();
  
     public  void ingredient(){
   
    int chooseOfOption;
    System.out.println("==========INGREDIENTES===========");
    System.out.println("           1-tipo");
    System.out.println("           2-massa");
    System.out.println("           3-recheio");
    System.out.println("           4-voltar");
     chooseOfOption=scanner.nextInt();
      switch (chooseOfOption) {


        case 1:
       tipo_Salgadinho.salgadinhoType();
    
            break;
  

        
        case 2:
        massa_Salgadinhos.massaTypes();
        
   
   
            
            break;
        case 3:
        recheio_Salgadinho.recheiosTypes();
            
            break;
      
        default:
            break;
      } 
    }
}
