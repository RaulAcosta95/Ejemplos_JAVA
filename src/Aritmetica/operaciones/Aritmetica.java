/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmetica.operaciones;

/**
 *
 * @author XMX3649
 */
public class Aritmetica {

    int a;
    int b;

    //SOBRECARGA DE CONSTRUCTORES
    public Aritmetica() {
        System.out.println("Constructor sin argumentos");
    }

    public Aritmetica(int a, int b) {
        System.out.println("Constructor con argumentos");
        this.a = a;
        this.b = b;
    }

    //Método sin retorno
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado metodo void = " + resultado);
    }

    //Método con retorno
    public int sumarConRetorno() {
        return a + b;
    }

    //Método con parámetros
    public int sumarConParametros(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }

    //Método que altera los parámetros y retorna el resultado de un método interno
    public int sumarAlteraAtributosYUsaMetodoInterno(int parametro1, int parametro2) {
        a = parametro1;
        b = parametro2;

        return sumarConRetorno(); //Devuelve lo que devuelva dentro
    }
}
