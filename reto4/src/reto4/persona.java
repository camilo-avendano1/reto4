package reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class persona {

    String tipoID;
    int ID;
    String nombre;
    String intencion;
    LocalDateTime ingreso;
    LocalDateTime salida;
    long pago;

    public persona() {
        tipoID = " ";
        ID = 0;
        nombre = "NN";
        intencion = "NS/NR";
        ingreso = LocalDateTime.MIN;
        salida = LocalDateTime.MAX;
        pago = 0;
    }

    public persona(String tipoID, int ID, String nombre, String intencion, LocalDateTime ingreso) {
        this.ID = ID;
        this.tipoID = tipoID;
        this.nombre = nombre;
        this.intencion = intencion;
        this.ingreso = ingreso;

    }

    public void desencolar(ArrayList<persona> personas,int cedula) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).ID == cedula) {
                personas.remove(i);
            }

        }
        System.out.println("La persona buscada con el anterior número de documento no esta registrada");
    }

    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIntencion() {
        return intencion;
    }

    public void setIntencion(String intencion) {
        this.intencion = intencion;
    }

    public LocalDateTime getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDateTime ingreso) {
        this.ingreso = ingreso;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    public long getPago() {
        return pago;
    }

    public void setPago(long pago) {
        this.pago = pago;
    }

}
