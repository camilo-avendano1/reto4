package reto4;

public class auto extends vehiculo {

    String placa;

    public auto() {
        this.placa = " ";
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
@Override
    public void register() {
        this.placa = tool.ingresoString("Ingrese la placa del carro: ");
        super.register();
        
        
    }
    @Override
    public String toString(){
    return super.toString() + "placa: " + getPlaca() ;
    
    }
    
}
