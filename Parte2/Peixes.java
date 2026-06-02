import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Entre com o pH mínimo: ");
    double phMin = sc.nextDouble();

    IO.print("Entre com o pH máximo: ");
    double phMax = sc.nextDouble();

    IO.print("Entre com o número de medições: ");
    int nMed = sc.nextInt();

    int fora = 0;

    for (int i = 1; i <= nMed; i++) {

        IO.print("Entre com a medição " + i + ": ");
        double ph = sc.nextDouble();

        if (ph < phMin || ph > phMax) {
            fora++;
        }
    }

    sc.close();

    IO.println("Número de medições fora da faixa: " + fora);
}