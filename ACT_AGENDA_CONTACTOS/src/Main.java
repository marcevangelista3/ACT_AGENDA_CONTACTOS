import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        System.out.println("=== AGENDA DE CONTACTOS ===");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");

        int opcion = scanner.nextInt();

        // Condicional para manejar la opción seleccionada (Paso 2)
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción: Añadir contacto");
                break;
            case 2:
                System.out.println("Has seleccionado la opción: Mostrar contactos");
                break;
            case 3:
                System.out.println("Has seleccionado la opción: Buscar contacto");
                break;
            case 4:
                System.out.println("Has seleccionado la opción: Salir. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Introduce un número entre 1 y 4.");
                break;
        }

        scanner.close();
    }
}
