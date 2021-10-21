/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author angelr.acosta
 */
public class BreakYContinue {

    public static void main(String[] args) {

        for (int contador2 = 0; contador2 < 3; contador2++) {
            if (contador2 % 2 != 0) {
                continue; //continúa en la siguiente iteración y ya no ejecuta el siguiente código
            }
            System.out.println("Pares: " + contador2);

        }

        for (int contador1 = 0; contador1 < 3; contador1++) {
            if (contador1 % 2 == 0) {
                System.out.println("Pares: " + contador1);
                break; //Termina el ciclo
            }
        }
    }
}
