/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author angelr.acosta
 */
public class OperadorTernario {

    public static void main(String[] args) {
        System.out.println("Una forma de asignar variables con funciones");

        OperadorTernario operador = new OperadorTernario();
        String resultado = operador.resultado();
        System.out.println("Resultado: " + resultado);
        
        //Ahora si Operador Ternario
        String resultadoOT = ( 3 > 2 )? "Verdadero" : "Falso" ;
        System.out.println("Operador Ternario Resultado: " + resultadoOT);
        
        //Operador ternario tiene que regresar algo, no sirve para ejecutar funciones void
        //( 3 > 2 )? operador.funcionOperadorTernarioTrue() : "";
        var algo = ( 3 > 2 )? operador.resultado() : "Es False";
        
        System.out.println("algo = " + algo);
    }

    public String resultado() {
        return "hola";
    }
    public void funcionOperadorTernarioTrue(){
        System.out.println("funcionOperadorTernarioTrue");
    }
        public void funcionOperadorTernarioFalse(){
            System.out.println("funcionOperadorTernarioFalse");
    }
}
