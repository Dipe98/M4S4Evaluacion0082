import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear auto");
            System.out.println("2. Encender auto");
            System.out.println("3. Apagar auto");
            System.out.println("4. Acelerar auto");
            System.out.println("5. Mostrar información del auto");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el color: ");
                    String color = scanner.nextLine();
                    System.out.print("Ingrese la velocidad máxima: ");
                    int velocidadMaxima = scanner.nextInt();
                    auto = new Auto(marca, modelo, color, velocidadMaxima);
                    System.out.println("Auto creado exitosamente.");
                    break;
                case 2:
                    if (auto != null) auto.encender();
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 3:
                    if (auto != null) auto.apagar();
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 4:
                    if (auto != null) auto.acelerar();
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 5:
                    if (auto != null) System.out.println(auto);
                    else System.out.println("Primero debe crear un auto.");
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}