package EncapsulamientoFolder.PruebaPersona;

import EncapsulamientoFolder.Encapsulamiento.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Angel", 14000.00, false);
        persona1.setNombre("Raul");
        
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getSueldo());
        
        //Diferentes formas de llamar a toString
        System.out.println(persona1.toString());
        System.out.println(persona1);
    }
}
