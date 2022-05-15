package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        HashMap<String, Double> art = new HashMap();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int resp;

        do {

            System.out.println("MENÚ: ");
            System.out.println("1. INGRESAR AL STOCK");
            System.out.println("2. CAMBIAR PRECIO DE ARTÍCULO");
            System.out.println("3. ELIMINAR DEL STOCK");
            System.out.println("4. MOSTRAR STOCK");
            System.out.println("5. SALIR");
            resp = scan.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Introduzca el nombre y precio del artículo");
                    art.put(scan.next(), scan.nextDouble());
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del artículo al que quiera cambiar su precio");
                    String resp2 = scan.next();
                    if (art.containsKey(resp2)) {
                        System.out.println("Se ha encontrado el artículo, por favor reingrese su precio");
                        art.replace(resp2, scan.nextDouble());
                    } else {
                        System.out.println("Artículo no encontrado, reingresando al sistema");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del artículo que desea eliminar del stock");
                    if (art.containsKey(scan.next())) {
                        art.remove(scan.next());
                    } else {
                        System.out.println("Artículo no encontrado, reingresando al sistema");
                    }
                    break;
                case 4:
                    for (Map.Entry<String, Double> aux : art.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println(key + " " + value);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    System.out.println("No se ha detectado ninguna opción válida, reingresando al sistema");
                    break;

            }

        } while (resp != 5);

    }

}
