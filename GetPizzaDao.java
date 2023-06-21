package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import configure.conectionDataBase.DataBaseConectionWithMysql;

import model.entity.PizzaEntity;


public class GetPizzaDao {
    private static GetPizzaDao instance;
    
    // Outras variáveis e métodos da classe
    
    // Construtor privado para evitar instanciação direta
    private GetPizzaDao() {
        // Inicialização do objeto
    }
    
    // Método estático para obter a instância única da classe
    public static GetPizzaDao getInstance() {
        if (instance == null) {
            synchronized (GetPizzaDao.class) {
                if (instance == null) {
                    instance = new GetPizzaDao();
                }
            }
        }
        return instance;
    }
   
       public List<PizzaEntity>ler() {
        String sql = "SELECT pizzas.idPizza,pizzas.nome, pizzas.cobertura,pizzas.recheio,pizzas.molho ,pizzas.fk_ItemVenda_idVenda,itemvenda.precoVenda,itemvenda.peso,itemvenda.validade from pizzas join itemvenda on pizzas.idpizza=itemvenda.idvenda;"; 
        ResultSet resultSet=null;
        Connection connection=null;
        PreparedStatement preparedStatement=null;
       List<PizzaEntity>pizzaList=new ArrayList<>();
                try {
                    connection=DataBaseConectionWithMysql.connection();
                    preparedStatement=(PreparedStatement)connection.prepareStatement(sql);
                         resultSet=preparedStatement.executeQuery();
                          while (resultSet.next()) {
                         PizzaEntity pizzaEntity=new PizzaEntity();
                         pizzaEntity.setId(resultSet.getInt("idPizza"));
                         pizzaEntity.setProductName(resultSet.getString("nome"));
                         pizzaEntity.setPriceSell(resultSet.getFloat("precoVenda"));
                         pizzaEntity.setWeigth(resultSet.getString("peso"));
                         pizzaEntity.setExpirationDate(resultSet.getString("validade"));
                         pizzaEntity.setCobertura(resultSet.getString("cobertura"));
                         pizzaEntity.setMolhos(resultSet.getString("molho"));
                          pizzaEntity.setRecheios(resultSet.getString("recheio"));
                        

                         
                     pizzaList.add(pizzaEntity);

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
      

   return pizzaList;
    }
    
}
    
