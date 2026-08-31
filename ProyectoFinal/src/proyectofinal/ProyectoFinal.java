/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author drmen
 */
public class ProyectoFinal {

    /**
     * Objetivo General
Desarrollar un programa en Java que permita registrar la asistencia diaria de varios
trabajadores, calcular su sueldo semanal según los días trabajados, y aplicar
bonificaciones por cumplimiento mensual, facilitando así el control administrativo del
personal de la empresa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc =  new Scanner(System.in);
       
       
       String NombreTrabajador = "";
       String PuestoTrabajador = "Operario,Cortador,Control de calidad, Empacador";
       int DiasTrabajados=  0;
       Double SueldoBase = 0.00;
       int DiasNoTrabajados= 0;
       
        TrabajadoresAsistencia(); // Bienvenida 1ra funcion
        
        NombreTrabajador = RegistroNombres(sc);
        
        PuestoTrabajador = RegistroPuestos(sc);
        
      
       
    }//fin del main 
    
        public static void  TrabajadoresAsistencia(){
            System.out.println("Registro de Trabajadores y Asistencia");
        }
        
        public static String RegistroNombres(Scanner sc){
            System.out.println("Nombre del trabajador: ");
           String Nombre = "";
           
           Nombre = sc.nextLine();
           
           return Nombre;
        }
        
        public static String RegistroPuestos(Scanner sc){
            System.out.println("Ingrese el cargo en la empresa: ");
            String Puesto = "";
          
           
            do {
                Puesto = sc.nextLine();
               if(Puesto.isEmpty()){ //Por si el usuario ingresa un espacio vacio
                System.out.println("Error: Debe ingresar su puesto");
               }
               else if (!Puesto.equals("Operario")&& // Este else if lo usamos en conjunto con el ! para cuando el usuario 
                     !Puesto.equals("Cortador")&&    // coloca un puesto que no existe
                     !Puesto.equals("Control de calidad")&&
                     !Puesto.equals("Empacador"))
                   
                System.out.println("Este puesto no existe, ingrese nuevamente un puesto de trabajo");
            }while(Puesto.isEmpty() || (!Puesto.equals("Operario")&&            //voy a usaar un do while para hacer que si el usuario sigue ingresando
                                        !Puesto.equals("Cortador")&&            //algo incorrecto vuelva a pedir el puesto hasta que ingrese un puesto
                                        !Puesto.equals("Control de calidad")&&  // correcto
                                         !Puesto.equals("Empacador")));         
            
            return Puesto;   
        }// fin de la funcion RegitroPuestos
        
        
        

    

 
}// fin del codigo 
