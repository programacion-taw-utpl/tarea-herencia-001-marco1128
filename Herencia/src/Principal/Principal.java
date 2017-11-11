/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import laempresa.EmpresaPrivada;
import personal.Trabajador;

/**
 *
 * @author BVB09
 */
public class Principal {
    public static void main(String[] args) {
         Trabajador[] trabajador= new Trabajador[2];
        //arreglo para el constructor
        
        trabajador[0]=new Trabajador("Ana Luisa","Velez Alcivar",30 ,"12903939",100,40,10);
        trabajador[1]=new Trabajador("Mario Anibal","Vela Narvaez",35 ,"212889",100,50,10);
        
            
        EmpresaPrivada ep1= new EmpresaPrivada("Soluciones Software","SS's","Loja",200000,12,trabajador);
        
        System.out.println(ep1);
    }
    
}
