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
       
       //Areglos de nombres de los empleados
       String [] nombres = new String [5];
       nombres[0] = "";
       nombres[1] = "";
       nombres[2] = "";
       nombres[3] = "";
       nombres[4] = "";
       
       //Arreglo de sueldo diario de cada empleado
       int  [] SueldoPorDia = new int [5];
       SueldoPorDia [0] = 500;//operario
       SueldoPorDia [1] = 575;//cortador
       SueldoPorDia [2] = 750;//supervisor
       SueldoPorDia [3] = 550;//control de calidad
       SueldoPorDia [4] = 550;// empacador
       
      
       
       //Variables
       String [] PuestoPermitidos = {"Operario","Supervisor de produccion","Cortador","Control de calidad", "Empacador"};//areglo de cargos 
       String [] DiasSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};//arreglo de dias de la semana 
       int DiasNoTrabajados= 0;
       int DiasTrabajados=0;
       int sueldoTotal = 0;
       
        TrabajadoresAsistencia(); // Bienvenida 1ra funcion
       
        //registro de nombres
        for (int i=0; i<nombres.length; i++){
        System.out.println("Ingresa el nombre del trabajador:");
        nombres[i]= sc.nextLine();
        }
        LineasdeSeparacion();
        // for (int i=0; i<nombres.length; i++){
        //System.out.println(nombres[i]);        para mostrar el nombre ELIMINAR LUEGO
        //}
        
        //Registro de puestos 
        //PuestoPermitidos = RegistroPuestos(sc);
        String PuestoI = "";
             String [] Puesto = new String [5];
               Puesto[0] = "";
               Puesto[1] = "";
               Puesto[2] = "";
               Puesto[3] = "";
               Puesto[4] = "";
               
            for(int i=0; i<Puesto.length; i++){
              
                 
                 System.out.println("""
                  Lista de cargos:
                   1.Operario
                   2.Cortador
                   3.Supervisor de produccion
                   4.Control de calidad
                   5.Empacador
                                   """);
                  LineasdeSeparacion();
            do {
                
                 System.out.println("Ingrese el cargo en la empresa de: " + nombres[i]);
                 PuestoI = sc.nextLine();
                 LineasdeSeparacion();
               if(PuestoI.isEmpty()){ //Por si el usuario ingresa un espacio vacio
                System.out.println("Error: Debe ingresar su puesto");
               }
               else if (!PuestoI.equals("Operario")&& // Este else if lo usamos en conjunto con el ! para cuando el usuario 
                     !PuestoI.equals("Cortador")&&    // coloca un puesto que no existe
                     !PuestoI.equals("Control de calidad")&&
                     !PuestoI.equals("Supervisor de produccion")&&
                     !PuestoI.equals("Empacador"))
                   
                System.out.println("Este puesto no existe, ingrese nuevamente un puesto de trabajo");
            }while(PuestoI.isEmpty() || (!PuestoI.equals("Operario")&&            //voy a usaar un do while para hacer que si el usuario sigue ingresando
                                        !PuestoI.equals("Cortador")&&            //algo incorrecto vuelva a pedir el puesto hasta que ingrese un puesto correcto
                                        !PuestoI.equals("Control de calidad")&&
                                        !PuestoI.equals("Supervisor de produccion")&&                                         
                                        !PuestoI.equals("Empacador")));      
            Puesto [i]= PuestoI;
            } 
            
        // regitro de asistencia 
        //Arreglo bidimensional de los dias que asistio a trabajar
        boolean [][] AsistenciaDiaria = new boolean [5][6];
       
        for (int i=0; i<AsistenciaDiaria.length;i++){ //coloco el nombre del arreglo para no tener que cambiar en un futuro el numero del for 
            for(int j=0; j<AsistenciaDiaria[i].length;j++){
                System.out.println("Validacion de asistencia");
                System.out.println("Trabajador:" + nombres [i] + ",Asistio el "+ DiasSemana[j] +",Si/No");// identifica cada trabajador y dia 
                String respuesta = sc.nextLine();
               AsistenciaDiaria[i][j] = respuesta.equals("Si");
               
               if(!respuesta.equals("Si")&&
                   !respuesta.equals("No")){
                    System.out.println("Respuesta invalida, ingrese nuevamente si su trabajador si asistio o no ");
            }
        }
        }
        //Resumen de Asistencia semanal
         LineasdeSeparacion();
        System.out.println("Resumen de Asistencia Semanal");
        
    }//fin del main 
        
        public static void LineasdeSeparacion(){
            System.out.println("----------------------------------------");
        }
        public static void  TrabajadoresAsistencia(){
            System.out.println("Registro de Trabajadores y Asistencia");
            System.out.println("");
        }
        
       
}// fin del codigo 
