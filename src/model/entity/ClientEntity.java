package model.entity;



public class ClientEntity {
   
   
   
  int id;
  private String nome;
  private  String bairro ;
  private String telefone;
  private String municipio;
  public String getMunicipio() {
   return municipio;
}
public void setMunicipio(String municipio) {
   this.municipio = municipio;
}
private String email;

   private String  provincia;
   public String getNome() {
      return nome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public String getBairro() {
      return bairro;
   }
   public void setBairro(String bairro) {
      this.bairro = bairro;
   }
   public String getTelefone() {
      return telefone;
   }
   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
 
   public String getProvincia() {
      return provincia;
   }
   public void setProvincia(String provincia) {
      this.provincia = provincia;
   }








}
