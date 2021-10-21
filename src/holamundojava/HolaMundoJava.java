/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundojava;

import java.util.Scanner;

/**
 *
 * @author angelr.acosta
 */
public class HolaMundoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona una calificación del 0 al 10:");
        int calificacion = Integer.parseInt(consola.nextLine());
        
        switch(calificacion){
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificación no valida");
        }

        if(calificacion == 10 || calificacion == 9){
            System.out.println("A");
        } else if ( calificacion == 8) {
            System.out.println("B");
        } else if ( calificacion == 7) {
            System.out.println("C");
        } else if ( calificacion == 6){
            System.out.println("D");
        } else if ( calificacion <=5 && calificacion >= 0){
            System.out.println("F");
        } else {
            System.out.println("Calificación no valida");
        }
        
    }

}
