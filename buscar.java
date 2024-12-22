import java.util.Scanner;
public class buscar{
        public static void main(String[] args) {
            // Declarar el vector y llenarlo con números del 1 al 100
            int[] numeros = new int[100];
            for(int i = 0; i < 100; i++) {
                numeros[i] = i + 1;
            }   
            // Crear variable para leer entrada del usuario
            Scanner reader = new Scanner(System.in);   
            while(true) {
                try {
                    System.out.println("\n1. Buscar número");
                    System.out.println("2. Mostrar números");
                    System.out.println("3. Salir");
                    System.out.print("Elija una opción: ");
                    
                    int opcion = Integer.parseInt(reader.nextLine());
                    
                    if(opcion == 1) {
                        System.out.print("Ingrese el número a buscar: ");
                        int buscar = Integer.parseInt(reader.nextLine());
                        
                        boolean encontrado = false;
                        for(int i = 0; i < numeros.length; i++) {
                            if(numeros[i] == buscar) {
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if(encontrado) {
                            System.out.println("El número " + buscar + " SÍ está en el vector");
                        } else {
                            System.out.println("El número " + buscar + " NO está en el vector");
                        }
                    }
                    else if(opcion == 2) {
                        System.out.println("\nNúmeros en el vector:");
                        for(int i = 0; i < numeros.length; i++) {
                            System.out.print(numeros[i] + " ");
                            if((i + 1) % 10 == 0) {
                                System.out.println();
                            }
                        }
                    }
                    else if(opcion == 3) {
                        System.out.println("¡Hasta luego!");
                        break;
                    }
                    else {
                        System.out.println("Opción no válida");
                    }
                    
                } catch(Exception e) {
                    System.out.println("Error: Ingrese un número válido");
                }
            }
        }
    }