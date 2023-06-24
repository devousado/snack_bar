package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import configure.conectionDataBase.DataBaseConectionWithMysql;
import model.entity.LanchesEntity;


public class GetLanchesDao {
       private static GetLanchesDao instance;
    
    // Outras variáveis e métodos da classe
    
    // Construtor privado para evitar instanciação direta
    private GetLanchesDao() {
        // Inicialização do objeto
    }
    
    // Método estático para obter a instância única da classe
    public static GetLanchesDao getInstance() {
        if (instance == null) {
            synchronized (GetPizzaDao.class) {
                if (instance == null) {
                    instance = new GetLanchesDao();
                }
            }
        }
        return instance;
    }
   
       public List<LanchesEntity>ler() {
        String sql = "SELECT lanches.idLanche,lanches.nome,lanches.recheio,lanches.pao,lanches.molho ,lanches.fk_ItemVenda_idVenda,itemvenda.precoVenda,itemvenda.peso,itemvenda.validade from lanches join itemvenda on lanches.idLanche=itemvenda.idvenda;"; 
        ResultSet resultSet=null;
        Connection connection=null;
        PreparedStatement preparedStatement=null;
       List<LanchesEntity>lanchlList=new ArrayList<>();
                try {
                    connection=DataBaseConectionWithMysql.connection();
                    preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
                         resultSet=preparedStatement.executeQuery();
                          while (resultSet.next()) {
                 LanchesEntity     lanchesEntity=new LanchesEntity();
                        lanchesEntity.setId(resultSet.getInt("idLanche"));
                       lanchesEntity.setProductName(resultSet.getString("nome"));
                        lanchesEntity.setPriceSell(resultSet.getFloat("precoVenda"));
                       lanchesEntity.setWeigth(resultSet.getString("peso"));
                        lanchesEntity.setExpirationDate(resultSet.getString("validade"));
                        lanchesEntity.setPao(resultSet.getString("pao"));
                       lanchesEntity.setMolhos(resultSet.getString("molho"));
                         lanchesEntity.setRecheios(resultSet.getString("recheio"));
                        

                         
                   lanchlList.add(lanchesEntity);

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
      

   return lanchlList;
    } 
}
