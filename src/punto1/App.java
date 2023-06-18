package punto1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        queue cola = new queue();
        int leer;
        System.out.print("Ingrese un numero: ");
        leer = sc.nextInt();
        cola.addTodos(leer);
        System.out.println(cola.mostrar());
    }
}
