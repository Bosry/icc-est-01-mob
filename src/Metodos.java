public class Metodos {

public Metodos(){
    System.out.println("Se creo la clase Metodos");
}

    public int[] sortByBubble(int[] arreglo) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
    public int[] sortByBubbleDes(int[] arreglo) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArregloDes(int[] arreglo) {
        System.out.println("");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    public String[] sortByBubblePalabras(String[] palabras) {
        int tamanio = palabras.length;
        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j])>0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        return palabras;
    }
    public void printArregloPalabras(String[] palabras) {
        System.out.println("");
        for (String elemento : palabras) {
            System.out.print(elemento + " ");
        }
    }



}
