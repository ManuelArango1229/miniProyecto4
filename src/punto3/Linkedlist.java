package punto3;

import java.util.LinkedList;

public class Linkedlist {
    public Linkedlist(String n) {
        for (int i = 0; i < n.length(); i++) {
            linkedlist.add(n.charAt(i));
        }
    }

    public int[] ocurrencia(char n) {
        int last = 0;
        int first = 0;
        int aux = 0;
        for (int i = 0; i < linkedlist.size(); i++) {
            if (linkedlist.get(i).equals(n)) {
                aux = i;
                if (first == 0) {
                    first = aux + 1;
                }
                last = aux + 1;
            }
        }
        int[] array = { first, last };
        return array;
    }

    private LinkedList<Character> linkedlist = new LinkedList<>();

}
