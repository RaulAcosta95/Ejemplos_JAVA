/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ScopeVariables;

/**
 *
 * @author XMX3649
 */
public class ScopeVariables {
    int variableLocal = 0; //Scope local
    public int variableGlobal = 0; //Scope Local igual... public no es para eso
    
    public void metodoClase(){
        //Puede usar variableLocal y variableGlobal
        System.out.println(variableLocal);
        System.out.println(variableGlobal);
        
        //Variable con scope en este método
        int variableLocalClase = 0;
    }
    public void otroMetodoClase(){
        //NO puede usar variableLocalClase porque tiene scope en ese método
        //System.out.println(variableLocalClase);
    }
}

