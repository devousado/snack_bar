package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import configure.conectionDataBase.DataBaseConectionWithMysql;

import model.entity.SalgadinhoEntity;

public class GetSalgadinhoDao {
       private static GetSalgadinhoDao instance;
    
    // Outras variáveis e métodos da classe
    
    // Construtor privado para evitar instanciação direta
    private GetSalgadinhoDao() {
        // Inicialização do objeto
    }
    
    // Método estático para obter a instância única da classe
    public static GetSalgadinhoDao getInstance() {
        if (instance == null) {
            synchronized (GetPizzaDao.class) {
                if (instance == null) {
                    instance = new GetSalgadinhoDao();
                }
            }
        }
        return instance;
    }
   
       public List<SalgadinhoEntity>ler() {
        String sql = "SELECT salgadinhos.idSalgadinho,salgadinhos.nome,salgadinhos.recheio,salgadinhos.massa ,salgadinhos.fk_ItemVenda_idVenda,itemvenda.precoVenda,itemvenda.peso,itemvenda.validade from salgadinhos join itemvenda on salgadinhos.idSalgadinho=itemvenda.idvenda;"; 
        ResultSet resultSet=null;
        Connection connection=null;
        PreparedStatement preparedStatement=null;
       List<SalgadinhoEntity>salgadinholList=new ArrayList<>();
                try {
                    connection=DataBaseConectionWithMysql.connection();
                    preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
                         resultSet=preparedStatement.executeQuery();
                          while (resultSet.next()) {
               
               SalgadinhoEntity salgadinhoEntity=new SalgadinhoEntity();
                        salgadinhoEntity.setId(resultSet.getInt("idSalgadinho"));
                      salgadinhoEntity.setProductName(resultSet.getString("nome"));
                       salgadinhoEntity.setPriceSell(resultSet.getFloat("precoVenda"));
                   salgadinhoEntity.setWeigth(resultSet.getString("peso"));
                        salgadinhoEntity.setExpirationDate(resultSet.getString("validade"));
                    salgadinhoEntity.setMassa(resultSet.getString("massa"));
                    
                      salgadinhoEntity.setRecheios(resultSet.getString("recheio"));
                        

                         
                 salgadinholList.add(salgadinhoEntity);

                          }
                } catch (Exception e) {
                    e.printStackTrace();
                  
                }finally{
                  try {
                      if (resultSet!=null) {
            
                        
                    }
                    if (preparedStatement!=null) {

                    
                    }
                    if (connection!=null) {
                   
                        
                    }
                  } catch (Exception e) {
                e.printStackTrace();
                  }
                }
      

   return salgadinholList;
    } 
    
}
