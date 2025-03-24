package presentacion;

import dominio.Pelicula;
import servicio.IServicioPeliculas;
import servicio.ServicioPeliculasArchivo;
//import servicio.ServicioPeliculasLista;

import java.util.Scanner;

public class CatalogoPeliculasApp {
    public static void main(String[] args) {
        // comenzamos a definir el menu
        var salir = false;
        var cs = new Scanner(System.in);
        //Agregamos la implementacion del servicio
       // IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();
        while(!salir){
            try{
                mostrarMenu();
                salir =  ejecutarOpciones(cs, servicioPeliculas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();// para separar las impresiones del menu
        }// fin del while
    }
    // definimos el metodo mostrar menu
    private static void mostrarMenu(){
        System.out.print("""
                *** Catalogo de peliculas ***
                1. Agregar pelicula
                2. Listar peliculas
                3. Buscar peliculas
                4. Salir
                Elige una opcion:
                """);
    }
    // definimos el metodo ejecutarOpciones
    private static boolean ejecutarOpciones(Scanner cs, IServicioPeliculas servicioPeliculas){
        var opcion = Integer.parseInt(cs.nextLine());
        var salir = false;
        switch(opcion){
            case 1 -> {
                System.out.println("Introduce el nombre de la pelicula: ");
                var nombrePelicula = cs.nextLine();
                servicioPeliculas.agregarPelicula(new Pelicula(nombrePelicula));
            }
            case 2 -> servicioPeliculas.listarPeliculas();
            case 3 -> {
                System.out.println("Introduce la pelicula a buscar: ");
                var buscar = cs.nextLine();
                servicioPeliculas.buscarPelicula(new Pelicula(buscar));
            }
            case 4 ->{
                System.out.println("Hasta pronto!!!");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida; " + opcion);
        }

        return salir;
    }
}