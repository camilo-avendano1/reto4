package reto4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Reto4 {

    public static void main(String[] args) {
        int opcion = 19;
        utileria tool = new utileria();
        ArrayList<vehiculo> registrados = new ArrayList();
        ArrayList<persona> clientes = new ArrayList();
        ArrayList<seguros> soat = new ArrayList();
        
        while (opcion != 0) {
            //menú principal
            opcion = tool.ingresoInt("\n\n!!!BIENVENIDO!!!!!!\n\n\n"
                    + "INGRESE UNA OPCIÓN DEL MENÚ:\n\n"
                    + "1) REGISTRAR NUEVO CARRO.\n"
                    + "2) REGISTRAR NUEVA BICICLETA.\n"
                    + "3) MOSTRAR CARROS DISPONIBLES PARA RENTAR.\n"
                    + "4) MOSTRAR BICICLETAS DISPONIBLES PARA RENTAR. \n"
                    + "5) CONSULTAR VEHICULO.\n"
                    + "6) ALQUILAR VEHICULO.\n"
                    + "7) DEVOLVER VEHICULO.\n"
                    + "8) ASIGNAR SEGURO.\n"
                    + "9) CONSULTAR SEGURO. \n"
                    + "10) CONSULTAR ANTIGUEDAD\n"
                    + "0) SALIR\n");
            //METODO PARA INGRESAR VEHICULO
            if (opcion == 1) {
                auto carro = new auto();
                carro.register();
                carro.setRegistro(registrados.size());
                registrados.add(carro);

                System.out.println("El carro fue registrado exitosamente. :)");
               
            }
            //METODO PARA INGRESAR UNA NUEVA BICICLETA 
            if (opcion == 2) {
                bicicleta bici = new bicicleta();
                bici.register();
                bici.setRegistro(registrados.size());
                registrados.add(bici);
                System.out.println("La bicicleta fue registrada exitosamente. :)");
            }
            //METODO PARA CONOCER LOS CARROS DISPONIBLES PARA ALQUILAR
            if (opcion == 3) {
                System.out.println("ESTOS SON LOS CARROS ACTUALMENTE DISPONIBLES PARA SER RENTADOS.\n");
                tool.mostrarAutosDisponibles(registrados);
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
            //METODO PARA CONOCER LAS BICIS DISPONIBLES PARA ALQUILAR
            if (opcion == 4) {
                System.out.println("ESTAS SON LAS BICICLETAS ACTUALMENTE DISPONIBLES PARA SER RENTADAS.\n");
                tool.mostrarBicisDisponibles(registrados);
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
            //METODO PARA CONSULTAR LA INFORMACION DE ALGUN VEHICULO
            if (opcion == 5) {
                tool.mostrarTodo(registrados);
                System.out.println(registrados.get(tool.ingresoInt("INGRESE EL NÚMERO DEL REGISTRO DEL VEHICULO QUE DESEA CONOCER(NÚMERO QUE APARECE EN [] :")).toString());
            }
            //METODO PARA ALQUILAR
            if (opcion == 6) {
                alquiler alquilados = new alquiler();
                tool.mostrarTodo(registrados);
                alquilados.alquilar(registrados.get(tool.ingresoInt("ESCRIBA EL REGISTRO DEL VEHICULO QUE DESEA ALQUILAR")), clientes); //almacene al cliente en el arraylist de clientes 

            }
            //METODO PARA DEVOLVER EL VEHICULO
            if (opcion == 7) {
                alquiler alquilados = new alquiler();
                alquilados.devolver(clientes, tool.ingresoInt("INGRESE SU NUMERO DE IDENTIFICACIÓN: "), registrados);
                
            }
            //METODO PARA REGISTRAR LOS SEGUROS 
            if (opcion == 8) {
                tool.mostrarTodo(registrados);
                long select = tool.ingresoLong("INGRESE EL [NÚMERO DEL REGISTRO] DEL VEHICULO AL QUE LE DESEA REGISTRAR UN SEGURO: ");
                seguros seguro = new seguros(tool.ingresoInt("INGRESE EL AÑO DE COMPRA DEL SEGURO: "),tool.ingresoInt("INGRESE EL MES DE COMPRA DEL SEGURO(EN FORMATO NUMERICO 1-12): "), tool.ingresoInt("INGRESE EL DIA DE COMPRA DEL SEGURO: "),tool.ingresoInt("INGRESE EL AÑO DE VENCIMIENTO DEL SEGURO: "),tool.ingresoInt("INGRESE EL MES DE VENCIMIENTO DEL SEGURO(FORMATO NUMERICO 1-12): "),tool.ingresoInt("INGRESE EL DIA DE VENCIMIENTO DEL SEGURO: "), tool.ingresoString("INGRESE EL NOMBRE DE LA EMPRESA ASEGURADORA: "), tool.ingresoString("INGRESE LA COBERTURA DEL SEGURO: "), select);
                soat.add(seguro);
                System.out.println("El seguro se ha registrado exitosamente.");
            }
            //METODO PARA CONSULTAR UN SEGURO
            if(opcion ==9) {
                seguros seguro = new seguros();
                tool.mostrarTodo(registrados);
                long select = tool.ingresoLong("INGRESE EL [NÚMERO DEL REGISTRO] DEL VEHICULO AL QUE LE DESEA CONOCER EL ESTADO DEL SEGURO:  ");
                seguro.consulta(soat, select);
            }
            //METODO PARA CONSULTAR LA ANTIGUEDAD DE UN VEHICULO
            if (opcion == 10){
                tool.mostrarTodo(registrados);
                registrados.get(tool.ingresoInt("INGRESE EL [NÚMERO DEL REGISTRO] DEL VEHICULO AL QUE LE DESEA CONOCER LA ANTIGUEDAD")).consultarAntiguedad();
            }

        }
    }
}
