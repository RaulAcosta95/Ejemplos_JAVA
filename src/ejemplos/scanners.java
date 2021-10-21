
package ejemplos;

import java.util.Scanner;

public class scanners {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        var consola1 = new Scanner(System.in);
        String titulo,autor;
        System.out.println("Proporciona el titulo:");
        titulo = consola.nextLine();
        System.out.println("Proporciona el autor:");
        autor = consola.nextLine();
        System.out.println("<titulo>"+titulo+" fue escrito por "+autor+"</titulo>");
    }
}
