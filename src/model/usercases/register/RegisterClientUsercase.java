package model.usercases.register;

import DAO.UserRegistrer;
import model.entity.ClientEntity;

public class  RegisterClientUsercase   {
  

   

   


    public void register( ClientEntity clientEntity) {
 new UserRegistrer().cadastrar(clientEntity);
    }

 
    
}
