import java.util.LinkedList;
import java.util.Queue;

public class EjercicioCola {

    
    public static int contarElementos(Queue<?> cola) {
        return cola.size();
    }

    public static void main(String[] args) {
        
        Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);

       
        System.out.println("Número de elementos en la cola: " + contarElementos(cola));
    }
}
