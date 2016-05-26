/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador;

import clases.*;
import java.util.Scanner;

/**
 *
 * @author jokerman
 */

public class operarVehiculo {
     private int opcion;
    Scanner sc = new Scanner(System.in);
    VehiculoDeTransporte Vdt;
    VehiculoDeCarga Vdc ;
    VehiculoParticular Vp;
    public operarVehiculo(){
        opcion=0;
        
    }
    public String elegirTipo(){
        String tipo = null;
        System.out.println("\nIngrese opcion:\n");
        System.out.println("1.-Vehiculo de trasporte");
        System.out.println("2.-Vehiculo de carga");
        System.out.println("3.-Vehiculo particular");
        opcion = sc.nextInt();
        switch(opcion){
        case 1:
            tipo="Vdt";
            Vdt = new VehiculoDeTransporte();
            
        break;
        case 2:
            tipo="Vdc";
            Vdc = new VehiculoDeCarga();
        break;
        case 3:
            tipo="Vp";
            Vp = new VehiculoParticular();
        break;
        default:break;
    }
        return tipo;
    }
   
   
    public  void operar(String tipo){
        switch (tipo) {
             case "Vdt":
                while(opcion != 7) {
                System.out.println("\nIngrese opcion:\n");
                System.out.print("1.-Acelerar \n2.-Desaelerar \n3.-Frenar \n4.-Comprobar velocidad\n5.-Girar a la derecha\n6.-girar a la izquierda\n7.-Salir \n");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        if(Vdt.velocidad<Vdt.velocidadMax){
                            Vdt.acelerar();
                        }
                
                        break;
                        case 2:
                            Vdt.desaelerar();
                            break;
                        case 3:
                            Vdt.frenar();
                            break;
                        case 4:
                            System.out.println("\nVelocidad actual: "+Vdt.comprobarVelocidad()+" Kmh\n");
                            break;
                        case 5:
                            System.out.println(Vdt.girarDerecha());
                            break;
                        case 6:
                            System.out.println(Vdt.girarIzquierda());
                            break;

                        default:System.out.println("\nGAMER OVER\n");break; 
                        }
                        } 
                break;
            case "Vdc":
                 while(opcion != 7) {
                        System.out.println("\nIngrese opcion:\n");
                        System.out.print("1.-Acelerar \n2.-Desaelerar \n3.-Frenar \n4.-Comprobar velocidad\n5.-Girar a la derecha\n6.-girar a la izquierda\n7.-Salir \n");
                        opcion = sc.nextInt();
                        switch(opcion){
                        case 1:
                            if(Vdc.velocidad<Vdc.velocidadMax){
                               Vdc.acelerar();
                            }
                        break;
                        case 2:
                            Vdc.desaelerar();
                        break;
                        case 3:
                            Vdc.frenar();
                            break;
                        case 4:
                            System.out.println("\nVelocidad actual: "+Vdc.comprobarVelocidad()+" Kmh\n");
                            break;
                        case 5:
                            System.out.println(Vdc.girarDerecha());
                            break;
                        case 6:
                            System.out.println(Vdc.girarIzquierda());
                            break;

                        default:System.out.println("\nGAMER OVER\n");break; 
                        }
                    } 
                 
                break;
            case "Vp":
                 while(opcion != 7) {
                    System.out.println("\nIngrese opcion:\n");
                    System.out.print("1.-Acelerar \n2.-Desaelerar \n3.-Frenar \n4.-Comprobar velocidad\n5.-Girar a la derecha\n6.-girar a la izquierda\n7.-Salir \n");
                    opcion = sc.nextInt();
                    switch(opcion){
                        case 1:
                            if(Vp.velocidad<Vp.velocidadMax){
                                Vp.acelerar();
                            }
                            break;
                        case 2:
                            Vp.desaelerar();
                            break;
                        case 3:
                            Vp.frenar();
                            break;
                        case 4:
                            System.out.println("\nVelocidad actual: "+Vp.comprobarVelocidad()+" Kmh\n");
                            break;
                        case 5:
                            System.out.println(Vp.girarDerecha());
                            break;
                        case 6:
                            System.out.println(Vp.girarIzquierda());
                            break;

                        default:System.out.println("\nGAMER OVER\n");break; 
                        }
                    } 
                 
                break;
            default:
                break;
         }
        
       
    }
}
