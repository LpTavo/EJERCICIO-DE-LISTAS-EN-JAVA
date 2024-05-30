import java.util.List;
import java.util.ArrayList;

public class SumaRecursiva {

    
    public static int sumaRecursiva(List<Integer> lista) {
        return sumaRecursivaAux(lista, 0);
    }

    
    private static int sumaRecursivaAux(List<Integer> lista, int index) {
  
        if (index >= lista.size()) {
            return 0;
        }
    
        return lista.get(index) + sumaRecursivaAux(lista, index + 1);
    }

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        int suma = sumaRecursiva(lista);
        System.out.println("La suma de los elementos de la lista es: " + suma);
    }
}
