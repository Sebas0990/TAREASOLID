package main;

import bd.DatabaseMysql;
import logica.CarroService;
import modelo.Audi;
import modelo.Carro;
import modelo.Renault;

public class Main {
    public static void main(String[] args) {
        //Agile significa rapido :)
        Carro[] arrayCoches = {
                new Renault(18000),
                new Audi(25000)
        };
        Carro.imprimirPrecioMedioCoche(arrayCoches);

        CarroService service = new CarroService(new DatabaseMysql());
        service.guardarCocheDB(new Renault(25000));

    }
}
