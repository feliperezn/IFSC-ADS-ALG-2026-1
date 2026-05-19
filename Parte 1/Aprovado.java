import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha

    double p1,r1,p2,r2,p3,r3, freq, media;
    boolean aprovado;
    int mediaArredondada;

    IO.print("Entre com P1 e R1: ");
    p1 = sc.nextDouble();
    r1 = sc.nextDouble();

    IO.print("Entre com P2 e R2: ");
    p2 = sc.nextDouble();
    r2 = sc.nextDouble();

    IO.print("Entre com P3 e R3: ");
    p3 = sc.nextDouble();
    r3 = sc.nextDouble();

    IO.print("Entre com a frequência (em %): ");
    freq = sc.nextInt();

    p1 = Math.max(p1, r1);
    p2 = Math.max(p2, r2);
    p3 = Math.max(p3, r3);

    media = (p1+p2+p3)/3;
    mediaArredondada = (int)Math.round(media);

    aprovado = mediaArredondada>=6 && freq>=75;

    IO.println("Média: " + String.format("%.1f", media));
    IO.println("Média arredondada: " + mediaArredondada);
    IO.println("Aprovado: " + aprovado);
    
    sc.close();
}