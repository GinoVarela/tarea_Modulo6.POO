package helpers;

/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Doctor extends Persona {
  
    private String Turno;
    private String Area;
    
    public Doctor(){
        setNombre("Alejandro");
        setApellido("Perez");
        setDireccion("Choluteca/Ciudad de choluteca");
        setProfesion("Doctor");
        setEstadoCivil("Casado");
        setIdentidad("0803 2000 23348");
        setEdad(20);
        setExp(2);

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
           System.out.println(Turno);
       }
       public void printArea(){
        System.out.println(Area);
       }
    
}
