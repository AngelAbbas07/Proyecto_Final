/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avance1delproyect;


import java.util.Scanner;

/**
 *
 * @author lisandro Diaz
 */
public class Avance1delproyect {

    /**
     * c. Permitir manejar distintos sueldos base para diferentes trabajadores.
       e.Mostrar un reporte del pago semanal por empleado (días trabajados, faltas,/ descuento, total a pagar).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double sueldoBase=0;
        int empleadoTotal=0;
                
       //procesa los datos del empleado,programcion basada a objetos 
        Empleado empleado1 = new Empleado("Daniel", 1000.0);
        Empleado empleado2 = new Empleado("María", 1500.0);
        Empleado empleado3 = new Empleado("oscar",2000.0);
        Empleado empleado4 = new Empleado("meylin",2100.0);
        Empleado empleado5 = new Empleado("Lisandro",2100.0);
        
        
        System.out.println("Ingrese el numero de trabajadores:");
        empleadoTotal=sc.nextInt();
        
        //para repetir el proceso de cada trabajador
        for (int i = 1; i <= empleadoTotal; i++) {
             System.out.println("Ingrese su sueldo base:");
             sueldoBase =sc.nextDouble();
             System.out.println("ingrese los dias trabajados: ");
             int diasTrabajados= sc.nextInt();
             System.out.println("ingrese el nuemero de falta:");
             int falta=sc.nextInt();
        
         }//fin del ciclo for
            
        }
    }
    

