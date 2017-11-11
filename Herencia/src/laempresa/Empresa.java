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
public class Empresa {
     private String nombre;
    private String siglas;
    private String ciudad;
    Trabajador trabajador[];

    public Empresa(String nombre, String siglas, String ciudad, Trabajador[] trabajador) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.ciudad = ciudad;
        this.trabajador = trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String n) {
        this.siglas = n;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String n) {
        this.ciudad = n;
    }

    public Trabajador[] getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador[] trabajador) {
        this.trabajador = trabajador;
    }
     @Override
    public String toString(){
        return String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s",getNombre(),getSiglas(),getCiudad());
    }
}
