import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    float p1, p2, p3, r1, r2, r3;
    int freq;

    IO.print("Entre com P1 e R1: ");
    p1 = sc.nextFloat();
    r1 = sc.nextFloat();

    IO.print("Entre com P2 e R2: ");
    p2 = sc.nextFloat();
    r2 = sc.nextFloat();

    IO.print("Entre com P3 e R3: ");
    p3 = sc.nextFloat();
    r3 = sc.nextFloat();

    IO.print("Entre com a frequência: ");
    freq = sc.nextInt();

    sc.close();
}

float maximo(float x, float y) {
    float z = (x < y) ? x : y;
    return z;
}

float media(float x, float y, float z) {
    float media = 
    return media;
}