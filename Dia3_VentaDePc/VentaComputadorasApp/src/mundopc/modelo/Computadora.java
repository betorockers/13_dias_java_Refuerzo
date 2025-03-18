package mundopc.modelo;

public class Computadora {
    private int idComputadora;
    private String nombre;
    // relacionamos con la clase monitor, teclado y raton
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;

    // constructor vacio y privado
    private Computadora(){
        idComputadora = ++contadorComputadoras;
    }

    // constructor publico para relacion con los atributos
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); // llamamos al constructor provado
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{\n" +
                "   idComputadora=" + idComputadora +
                ",  nombre= '" + nombre + '\'' +
                ", \n   monitor= " + monitor +
                ", \n   teclado= " + teclado +
                ", \n   raton= " + raton +
                '}';
    }
}
