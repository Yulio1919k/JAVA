package Garaje2;
import java.util.Scanner;

public class Garaje_Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Lista listaVehiculos = new Lista();
        
        while (true) {
            System.out.println("\n------- Menú del Garaje -------");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Buscar vehículo por placa");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Navegar vehículos");
            System.out.println("5. Mostrar todos los vehículos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            
            int opcion = leer.nextInt();
            leer.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1: // Registrar vehículo
                    System.out.println("--- Registrar Nuevo Vehículo ---");
                    System.out.print("Ingrese tipo de vehículo: ");
                    String tipo = leer.nextLine();
                    System.out.print("Ingrese placa: ");
                    String placa = leer.nextLine();
                    System.out.print("Ingrese color: ");
                    String color = leer.nextLine();
                    System.out.print("Ingrese marca: ");
                    String marca = leer.nextLine();
                    System.out.print("Ingrese cantidad de pasajeros: ");
                    byte pasajeros = leer.nextByte();
                    
                    Vehiculo nuevoVehiculo = new Vehiculo(tipo, placa, color, marca, pasajeros);
                    listaVehiculos.Insertar(nuevoVehiculo);
                    System.out.println("Vehículo registrado exitosamente.");
                    break;
                
                case 2: // Buscar vehículo
                    System.out.print("Ingrese la placa del vehículo a buscar: ");
                    String placaBuscar = leer.nextLine();
                    Vehiculo vehiculoEncontrado = listaVehiculos.buscarVehiculoPorPlaca(placaBuscar);
                    
                    if (vehiculoEncontrado != null) {
                        System.out.println("Vehículo encontrado:");
                        System.out.println(vehiculoEncontrado.toString());
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                
                case 3: // Eliminar vehículo
                    System.out.print("Ingrese la placa del vehículo a eliminar: ");
                    String placaEliminar = leer.nextLine();
                    
                    if (listaVehiculos.EliminaElemento(placaEliminar)) {
                        System.out.println("Vehículo eliminado exitosamente.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;
                
                case 4: // Navegar vehículos
                    if (listaVehiculos.Vacia()) {
                        System.out.println("No hay vehículos para navegar.");
                        continue;
                    }
                    
                    System.out.println("--- Navegación de Vehículos ---");
                    System.out.println("1. Siguiente vehículo");
                    System.out.println("2. Vehículo anterior");
                    System.out.print("Elija una opción: ");
                    int navegacion = leer.nextInt();
                    
                    Vehiculo vehiculoActual = null;
                    switch (navegacion) {
                        case 1:
                            vehiculoActual = listaVehiculos.getSiguienteVehiculo();
                            break;
                        case 2:
                            vehiculoActual = listaVehiculos.getAnteriorVehiculo();
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    
                    if (vehiculoActual != null) {
                        System.out.println("Vehículo actual:");
                        System.out.println(vehiculoActual.toString());
                    }
                    break;
                
                case 5: // Mostrar todos los vehículos
                    listaVehiculos.MostrarTodos();
                    break;
                
                case 0:
                    System.out.println("¡Hasta luego!");
                    return;
                
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
