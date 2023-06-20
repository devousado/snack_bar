package view.pages;
import java.util.Scanner;

import model.entity.ClientEntity;
import model.usercases.register.RegisterClientUsercase;





public class RegisterClientView {
     RegisterClientUsercase registecontrollerclient= new RegisterClientUsercase();
      ClientEntity clientEntity = new ClientEntity();
    
      
      Scanner scanner=new Scanner(System.in);

       
    public void loginPage(){
        System.out.println("Para efectuar o pedido pricisa fornecer alguns dados seus:");
        System.out.println("==============Cadastro=========");
        System.out.println("Insira  o seu nome:");
        String nome= scanner.nextLine();
        System.out.println("provincia:");
        String provincia=scanner.nextLine();
        System.out.println("Municipio:");
        String municipio=scanner.nextLine();
        System.out.println("Municipio:");
        String bairro=scanner.nextLine();
        System.out.println("Numero de Telefone:");
        String telefone=scanner.nextLine();
        System.out.println("Email:");
        String email=scanner.nextLine();
        clientEntity.setEmail(email);
        clientEntity.setProvincia(provincia);
        clientEntity.setNome(nome);
        clientEntity.setTelefone(telefone);
        clientEntity.setMunicipio(municipio);
        clientEntity.setProvincia(bairro);
            
        registecontrollerclient.register(clientEntity);
        System.out.println("  ==========O seu cadastro foi feito com sucesso=========");
       



             }
            
    
}
