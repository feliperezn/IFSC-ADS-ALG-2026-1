import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha
    double a, b, c, area, volume;

    IO.println("Digite as três dimensões da caixa: ");

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    area = (2*a*b) + (2*b*c) + (2*a*c);
    volume = a*b*c;

    IO.println("Área: " + area + " m³");
    IO.println("Volume: " + volume + " m³");

    sc.close();
}