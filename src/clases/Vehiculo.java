/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jokerman
 */
public class Vehiculo {
    public String marca;
    public String modelo;
    public String color;
    public int numPuertas;
    public String año;
    public String capacidadMotor;
    public String capacidadHp;
    public int velocidad;
    public int velocidadMax;
    public String patente;
    
  
    public void vehiculo(){
         this.marca = "";
         this.modelo = "";
         this.color = "";
         this.numPuertas = 0;
         this.año = "";
         this.capacidadMotor="";
         this.capacidadHp ="";
         this.velocidad = 0;
         this.velocidadMax=0;
         this.patente="";
    } 
    public void acelerar(){
        this.velocidad = this.velocidad + 5; 
    }
    public void desaelerar(){
        this.velocidad = this.velocidad - 5;
    }
    public void frenar(){
        this.velocidad = 0;
    }
    public String girarIzquierda(){
        return "\nVehiculo giro a la izquierda\n"; 
    }
    public String girarDerecha(){
        return "\nVehiculo giro a la derecha\n";
    }
    public int comprobarVelocidad(){
        return this.velocidad;
    }
}
