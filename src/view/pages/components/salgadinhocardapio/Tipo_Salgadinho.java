package view.pages.components.salgadinhocardapio;

import java.util.Scanner;

public class Tipo_Salgadinho {
 Scanner scanner=new Scanner(System.in);    
     public void salgadinhoType(){
         int choose;
  System.out.println("=============TIPO DE SALGADINHO:============");
  System.out.println("           1-Assado");
  System.out.println("          2-Frito");
  System.out.println("         3-Voltar");
    choose=scanner.nextInt();

     }
    
}
