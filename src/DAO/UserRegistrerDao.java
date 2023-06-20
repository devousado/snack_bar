package DAO;
import java.sql.PreparedStatement;


import configure.conectionDataBase.DataBaseConectionWithMysql;
import model.entity.ClientEntity;

public class UserRegistrer {
    




  public void cadastrar( ClientEntity clientEntity){
         String sql="INSERT INTO cliente(nome,email,provincia,bairro,telefone,municipio)VALUES(?,?,?,?,?,?)";
       PreparedStatement preparedStatement=null;
      
   
       try {
      
      preparedStatement= DataBaseConectionWithMysql.connection().prepareStatement(sql);
      preparedStatement.setString(1, clientEntity.getNome());
      preparedStatement.setString(2, clientEntity.getEmail());
      preparedStatement.setString(3, clientEntity.getProvincia());
      preparedStatement.setString(4,clientEntity.getBairro());
      preparedStatement.setString(5, clientEntity.getTelefone());
      preparedStatement.setString(6, clientEntity.getMunicipio());

      preparedStatement.execute();
    
      preparedStatement.close();
   } catch (Exception e) {
    System.out.println(e);

   }
  }
    

    
}
