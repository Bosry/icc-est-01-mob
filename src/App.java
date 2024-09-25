public class App {
    public static void main(String[] args) throws Exception {

Metodos burbuja = new Metodos();


int[] arreglo = {5, 7, 30, 12, 9};

int[] arregloOrdenado = burbuja.sortByBubble(arreglo);

burbuja.printArreglo(arregloOrdenado);

int[] arregloOrdDes = burbuja.sortByBubbleDes(arreglo);

burbuja.printArregloDes(arregloOrdDes);
    }
}
