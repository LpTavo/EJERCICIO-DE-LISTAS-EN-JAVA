class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public Nodo buscar(int x) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == x) {
                return temp;
            }
            temp = temp.siguiente;
        }
        return null; 
    }
}

public class Principal {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        int x = 3; 
        Nodo resultado = lista.buscar(x);
        
        if (resultado != null) {
            System.out.println("El nodo con el valor " + x + " se encuentra en la lista.");
        } else {
            System.out.println("El valor " + x + " no se encuentra en la lista.");
        }

        int y = 6; 
        Nodo resultado2 = lista.buscar(y);
        
        if (resultado2 != null) {
            System.out.println("El nodo con el valor " + y + " se encuentra en la lista.");
        } else {
            System.out.println("El valor " + y + " no se encuentra en la lista.");
        }
    }
}
