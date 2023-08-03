package logica;

import bd.DatabaseMysql;
import modelo.Carro;

public class CarroService {

    public void guardarCocheDB(Carro carro) {
        DatabaseMysql db = new DatabaseMysql();
        db.guardar();
    }
}
