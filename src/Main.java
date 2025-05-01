//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            TiendaMascotas tienda = new TiendaMascotas();
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n--- Menú de la Tienda de Mascotas Exóticas ---");
                System.out.println("1. Ver información de las especies disponibles");
                System.out.println("2. Vender mascota");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();  // limpiar buffer

                switch (opcion) {
                    case 1:
                        tienda.mostrarInformacion();
                        break;
                    case 2:
                        System.out.print("Ingrese el nombre de la especie: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la cantidad a vender: ");
                        int cantidad = scanner.nextInt();
                        tienda.venderMascota(nombre, cantidad);
                        break;
                    case 0:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }

            } while (opcion != 0);

            scanner.close();
        }
    }
