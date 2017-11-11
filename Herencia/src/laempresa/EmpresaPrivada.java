/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author BVB09
 */
public class EmpresaPrivada extends Empresa {
     private double ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String nombre, String siglas, String ciudad, double ventas, int sucursales, Trabajador[] trabajador) {
      super(nombre, siglas,ciudad, trabajador); 
      this.ventas_mensual_fijo= ventas;
      this.numero_sucursales= sucursales;
    }

    public double getVentas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void setVentas_mensual_fijo(double n) {
        this.ventas_mensual_fijo = n;
    }

    public int getNumero_sucursales() {
        return numero_sucursales;
    }

    public void setNumero_sucursales(int n) {
        this.numero_sucursales = n;
    }
@Override
    public String toString(){
        String cadena="";
        for (int i=0; i< trabajador.length;i++) {
            cadena+=  trabajador[i].toString() + "\n";
        }   
        
        return String.format("%s\n"
                + "Ventas: $ %.2f\n"
                + "Sucursales: %d\n"
                + "Lista de Trabajadores:\n\n"
                + "%s\n",super.toString(),getVentas_mensual_fijo(),getNumero_sucursales(),cadena);
    }
}
