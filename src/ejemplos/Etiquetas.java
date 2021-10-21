/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author angelr.acosta
 */
public class Etiquetas {

    public static void main(String[] args) {
        casifinal:
        System.out.println("Continua a partir de aquí");
        casifinal: //Algo así... de hecho ya no se usa
        for (int contador2 = 0; contador2 < 3; contador2++) {
            if (contador2 % 2 != 0) {
                continue casifinal; //continúa en la siguiente iteración y ya no ejecuta el siguiente código
            }
            System.out.println("Pares: " + contador2);

        }
        System.out.println("Esto no se ejecuta");

        System.out.println("Fin");
    }
}
