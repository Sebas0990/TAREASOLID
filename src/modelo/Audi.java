package modelo;

public class Audi extends Carro{

    public int precio;
    public String marca = this.getClass().getSimpleName();

    public Audi(int precio) {
        
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
