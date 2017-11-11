/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author BVB09
 */
public class Trabajador extends Persona {
    private double costo_seguro;
    private double horas_trabajadas;
    private double costo_por_hora;
    private double sueldo;

    public Trabajador(String nombre, String apellido, int edad, String ci, double costo_seguro, double n, double c) {
        super(nombre, apellido, edad, ci);
        this.costo_seguro = costo_seguro;
        this.horas_trabajadas = n;
        this.costo_por_hora = c;
        
        sueldo();
    }

    public double getCosto_seguro() {
        return costo_seguro;
    }

    public void setCosto_seguro(double n) {
        this.costo_seguro = n;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(double n) {
        this.horas_trabajadas = n;
    }

    public double getCosto_por_hora() {
        return costo_por_hora;
    }

    public void setCosto_por_hora(double n) {
        this.costo_por_hora = n;
    }

    public double getSueldo() {
        return sueldo;
    }
     public void sueldo(){
         this.sueldo=((horas_trabajadas * costo_por_hora)+ costo_seguro);
    }
    @Override
    public String toString(){
        return String.format("%s\n"
                + "Seguro: $%.2f\n"
                + "Horas Trabajadas: %.2f\n"
                + "Valor por hora: $%.2f\n"
                + "Sueldo: $%.2f\n", super.toString(),getCosto_seguro(),getHoras_trabajadas(),getCosto_por_hora(),getSueldo());
    }
}
