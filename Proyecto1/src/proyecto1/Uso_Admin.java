
package proyecto1;

public class Uso_Admin {
    public String id;
    public String nombre;
    public String user;
    public String password;
    
    public Uso_Admin(){
        id="";
        nombre="";
        user="";
        password="";
    }
    
    public Uso_Admin(String id1,String nombre1,String user1,String password1){
        id=id1;
        nombre=nombre1;
        user=user1;
        password=password1;
        
    }
    
    public String getId(){
        return id;
    }
    public void SetId(String id1){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user=user;
    }
    public String getContraseña(){
        return password;
    }
    public void setContraseña(String pasword){
        this.password=password;
    }
    
}
