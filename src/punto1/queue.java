package punto1;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public boolean addTodos(int x) {
        for (int i = 1; i <= x; i++) {
            cola.offer(String.valueOf(Integer.toBinaryString(i)));
        }
        return true;
    }

    public String mostrar() {
        String texto = "";

        while (!cola.isEmpty()) {
            texto += cola.poll() + "\n";
        }

        return texto;
    }

    Queue<String> cola = new LinkedList<>();

}