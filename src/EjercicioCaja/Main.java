/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCaja;

/**
 *
 * @author XMX3649
 */
public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.alto = 2;
        caja1.ancho = 3;
        caja1.profundo = 6;
        System.out.println("Volumen Caja1: " + caja1.volumen());
        
        Caja caja2 = new Caja(23,53,12);
        System.out.println("Volumen Caja2: " + caja2.volumen());
    }
}
