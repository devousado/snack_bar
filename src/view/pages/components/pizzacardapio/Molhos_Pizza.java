package view.pages.components.pizzacardapio;

import java.util.Scanner;

public class Molhos_Pizza {
     String tipo;
      double valor;
       Scanner scanner=new Scanner( System.in);
      

           public   void  molhosTypes(){
            int chooseOfOption;
                        System.out.println("===========MOLHOS==========");
                System.out.println("       1-Molho marinara");
                System.out.println("       2-Molho branco:");
                System.out.println("       3-Molho pesto");
                System.out.println("       4-Voltar");
                 chooseOfOption=scanner.nextInt();
           }
    
}
