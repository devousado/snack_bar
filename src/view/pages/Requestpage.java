package view.pages;

import java.util.Scanner;

public class Requestpage {
     Scanner scannerRequest=new Scanner(System.in);
 public   void  requestPage(){ 
    
    System.out.println("========== deseja  efectuar um pedido?==========");
    System.out.println("               1-SIM      ");     
    System.out.println("               2-NAO      ");
  

    int option=scannerRequest.nextInt();
      while (option!=1 && option!=2) {
    System.out.println("deve digitar um numero corespondente");
   option=scannerRequest.nextInt();
    
   }
 
     switch (option) {
      case 1:
      RegisterClientView  registerPage= new RegisterClientView();
      registerPage.loginPage();
     
      Productpage productoPage= new Productpage();
      productoPage.product();
   
      break;
      case 2:
      System.out.println("pedido cancelado com sucesso (:,obrigado pela sua visita ");
      break;
    
     
      default:
         break;
     }



  }
    
}
