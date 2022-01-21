package reto4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class vehiculo {

    String descripcion, tipo, modelo;
    int año;
    long precioHora, registro;
    boolean disponible;
    utileria tool = new utileria();
    Scanner escaner = new Scanner(System.in);
    int indice = 0;
    persona cliente = new persona();
 
    
    public vehiculo() { //constructor vacio
        descripcion = " ";
        tipo = " ";
        modelo = " ";
        año = 0;
        precioHora = 0;
        registro = -1;
        disponible = false;

        
    }

    public void register() {
        this.descripcion = tool.ingresoString("Ingrese la descripción del vehiculo.");
        this.tipo = tool.ingresoString("El vehiculo ¿es bicicleta o carro?");
        this.modelo = tool.ingresoString("Ingrese la marca del vehiculo seguido del modelo.");
        this.año = tool.ingresoInt("Ingrese el año del vehiculo.");
        this.precioHora = tool.ingresoLong("Ingrese el precio por hora de rentar este vehiculo (sin comas ni sufijo ni simbolos de precio)");
        this.disponible = true;

    }

    public void consultarAntiguedad() {
        LocalDateTime añoA = LocalDateTime.now();
        if (añoA.getYear()-this.año <= 1){
            System.out.println("ESTE VEHICULO ES NUEVO.");
    }
        if(añoA.getYear() - this.año < 5 && añoA.getYear() - this.año >1){
            System.out.println("ESTE VEHICULO ES MEDIANAMENTE USADO.");
            }
        if(añoA.getYear() - this.año>=5){
        System.out.println("ESTE VEHICULO ES USADO..");
        }
    }


    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public long getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(long precioHora) {
        this.precioHora = precioHora;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "\n" + "descripcion: " + descripcion + "\ntipo: " + tipo + "\nmodelo: " + modelo + "\naño: " + año + "\nprecioHora: " + precioHora + "\nregistro: " + registro + "\nestado:" + disponible + "\n";
    }

}
