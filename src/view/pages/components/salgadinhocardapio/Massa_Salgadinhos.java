package view.pages.components.salgadinhocardapio;

import java.util.Scanner;

public class Massa_Salgadinhos {
      String tipo;
      double valor;
       Scanner scanner=new Scanner( System.in);
      

           public   void  massaTypes(){
            int chooseOfOption;
                        System.out.println("===========MOLHOS==========");
                System.out.println("       1-Molho marinara");
                System.out.println("       2-Molho branco:");
                System.out.println("       3-Molho pesto");
                System.out.println("       4-Voltar");
                 chooseOfOption=scanner.nextInt();
           }
    
}
