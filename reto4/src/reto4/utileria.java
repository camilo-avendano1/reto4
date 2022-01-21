package reto4;

import java.util.ArrayList;
import java.util.Scanner;

public class utileria {

    Scanner escaner = new Scanner(System.in);

    public void mostrarAutosDisponibles(ArrayList<vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).tipo.equalsIgnoreCase("carro") && lista.get(i).disponible) {
                System.out.println(i + ") " + lista.get(i).modelo + " " + lista.get(i).año + " " + "[" + lista.get(i).registro + "]");
            }

        }

    }

    public void mostrarBicisDisponibles(ArrayList<vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).tipo.equalsIgnoreCase("bicicleta") && lista.get(i).disponible) {
                System.out.println(i + ") " + lista.get(i).modelo + " " + lista.get(i).año + " " + "[" + lista.get(i).registro + "]\n");
            }

        }

    }

    public void mostrarTodo(ArrayList<vehiculo> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ") " + lista.get(i).modelo + " " + lista.get(i).año + " " + "[" + lista.get(i).registro + "]");
        }
    }

    public String ingresoString(String text) {
        System.out.println(text);
        return (escaner.next());
    }

    public int ingresoInt(String text) {
        System.out.println(text);
        return (escaner.nextInt());
    }

    public long ingresoLong(String text) {
        System.out.println(text);
        return (escaner.nextLong());
    }

}
