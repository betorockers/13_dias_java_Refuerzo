package dominio;

import java.util.Objects;

public class Pelicula {
    private String nombre;
    //definimos un constructor vacio
    public Pelicula(){}

    // definimos un constructor con argumentos
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    // generamos los getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // agregamos toString y hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(nombre, pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return nombre != null ? nombre.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    // prueba para comprobara que funciona nuestra clase

    /*public static void main(String[] args) {
        var pelicula1 = new Pelicula("He-Man");
        var pelicula2 = new Pelicula("Batman");
        System.out.println(pelicula1);
        System.out.println(pelicula2);
    } */
}
