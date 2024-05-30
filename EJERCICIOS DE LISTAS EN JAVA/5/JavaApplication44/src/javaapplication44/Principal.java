class Nodo {
    int digito;
    Nodo siguiente;
    Nodo anterior;

    Nodo(int digito) {
        this.digito = digito;
        this.siguiente = this;
        this.anterior = this;
    }
}

class ListaCircularDoble {
    Nodo cabeza;

    public ListaCircularDoble() {
        this.cabeza = null;
    }

    public void agregar(int digito) {
        Nodo nuevoNodo = new Nodo(digito);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo ultimo = cabeza.anterior;
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
        }
    }

    public ListaCircularDoble multiplicar(ListaCircularDoble otra) {
        ListaCircularDoble resultado = new ListaCircularDoble();
        int[] producto = new int[this.longitud() + otra.longitud()];

        Nodo nodo1 = this.cabeza;
        for (int i = 0; i < this.longitud(); i++) {
            Nodo nodo2 = otra.cabeza;
            for (int j = 0; j < otra.longitud(); j++) {
                producto[i + j] += nodo1.digito * nodo2.digito;
                producto[i + j + 1] += producto[i + j] / 10;
                producto[i + j] %= 10;
                nodo2 = nodo2.siguiente;
            }
            nodo1 = nodo1.siguiente;
        }

        boolean inicio = true;
        for (int i = producto.length - 1; i >= 0; i--) {
            if (producto[i] != 0) {
                inicio = false;
            }
            if (!inicio) {
                resultado.agregar(producto[i]);
            }
        }

        if (resultado.cabeza == null) {
            resultado.agregar(0);
        }

        return resultado;
    }

    public int longitud() {
        if (cabeza == null) {
            return 0;
        }

        int longitud = 0;
        Nodo temp = cabeza;
        do {
            longitud++;
            temp = temp.siguiente;
        } while (temp != cabeza);
        return longitud;
    }

    public void imprimir() {
        if (cabeza == null) {
            System.out.print("Lista vacía");
            return;
        }

        Nodo temp = cabeza;
        do {
            System.out.print(temp.digito);
            temp = temp.siguiente;
        } while (temp != cabeza);
        System.out.println();
    }
}
public class Principal {
    public static void main(String[] args) {
        ListaCircularDoble num1 = new ListaCircularDoble();
        num1.agregar(3);
        num1.agregar(4);
        num1.agregar(2); // 243

        ListaCircularDoble num2 = new ListaCircularDoble();
        num2.agregar(4);
        num2.agregar(6);
        num2.agregar(5); // 564

        ListaCircularDoble resultado = num1.multiplicar(num2);

        System.out.print("Número 1: ");
        num1.imprimir();
        System.out.print("Número 2: ");
        num2.imprimir();
        System.out.print("Resultado de la multiplicación: ");
        resultado.imprimir();
    }
}
