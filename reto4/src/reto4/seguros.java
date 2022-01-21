package reto4;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class seguros {

    int añoCompra;
    int mesCompra;
    int diaCompra;
    int añoVence;
    int mesVence;
    int diaVence;
    LocalDateTime fecha1;
    LocalDateTime fecha2;
    String empresa;
    String descripSeguro;
    long vehiculos;

    public seguros() {
        this.añoCompra = 0;
        this.añoVence = 0;
        this.diaCompra = 0;
        this.diaVence = 0;
        this.fecha1 = LocalDateTime.MIN;
        this.fecha2 = LocalDateTime.MAX;
        this.mesCompra = 0;
        this.mesVence = 0;
        this.empresa = "no tiene ";
        this.descripSeguro = " no hay";
        this.vehiculos = -1;
    }

    public seguros(int añoCompra, int mesCompra, int diaCompra, int añoVence, int mesVence, int diaVence, String empresa, String descripSeguro, long vehiculo) {
        this.fecha1 = LocalDateTime.of(añoCompra, mesCompra, diaCompra, 0, 0);
        this.fecha2 = LocalDateTime.of(añoVence, mesVence, diaVence, 23, 59);
        this.añoCompra = añoCompra;
        this.mesCompra = mesCompra;
        this.diaCompra = diaCompra;
        this.añoVence = añoVence;
        this.mesVence = mesVence;
        this.diaVence = diaVence;
        this.empresa = empresa;
        this.descripSeguro = descripSeguro;
        this.vehiculos = vehiculo;
    }

    public void vencimiento(LocalDateTime fechaHoy) {
        fechaHoy = LocalDateTime.now();
        int aux = 0;
        int diferencia = this.añoVence - fechaHoy.getYear();
        if (diferencia <= 1) {
            if (this.añoVence != fechaHoy.getYear()) {
                aux = (fecha2.getDayOfYear() + 365) - fechaHoy.getDayOfYear();
                System.out.println("EL SEGURO DE ESTE VEHICULO CUENTA CON LOS SIGUIENTES DIAS VIGENTES: " + aux);
            } else {
                aux = fecha2.getDayOfYear() - fechaHoy.getDayOfYear();
                System.out.println("EL SEGURO DE ESTE VEHICULO CUENTA CON LOS SIGUIENTES DIAS VIGENTES: " + aux);
            }
        } else {System.out.println("ESTE VEHICULO NO TIENE SEGURO O AUN NO HA SIDO REGISTRADO SU SEGURO.");}
    }

    public void consulta(ArrayList<seguros> soat, long select) {
        for (int i = 0; i < soat.size(); i++) {
            if (soat.get(i).vehiculos == select) {
                vencimiento(LocalDateTime.now());
            }
        }
    }

    public int getAñoCompra() {
        return añoCompra;
    }

    public void setAñoCompra(int añoCompra) {
        this.añoCompra = añoCompra;
    }

    public int getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(int mesCompra) {
        this.mesCompra = mesCompra;
    }

    public int getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(int diaCompra) {
        this.diaCompra = diaCompra;
    }

    public int getAñoVence() {
        return añoVence;
    }

    public void setAñoVence(int añoVence) {
        this.añoVence = añoVence;
    }

    public int getMesVence() {
        return mesVence;
    }

    public void setMesVence(int mesVence) {
        this.mesVence = mesVence;
    }

    public int getDiaVence() {
        return diaVence;
    }

    public void setDiaVence(int diaVence) {
        this.diaVence = diaVence;
    }

    public LocalDateTime getFecha1() {
        return fecha1;
    }

    public void setFecha1(LocalDateTime fecha1) {
        this.fecha1 = fecha1;
    }

    public LocalDateTime getFecha2() {
        return fecha2;
    }

    public void setFecha2(LocalDateTime fecha2) {
        this.fecha2 = fecha2;
    }

}
