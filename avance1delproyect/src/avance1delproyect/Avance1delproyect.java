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
        int diasTrabajados=0;
        int faltas=0;
        double descuento=0;
        double TotalPagar=0;      
       
                
        System.out.println("Ingrese el sueldo Base: ");
        sueldoBase=sc.nextDouble();
        
        System.out.println("Ingrese los dias trabajados: ");
        diasTrabajados=sc.nextInt();
        
        System.out.println("Ingrese las fatas en la semana:");
        faltas=sc.nextInt();
        
         sc.nextLine(); // Limpiar buffer
         
        descuento=faltas*sueldoBase;
        TotalPagar=(diasTrabajados*sueldoBase)- descuento;
        
       if(TotalPagar<0)
           
        impresionLineaAsterisco();
        System.out.println("Reporte De Pago Semanal");
        impresionLineaAsterisco();
        System.out.println("Sueldo base diario  : Lps. " + sueldoBase);
        System.out.println("Días trabajados     : " + diasTrabajados);
        System.out.println("Faltas              : " + faltas);
        System.out.println("Descuento por faltas: Lps. " + descuento);
        impresionLineaAsterisco();
        System.out.println("TOTAL A PAGAR       : Lps. " + TotalPagar);
       impresionLineaAsterisco();
        
    
     }
     public static void impresionLineaAsterisco(){
      System.out.println("*************************************************");
         
     }//FIN DE LA FUNCION ImpresionLineaAsterisco
    }
    

