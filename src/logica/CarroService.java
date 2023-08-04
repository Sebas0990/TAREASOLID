package logica;

import modelo.Carro;

public class CarroService {

    private IDatos datos;

    public CarroService(IDatos datos) {
        this.datos = datos;
    }
    public void guardarCocheDB(Carro carro) {
        System.out.println("Guarde en BD");
        datos.guardarDB();
    }
    
}
