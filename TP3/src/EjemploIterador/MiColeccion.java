package EjemploIterador;

import java.util.Iterator;

public class MiColeccion<T> implements Iterable<T> {
    private T[] elementos;
    private int tamaño;

    public MiColeccion(T[] elementos) {
        this.elementos = elementos;
        this.tamaño = elementos.length;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorColeccion();
    }

    private class IteradorColeccion implements Iterator<T> {
        private int indiceActual = 0;

        @Override
        public boolean hasNext() {
            return indiceActual < tamaño;
        }

        @Override
        public T next() {
            return elementos[indiceActual++];
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        MiColeccion<Integer> coleccion = new MiColeccion<>(numeros);

        for (Integer numero : coleccion) {
            System.out.println(numero);
        }
    }
}
