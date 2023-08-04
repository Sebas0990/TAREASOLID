package modelo;

public abstract class Carro {

    public String marca;

    abstract String getMarcaCoche();
    abstract int getPrecioCoche();

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            System.out.println(carro.getPrecioCoche());
        }
    }
}
