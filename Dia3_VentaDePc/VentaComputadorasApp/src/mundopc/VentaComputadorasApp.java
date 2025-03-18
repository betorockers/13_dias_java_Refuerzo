package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Crearemos los objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);

        // creamos un objeto de tipo Computdora
        Computadora computadoraLenovo =
                new Computadora("Lenovo",
                        monitorLenovo,
                        tecladoLenovo,
                        ratonLenovo);
        //System.out.println(computadoraLenovo);

        // creamos otro objeto computadora
        Monitor monitorDell = new Monitor("Dell", 17);
        Teclado tecladoDell = new Teclado("Usb", "Dell");
        Raton ratonDell = new Raton("Usb", "Dell");
        Computadora computadoraDell = new Computadora("Dell",
                monitorDell, tecladoDell, ratonDell);

        // Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac, tecladoMac,ratonMac);


        // creamos la primera orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();


        // creamos la segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}

