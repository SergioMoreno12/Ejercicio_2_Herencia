import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        int estado = 1;

        List<Vehiculo> listvehiculo= new ArrayList<>();

        do{
            System.out.println("""
                ================================================
                |                 Vehículos                    |
                |==============================================|
                |                   Menu                       |
                |==============================================|
                | 1 | Agregar un auto                          |
                | 2 | Agregar una motocicleta                  |
                | 3 | Mostrar vehículos agregados              |
                | 4 | Salir                                    |
                ================================================
                """);

            op= teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1-> {

                    System.out.println("----------Agregar un auto----------");
                    System.out.println("Ingrese la marca: ");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese el año: ");
                    String ano = teclado.nextLine();
                    System.out.println("Ingrese el precio base: ");
                    double precioBase = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese el numero de puertas: ");
                    String numeroPuertas = teclado.nextLine();
                    listvehiculo.add(new Auto(marca, modelo, ano, precioBase, numeroPuertas));
                    System.out.println("Presione 1 para continuar");
                    estado = teclado.nextInt();

                }
                case 2-> {

                    System.out.println("----------Agregar una motocicleta----------");
                    System.out.println("Ingrese la marca: ");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese el año: ");
                    String ano = teclado.nextLine();
                    System.out.println("Ingrese el precio base: ");
                    double precioBase = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrese la cilindrada: ");
                    String cilindrada = teclado.nextLine();
                    listvehiculo.add(new Motocicleta(marca, modelo, ano, precioBase, cilindrada));
                    System.out.println("Presione 1 para continuar");
                    estado = teclado.nextInt();

                }
                case 3-> {

                    System.out.println("----------Mostrar vehículos agregados----------");
                    if (listvehiculo.isEmpty()){
                        System.out.println("No hay vehículos agregados");
                    }else {
                        System.out.println("Número total de vehículos: " + listvehiculo.size());
                        System.out.println("=================================");
                        int contador = 1;
                        for (Vehiculo vehiculo : listvehiculo) {
                            System.out.println("Vehículo " + contador);
                            vehiculo.mostrarInfo();
                            System.out.println("=================================");
                            contador++;
                        }
                    }
                    System.out.println("Presione 1 para continuar");
                    estado = teclado.nextInt();

                }
                case 4-> {

                    System.out.println("Saliendo...");
                    estado = 2;

                }
                default -> System.out.println("Opción no válida");
            }

        }while(estado == 1);
    }
}