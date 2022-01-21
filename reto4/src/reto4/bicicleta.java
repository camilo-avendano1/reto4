package reto4;

public class bicicleta extends vehiculo {

    String proposito;  //montaña, carrera o sencilla.

    public bicicleta() {
        this.proposito = "NO ESPECIFICA ";
    }

    @Override
    public void register() {
        this.proposito = tool.ingresoString("¿La bicicleta es de montaña, carrera o sencilla?: ");
        super.register();
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    @Override
    public String toString() {
        return super.toString() + "Proposito: " + getProposito();
    }
}
