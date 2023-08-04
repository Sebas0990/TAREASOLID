package modelo;

public class Audi extends Carro{

    private int precio;
    private String marca = this.getClass().getSimpleName();

    public Audi(int precio) {
        
        this.precio = precio;
    }
    @Override
    public int getPrecioCoche() {
        return precio;
    }
    @Override
    public String getMarcaCoche(){
        return marca;
    }
    
    
}
