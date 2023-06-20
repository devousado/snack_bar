package configure.conectionDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConectionWithMysql {
     private static String url="jdbc:mysql://localhost:3306/snack_bar_db?user=root&password=";

      private static  Connection connectionStatus;
  public static Connection connection() throws SQLException{
      try {
          if (connectionStatus==null) {
           
             connectionStatus=DriverManager.getConnection(url);
             return connectionStatus;
            
        }else{
            return connectionStatus;
        }

      } catch (Exception e) {
        e.printStackTrace();
         return null;
      }
      }
    
}
