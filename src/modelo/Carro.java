package modelo;

public abstract class Carro {

    public String marca;

    abstract String getMarcaCoche();
    abstract int getPrecioCoche();

    void guardarCocheDB(Carro carro) {
        System.out.println("Guarde en BD");
    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            System.out.println(carro.getPrecioCoche());
        }
    }
}
