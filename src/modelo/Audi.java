package modelo;

public class Audi extends Carro{

    public int precio;
    public String marca = this.getClass().getSimpleName();
    
    public Audi(String marca, int precio) {
        super(marca);
        this.precio = precio;
    }
    
}
