void main() {
    double[] a = { 100, 10, 11, 12, 14 };
    IO.println(calculaMediaAparada(a, 2)); // Deve imprimir 11.0

    double[] b = { 1, 9, 5, 5 };
    IO.println(calculaMediaAparada(b, 1)); // Deve imprimir 6.333333333333333

    double[] c = { 9.5, 3.0, 4.5, 7.0 };
    IO.println(calculaMediaAparada(c, 0)); // Deve imprimir 6.0
}

double calculaMedia(double[] array) {
    double soma = 0;
    for (int i = 0; i < array.length; i++) {
        soma += array[i];
    }
    return soma / array.length;
}

int encontraIndiceMaisDistante(double[] array) {
    double media = calculaMedia(array);

    int indiceMaisDistante = 0;
    double maiorDistancia = Math.abs(array[0] - media);

    for (int i = 1; i < array.length; i++) {
        double distancia = Math.abs(array[i] - media);

        if (distancia > maiorDistancia) {
            maiorDistancia = distancia;
            indiceMaisDistante = i;
        }
    }

    return indiceMaisDistante;
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

double calculaMediaAparada(double[] array, int m) {

    while (m > 0) {
        int indiceMenor = encontraIndiceMaisDistante(array);
        array = removeElemento(array, indiceMenor); // substituir o array
        m--;
    }

    IO.println(Arrays.toString(array));

    return calculaMedia(array);
}