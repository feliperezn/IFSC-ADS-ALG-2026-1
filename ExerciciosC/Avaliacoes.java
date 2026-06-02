import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com P1 e R1: ");
    double p1 = arredonda(sc.nextDouble());
    double r1 = arredonda(sc.nextDouble());

    IO.print("Entre com P2 e R2: ");
    double p2 = arredonda(sc.nextDouble());
    double r2 = arredonda(sc.nextDouble());

    IO.print("Entre com P3 e R3: ");
    double p3 = arredonda(sc.nextDouble());
    double r3 = arredonda(sc.nextDouble());

    IO.print("Entre com a frequência (%): ");
    double freq = sc.nextDouble();
    sc.close();

    double media = media(maximo(p1, r1), maximo(p2, r2), maximo(p3, r3));

    if (media >= 6 && freq >= 75) {
        IO.println("Resultado: " + arredonda(media));
        IO.println("Situação: aprovado");
    } else {
        IO.println("Resultado: 0");
        IO.println("Situaçao: reprovado");
    }
}

double maximo(double n1, double n2) {
    return n1 > n2 ? n1 : n2;
}

double media(double n1, double n2, double n3) {
    return arredonda((n1 + n2 + n3) / 3);
}

int arredonda(double n1) {
    int n2 = (int) n1;
    double n3 = n1 - n2;

    return n3 >= 0.5 ? n2 + 1 : n2;
}