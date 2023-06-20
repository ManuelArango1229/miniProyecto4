package punto2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hashmap map = new hashmap();
        String entrada;
        System.out.println("Ingrese una palabra: ");
        entrada = sc.nextLine();
        map.addPalabra(entrada);
        System.out.println("El número de vocales es: " + map.consonantes()[0]);
        System.out.println("El número de consonantes el: " + map.consonantes()[1]);
    }
}
