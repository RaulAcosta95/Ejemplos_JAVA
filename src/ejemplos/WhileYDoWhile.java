/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author angelr.acosta
 */
public class WhileYDoWhile {

    public static void main(String[] args) {
        int contador = 0;

        while (contador < 3) { //Mientras sea true
            System.out.println("While");
            contador++;
        }

        System.out.println(contador);

        do {//Primera vez ejecuta
            System.out.println("Do While");
            contador--;
        } while (contador > 0);//Vuelve a ejecutar mientras sea true

        System.out.println(contador);

        
    }
}
