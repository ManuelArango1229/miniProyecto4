package punto2;

import java.util.HashMap;

public class hashmap {

    public boolean addPalabra(String n) {
        n.toLowerCase();
        int vocales = 0;
        int consonantes = 0;
        for (int i = 0; i < n.length(); i++) {
            char letra = n.charAt(i);
            switch (letra) {
                case 'a':
                    vocales++;
                    map.put("v" + vocales, String.valueOf(letra));
                    break;
                case 'e':
                    vocales++;
                    map.put("v" + vocales, String.valueOf(letra));
                    break;
                case 'i':
                    vocales++;
                    map.put("v" + vocales, String.valueOf(letra));
                    break;
                case 'o':
                    vocales++;
                    map.put("v" + vocales, String.valueOf(letra));
                    break;
                case 'u':
                    vocales++;
                    map.put("v" + vocales, String.valueOf(letra));
                    break;
                default:
                    consonantes++;
                    map.put("c" + consonantes, String.valueOf(letra));
            }
        }
        return true;
    }

    public int[] consonantes() {
        int[] total = new int[2];
        int vocales = 0, consonantes = 0;
        Object[] array = map.keySet().toArray();
        for (int i = 0; i < array.length; i++) {
            String letra = ((String) array[i]);
            if (letra.charAt(0) == 'v') {
                vocales++;
            } else {
                consonantes++;
            }
        }
        total[0] = vocales;
        total[1] = consonantes;
        return total;
    }

    HashMap<String, String> map = new HashMap<>();
}
