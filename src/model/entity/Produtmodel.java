package model.entity;

import java.util.HashMap;
import java.util.Map;

public class Produt_model  {
     Produt_model(String productname,double pricesell,double weigthy,String expirationdate){
 
        productname=productName;
        priceSell=pricesell;
        weigth=weigthy;
        expirationDate=expirationdate;
     }
     int id;
     String productName;
     double priceSell;
     double weigth;
     String  expirationDate;
    public  Map<String ,Object>  toDataBase( ){

        Map <String,Object> dataToDataBase= new HashMap <>();
         dataToDataBase.put("id", this.id);
        dataToDataBase.put("productName",this.productName);
        dataToDataBase.put("priceSell", this.priceSell);
        dataToDataBase.put("weigth", this.weigth);
        dataToDataBase.put("expirationDate", this.expirationDate);
        return dataToDataBase;


                                        }
    public  Produt_model fromDataBase(Map <String,Object>dataFromDataBase){


          String keyNameProduct= (String)dataFromDataBase.get("productName");
          String keypriceSell= (String)dataFromDataBase.get("priceSell");
          double doubleConvertTheKeyPriceSell=Double.parseDouble(keypriceSell);
          String keyWeigth= (String)dataFromDataBase.get("weigth");
          double  doubleConvertTheKeywigth= Double.parseDouble(keyWeigth);
          String keyExpiratioDate= (String)dataFromDataBase.get("expirationDate");
    


        return   new Produt_model(   keyNameProduct,doubleConvertTheKeyPriceSell,doubleConvertTheKeywigth,keyExpiratioDate);
                 
                                                                      }
@Override
    public String toString() {
  super.toString();
 //
        return  "Class_Model[ id="+id+" productName="+ productName+"weigth="+weigth+"]";
}



    
}
