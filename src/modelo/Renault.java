package modelo;

public class Renault extends Carro{

    public int precio;
    public String marca = this.getClass().getSimpleName();
    
    public Renault(int precio) {
        
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    
    
}
