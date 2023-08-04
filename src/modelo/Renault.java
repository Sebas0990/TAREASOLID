package modelo;

public class Renault extends Carro{

    private int precio;
    private String marca = this.getClass().getSimpleName();
    
    public Renault(int precio) {
        
        this.precio = precio;
    }
    @Override
    public int getPrecioCoche() {
        return precio;
    }
    @Override
    public String getMarcaCoche() {
        return marca;
    }

    
    
}
