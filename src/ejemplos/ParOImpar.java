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
public class ParOImpar {
    public static void main(String[] args) {
                Scanner consola = new Scanner(System.in);
                int numero = Integer.parseInt(consola.nextLine());
                
                if(numero % 2 == 0){
                    System.out.println(numero + " Es par");
                } else {
                    System.out.println(numero + " Es impar");
                }
                
    }
}
