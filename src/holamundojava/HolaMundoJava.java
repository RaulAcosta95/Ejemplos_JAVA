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

        System.out.println("Proporciona el nombre:");
        String nombreLibro = consola.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        double precioLibro = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito (true)(false):");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombreLibro + " #" + id);
        System.out.println("Precio: $" + precioLibro);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }

}
