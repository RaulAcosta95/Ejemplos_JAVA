/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aritmetica.operaciones;

/**
 *
 * @author XMX3649
 */
public class Main {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1.a Antes de ser asignado: " + aritmetica1.a);
        aritmetica1.a = 5;
        aritmetica1.b = 10;
        System.out.println("aritmetica1.a: " + aritmetica1.a);
        System.out.println("aritmetica1.b: " + aritmetica1.b);

        aritmetica1.sumar();
        System.out.println("Suma con retorno: " + aritmetica1.sumarConRetorno());
        System.out.println("Suma con parametros: " + aritmetica1.sumarConParametros(10, 32));
        System.out.println("Suma que Altera Atributos Y Usa Metodo Interno: " + aritmetica1.sumarAlteraAtributosYUsaMetodoInterno(4, 12));
        System.out.println("aritmetica1.a: " + aritmetica1.a);
        System.out.println("aritmetica1.b: " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(10,15);
        System.out.println("aritmetica2.a: " + aritmetica2.a);
    }
}
