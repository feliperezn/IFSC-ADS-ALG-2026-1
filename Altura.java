import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha
    double pes, polegadas, total_pol, altura_m;
    final double POL_CM = 2.54;

    IO.println("Entre com sua altura em pés + polegadas (ex: 5 10)");

    pes = sc.nextDouble();
    polegadas = sc.nextDouble();

    total_pol = polegadas + (pes * 12);
    altura_m = (total_pol * POL_CM) / 100;
    
    IO.println(pes);
    IO.println(polegadas);
    IO.println(total_pol);
    IO.println(altura_m);
}