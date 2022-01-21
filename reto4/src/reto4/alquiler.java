package reto4;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class alquiler {

    persona cliente = new persona();
    vehiculo movil;
    long registro;

    public alquiler() {
        cliente = new persona();
        registro = 0;
    }

    public void alquilar(vehiculo movil, ArrayList<persona> clientes) {
        utileria tool = new utileria();
        registro = movil.getRegistro();
        movil.disponible = false;
        cliente = new persona(tool.ingresoString("TIPO DE DOCUMENTO: "), tool.ingresoInt("DOCUMENTO: "), tool.ingresoString("INGRESE SU NOMBRE COMPLETO: "), tool.ingresoString("¿CUÁL ES EL MOTIVO POR EL CUAL DESEA ALQUILAR UNO DE NUESTROS VEHICULOS?"), LocalDateTime.now());
        clientes.add(cliente);
    }

    public void devolver(ArrayList<persona> clientes, int cedula, ArrayList<vehiculo> vehiculos) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).ID == cedula) {
                clientes.get(i).setSalida(LocalDateTime.now());
                registro = clientes.get(i).ID;
                int pago = ((int) vehiculos.get((int)registro).getPrecioHora() / 60) * minutos(clientes.get(i));
                System.out.print("USTED USO EL VEHICULO "+(minutos(clientes.get(i))/60) + "HORAS:");
                System.out.println("por favor cancele en caja: $" + pago);
                break;
            }
        }
        vehiculos.get((int) registro).setDisponible(true);
        cliente.desencolar(clientes, cedula);

    }

    public int minutos(persona cliente) {
        int auxDias;
        int auxHoras;
        int auxMinutos;
        int añoInicio = cliente.getIngreso().getYear();
        int diaInicio = cliente.getIngreso().getDayOfYear();
        int añoSalida = cliente.getSalida().getYear();
        int diaSalida = cliente.getSalida().getDayOfYear();
        int horaSalida = cliente.getSalida().getHour();
        int minutoSalida = cliente.getSalida().getMinute();

        if (añoInicio < añoSalida) {
            auxDias = diaSalida + 365 - diaInicio;
        } else {
            auxDias = diaSalida - diaInicio;
        }
        auxHoras = horaSalida + (auxDias * 24);
        auxMinutos = minutoSalida + (auxHoras * 60);
        return (auxMinutos);
    }
}
