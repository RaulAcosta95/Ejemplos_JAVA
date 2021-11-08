/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCaja;

/**
 *
 * @author XMX3649
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("Se creó el objeto Caja sin asignarle valor a los parámetros");
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int volumen(){
        return this.ancho * this.alto * this.profundo;
    }
}
