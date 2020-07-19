package tarea_modulo6poo;
import helpers.Deportista;
import helpers.Doctor;
import java.util.Scanner;
/**
 *
 * @author Gino Ortiz  <ginojavier96@gmail.com>
 */
public class Tarea_Modulo6POO {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
         Doctor Dr=new Doctor();
         Deportista Dp= new Deportista();
               
        System.out.println("Profesion:" + Dr.getProfesion());
        System.out.println("Nombre:" + Dr.getNombre());
        System.out.println("Apellido:" + Dr.getApellido());
        System.out.println("Edad:"+ Dr.getEdad() + " Años");
        System.out.println("Experiencia en el campo:"+ Dr.getExp() + " Años");
        System.out.println("Numero de Identidad:" + Dr.getIdentidad());
        System.out.println("Direccion:" + Dr.getDireccion());
        System.out.println("Estado Civil: " + Dr.getEstadoCivil());
        Dr.Area(2);
        Dr.printArea();
        Dr.Turno(2);
        Dr.printTurno();
        
        System.out.println("Profesion:" + Dp.getProfesion());
        System.out.println("Nombre:" + Dp.getNombre());
        System.out.println("Apellido:" + Dp.getApellido());
        System.out.println("Edad:"+ Dp.getEdad() + " Años");
        System.out.println("Experiencia en el campo:"+ Dp.getExp() + " Años");
        System.out.println("Numero de Identidad:" + Dp.getIdentidad());
        System.out.println("Direccion:" + Dp.getDireccion());
        System.out.println("Estado Civil: " + Dp.getEstadoCivil());
        Dp.Entrenador(2);
        Dp.printEntrenador();
        Dp.PosicionJuego(2);
        Dp.printPosicion();
        

        
        
           }
    
}
