package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas{

    private final List<Pelicula> peliculas;

    // agregamos constructor vacio para inicializar la lista de peliculas
    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de Peliculas...");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la pelicula: " + pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        // Regresamos el indice de la pelicula encontrada en la lista
        var indice = peliculas.indexOf(pelicula);
        if (indice == -1)
            System.out.println("No se encontro la pelicula: " + pelicula);
        else
            System.out.println("pelicula encontrada en el indice: " + indice);

    }

    public static void main(String[] args) {
        // crearemos objetos del tipo pelicula
        var pelicula1 = new Pelicula("WonderWoman");
        var pelicula2 = new Pelicula("SuperGirl");
        //Creamos nuestro objeto de sevicio(Patron de diseño service)
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        // agregamos las peliculas a la lista
        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);
        // listamos las peliculas
        servicioPeliculas.listarPeliculas();
        //Buscamos una pelicula
        // Se debe implementar el metodo equals y hashCode
        servicioPeliculas.buscarPelicula(new Pelicula("SuperGirl"));

    }
}
