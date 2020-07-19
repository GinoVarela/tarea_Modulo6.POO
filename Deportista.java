package helpers;

/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Deportista extends Persona {
        private String Entrenador;
        private String Posicion;
                
       public Deportista (){
       setNombre("Juan Carlos");
       setApellido("Nuñez Barahona");
       setDireccion("Tegucigalpa/Honduras");
       setProfesion("Deportista");
       setEstadoCivil("Casado");
       setIdentidad("0801 1980 87248");
       setEdad(40);
       setExp(19);
       
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
           System.out.println("Entrenador: " + Entrenador);
       }
       public void printPosicion(){
        System.out.println("Posicion" + Posicion);
       }
       
}
