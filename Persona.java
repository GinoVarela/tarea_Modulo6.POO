package helpers;

/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String profesion;
    private String estadocivil;
    private String Identidad;
    private int Edad;
    private int Exp;
    
    public Persona (){
        
    }
    
    //set everything
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public void setProfesion(String profesion){
        this.profesion=profesion;
    }
    
    public void setEstadoCivil(String estadocivil){
        this.estadocivil=estadocivil;
    }
    
    public void setIdentidad(String identidad){
        this.Identidad=identidad;
    }
    
    public void setEdad(int edad){
        this.Edad=edad;
    }
    
    public void setExp(int exp){
        this.Exp=exp;
    }
    //get everything
    
     public String getNombre(){
        return this.nombre;
    }

     public String getApellido(){
        return this.apellido;
    }

     public String getDireccion(){
        return this.direccion;
    }

     public String getProfesion(){
        return this.profesion;
    }     

     public String getEstadoCivil(){
        return this.estadocivil;
    }

     public String getIdentidad(){
        return this.Identidad;
    }         
     
     public int getEdad(){
        return this.Edad;
    }
   
     public int getExp(){
        return this.Exp;
    }
}
