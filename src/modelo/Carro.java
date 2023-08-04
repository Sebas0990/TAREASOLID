package modelo;

public abstract class Carro {

    public String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    String getMarcaCoche() {
        return marca;
    }

    void guardarCocheDB(Carro carro) {
        System.out.println("Guarde en BD");
    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            if (carro.marca.equals("Renault")) {
                System.out.println(18000);
            }
            if (carro.marca.equals("Audi")) {
                System.out.println(25000);
            }
        }
    }
}
