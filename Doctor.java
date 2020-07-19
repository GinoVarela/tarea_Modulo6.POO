package helpers;

/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Doctor extends Persona {
  
    private String Turno;
    private String Area;
    
    public Doctor(){
        setNombre("Jorge Alejandro");
        setApellido("Perez Gleano");
        setDireccion("Choluteca/Ciudad de choluteca");
        setProfesion("Doctor");
        setEstadoCivil("Casado");
        setIdentidad("0801 1985 23348");
        setEdad(35);
        setExp(5);

    }
    
  public void Turno(int a){
           switch (a){
               case 1:{
                   Turno="Mañana";
                   break;
               }
               case 2:{
                   Turno="Tarde";
                   break;
               }
               case 3:{
                   Turno="Noche";
                   break;
               }
               default :{
                   break;
               }
            }
        }
    
   public void Area(int b){
           switch (b){
               case 1:{
                   Area="Pediatria";
                   break;
               }
               case 2:{
                   Area="Torax";
                   break;
               }
               case 3:{
                   Area="Quemados";
                   break;
               }
               case 4:{
                   Area="Emergencia";
                   break;
               }
               default:{
                   break;
               }
            }
         }
   
       public void printTurno(){
           System.out.println("Turno: " + Turno);
       }
       public void printArea(){
        System.out.println("Area: " + Area);
       }
    
}
