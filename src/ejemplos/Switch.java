/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author angelr.acosta
 */
public class Switch {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingtresa un número:");
        int numero = Integer.parseInt(consola.nextLine());
        switch (numero) {
            case 1:
                System.out.println("Número Uno");
                break;
            case 2:
                System.out.println("Número Dos");
                break;
            case 3:
                System.out.println("Número Tres");
                break;
            case 4:
                System.out.println("Número Cuatro");
                break;
            default:
                System.out.println("Caso no encontrado");
        }

        System.out.println("Ingtresa el número del mes:");
        int mes = Integer.parseInt(consola.nextLine());
        String estacion = "Estación desconocida";
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
        }
        System.out.println(estacion);
    }
}
