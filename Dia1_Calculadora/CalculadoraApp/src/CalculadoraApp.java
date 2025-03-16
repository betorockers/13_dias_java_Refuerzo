import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        // agregarmos un objeto del tipo consola donde pediremos al usuario que ingrese un numero
        Scanner cs = new Scanner(System.in);

        // aca agregaremos un bloque while, para que se ejecute mientras el usuario ingrese opciones distintas a 5
        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            // en esta seccion mostraremos el menu
            mostrarMenu();
            // agregaremos un bloque try para nanejar los errores y las excepciones que ocurran
            try {
                // agregaremos la seleccion del usuaario
                var operacion = Integer.parseInt(cs.nextLine());

                // revisaremos que este dentro de las opciones seleccionadas
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, cs);
                } else if (operacion == 5) {// Salir
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // imprimimos un salto de linea antes de repetir el ciclo
                System.out.println();
            } // fin de try
            catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }// fin de while
    }// fin de main

    // mejoraremos nuestro codigo separandolo en funciones

    // agregaremos un nuevo metodo (declararemos un funcion provada)
    private static void mostrarMenu() {
        // menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.print("Elige una operacióna realizar: ");
    }

    private static void ejecutarOperacion(int operacion, Scanner cs) {
        // definimos las 2 variables
        System.out.print("Proporciona valor operando1: ");
        var operando1 = Double.parseDouble(cs.nextLine());
        System.out.print("Proporciona valor operando2: ");
        var operando2 = Double.parseDouble(cs.nextLine());
        // definiremos una variable para nuestro resultado
        double resultado;
        //Armaremos la estructura switch
        switch (operacion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado de la Suma es: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la Resta es: " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado de la Multiplicacion es: " + resultado);
            }
            case 4 -> { // Division
                resultado = operando1 / operando2;
                System.out.println("Resultado de la Division es: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }

}// fin de clase
