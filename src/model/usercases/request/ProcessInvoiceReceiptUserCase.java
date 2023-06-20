package model.usercases.request;

import java.util.ArrayList;
import java.util.List;

public class ProcessInvoiceReceiptUserCase {
      private static ProcessInvoiceReceiptUserCase instance;
      private  double totalMoneyOfProducIsBeeinggBought=0;
      private  List<String> listOfProductBought= new ArrayList<>();
  

    private ProcessInvoiceReceiptUserCase() {
        // Construtor privado para impedir a criação de instâncias externamente
    }

    public static ProcessInvoiceReceiptUserCase getInstance() {
        if (instance == null) {
            synchronized (ProcessInvoiceReceiptUserCase.class) {
                if (instance == null) {
                    instance = new ProcessInvoiceReceiptUserCase();
                }
            }
        }
        return instance;
    }
  



  
    

        public void setTotalMoneyOfProducIsBeeinggBought( double amount) {

     
        totalMoneyOfProducIsBeeinggBought += amount;
      
    }
    public double getTotalMoneyOfProducIsBeeinggBought (){
      return totalMoneyOfProducIsBeeinggBought;
    }

    
 public void setListOfProductBought(String nome){
   listOfProductBought.add(nome);
 }
 public List<String>getListOfProductBought(){
  
  return listOfProductBought;
 }
    

    
}
