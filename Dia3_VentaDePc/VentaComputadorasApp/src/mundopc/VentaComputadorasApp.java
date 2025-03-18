package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Crearemos los objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);

        // creamos un objeto de tipo Computdora
        Computadora compuatdoraLenovo =
                new Computadora("Computadora Lenovo",
                        monitorLenovo,
                        tecladoLenovo,
                        ratonLenovo);
        System.out.println(compuatdoraLenovo);
    }
}

