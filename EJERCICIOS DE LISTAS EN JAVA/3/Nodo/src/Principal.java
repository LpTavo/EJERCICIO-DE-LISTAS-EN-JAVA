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

    public void imprimeInverso(int p) {
        Nodo nodo = getNodoEnPosicion(p);
        if (nodo != null) {
            imprimeInversoRecursivo(nodo);
        } else {
            System.out.println("Posición no válida");
        }
    }

    private Nodo getNodoEnPosicion(int p) {
        Nodo temp = cabeza;
        int contador = 0;
        while (temp != null && contador < p) {
            temp = temp.siguiente;
            contador++;
        }
        return temp;
    }

    private void imprimeInversoRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        imprimeInversoRecursivo(nodo.siguiente);
        System.out.print(nodo.dato + " ");
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

        int p = 2; 
        System.out.print("Elementos en orden inverso desde la posición " + p + ": ");
        lista.imprimeInverso(p);
    }
}
