package punto3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        Linkedlist linkedlist = new Linkedlist(sc.nextLine());
        System.out.print("Ingrese una letra para validar ocurrencia: ");
        int[] array = linkedlist.ocurrencia(sc.next().charAt(0));
        System.out.println("La primera ocurrencia es: " + array[0]);
        System.out.println("La ultima ocurrencia es: " + array[1]);
    }
}
