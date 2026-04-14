import java.util.Scanner;

void main() {

    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha
    double a, b, c, area, volume;

    IO.println("Digite as três dimensões da caixa: ");

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();

    area = (2*a*b) + (2*b*c) + (2*c*a);
    volume = a*b*c;

    IO.println("Área: " + area);
    IO.println("Volume: " + volume);

}

/*
 * 
 * 
 * Variáveis
 * a, b, c: número
 * area, volume: número
 * Início
 * Escreva "Entre com as três dimensões da caixa:"
 * Leia a, b, c
 * area = 2*a*b + 2*b*c + 2*c*a
 * volume = a*b*c
 * Escreva "Área: ", area
 * Escreva "Volume: ", volume
 * Fim
 */