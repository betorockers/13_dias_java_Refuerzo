package mundopc.modelo;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    // agregamos un contructor vacio con argumentos
    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton= " + idRaton +
                "} " + super.toString();
    }
}
