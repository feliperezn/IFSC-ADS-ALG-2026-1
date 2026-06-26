void main() {
    double[] a = { 10, 10, 8, 7, 8 };
    IO.println(calculaMediaDescartada(a, 2)); // Deve imprimir 9.333333333333334

    double[] b = { 7.5, 8.0, 6.0, 9.5, 10.0, 6.5 };
    IO.println(calculaMediaDescartada(b, 3));
    IO.println(calculaMediaDescartada(b, 3)); // Deve imprimir 9.166666666666666

    double[] c = { 4, 8, 6, 2 };
    IO.println(calculaMediaDescartada(c, 0)); // Deve imprimir 5.0
}

double calculaMedia(double[] array) {
    double soma = 0;
    for (int i = 0; i < array.length; i++) {
        soma += array[i];
    }
    return soma / array.length;
}

int encontraIndiceMenor(double[] array) {
    double menor = array[0];
    int indiceMenor = 0;

    for (int i = 1; i < array.length; i++) {
        if (array[i] < menor) {
            menor = array[i];
            indiceMenor = i;
        }
    }

    return indiceMenor;
}

double[] removeElemento(double[] array, int indice) {

    double[] novoArray = new double[array.length - 1];

    for (int i = 0; i < indice; i++) {
        novoArray[i] = array[i];
    }

    for (int i = indice + 1; i < array.length; i++) {
        novoArray[i - 1] = array[i];
    }

    return novoArray;
}

double calculaMediaDescartada(double[] array, int m) {

    while (m > 0) {
        int indiceMenor = encontraIndiceMenor(array);
        array = removeElemento(array, indiceMenor); // substituir o array
        m--;
    }

    IO.println(Arrays.toString(array));

    return calculaMedia(array);
}