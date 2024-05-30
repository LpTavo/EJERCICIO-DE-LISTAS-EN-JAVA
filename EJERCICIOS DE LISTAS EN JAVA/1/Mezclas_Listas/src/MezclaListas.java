import java.util.ArrayList;
import java.util.List;

public class MezclaListas {
    
    public static List<Integer> Mezcla2(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                result.add(lista1.get(i));
                i++;
            } else {
                result.add(lista2.get(j));
                j++;
            }
        }

        // Añadir los elementos restantes de lista1, si los hay
        while (i < lista1.size()) {
            result.add(lista1.get(i));
            i++;
        }

        // Añadir los elementos restantes de lista2, si los hay
        while (j < lista2.size()) {
            result.add(lista2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);

        List<Integer> resultado = Mezcla2(lista1, lista2);
        System.out.println("Lista mezclada: " + resultado);
    }
}
