package modelo;

public class Renault extends Carro{

    public int precio;
    public String marca = this.getClass().getSimpleName();
    
    public Renault(String marca, int precio) {
        super(marca);
        this.precio = precio;
    }

    
    
}
