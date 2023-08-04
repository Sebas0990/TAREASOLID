package main;

import logica.CarroService;
import modelo.Audi;
import modelo.Carro;
import modelo.Renault;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Renault(18000),
                new Audi(25000)
        };
        Carro.imprimirPrecioMedioCoche(arrayCoches);

        //Guardar carro en la BD.
        CarroService service = new CarroService();
        service.guardarCocheDB(new Renault(25000));

    }
}
