import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        // Empezamos con el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try {
                // mandaremos a llamar la funciona ejecutarOperacion
                salir = ejecutarOperacion(sc, personas);
            }catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }
    }
    private static void mostrarMenu(){
        // Mostramos las opciones
        System.out.print("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);

        System.out.print("Seleccion una opcion del Menú: ");
    }

    private static boolean ejecutarOperacion(Scanner sc, List<Persona> personas){
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;
        // Revisaremos la opcion proporcionada
        switch(opcion){
            case 1 -> { //Agregar persona a la lista
                System.out.print("Proporciona el Nombre: ");
                var nombre = sc.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = sc.nextLine();
                System.out.print("Proporciona el email: ");
                var email = sc.nextLine();

                // creamos el objeto del tipo persona
                var persona = new Persona(nombre, tel, email);
                // lo agregamos a la lista personas
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }// fin caso 1
            case 2 -> {// listar las personas
                System.out.println("Listado de Personas: ");
                // agregaremos un amejora utilizando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona)); // lambda
                personas.forEach(System.out::println); // por referencia
            }
            case 3 -> {// Salimos del ciclo
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }// fin switch
        return  salir;
    }
}
