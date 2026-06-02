import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com cinco números: ");

    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();
    double n3 = sc.nextDouble();
    double n4 = sc.nextDouble();
    double n5 = sc.nextDouble();

    IO.println(String.format("%.1f", obtemMediaTruncada(n1, n2, n3, n4, n5)));

    sc.close();
}

double minimo(double n1, double n2, double n3, double n4, double n5) {
    double min = n1;

    if (min > n2) {
        min = n2;
    }

    if (min > n3) {
        min = n3;
    }

    if (min > n4) {
        min = n4;
    }

    if (min > n5) {
        min = n5;
    }

    return min;
}

double maximo(double n1, double n2, double n3, double n4, double n5) {
    double max = n1;

    if (max < n2) {
        max = n2;
    }

    if (max < n3) {
        max = n3;
    }

    if (max < n4) {
        max = n4;
    }

    if (max < n5) {
        max = n5;
    }

    return max;
}

double obtemMediaTruncada(double n1, double n2, double n3, double n4, double n5) {
    double soma = n1 + n2 + n3 + n4 + n5 - minimo(n1, n2, n3, n4, n5) - maximo(n1, n2, n3, n4, n5);
    double media = soma / 3;

    return media;
}