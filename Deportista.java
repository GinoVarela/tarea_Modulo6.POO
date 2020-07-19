package helpers;

/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Deportista extends Persona {
        private String Entrenador;
        private String Posicion;
                
       public Deportista (){
       setNombre("Alejandro");
       setApellido("Perez");
       setDireccion("Choluteca/Ciudad de choluteca");
       setProfesion("Doctor");
       setEstadoCivil("Casado");
       setIdentidad("0803 2000 23348");
       setEdad(20);
       setExp(2);
       
   }
       
       public void Entrenador(int a){
           switch (a){
               case 1:{
                   Entrenador="Roberto Zosa";
                   break;
               }
               case 2:{
                   Entrenador="Alberto Silo";
                   break;
               }
               case 3:{
                   Entrenador="Antonio Perez";
                   break;
               }
               case 4:{
                   Entrenador="Jack Hernandez";
                   break;
               }
           }
           
       }
              
       public void PosicionJuego(int b){
           switch (b){
               case 1:{
                   Posicion="Portero";
                   break;
               }
               case 2:{
                   Posicion="Defensa";
                   break;
               }
               case 3:{
                   Posicion="Volante";
                   break;
               }
               case 4:{
                   Posicion="Delantero";
                   break;
               }
           }
       }
       
       public void printEntrenador(){
           System.out.println(Entrenador);
       }
       public void printPosicion(){
        System.out.println(Posicion);
       }
       
}
