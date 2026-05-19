import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha

    int pes, polegadas;
    double total_pol, altura_m;
    final double POL_CM = 2.54;

    IO.print("Entre com sua altura em pés + polegadas (ex: 5 10)");

    pes = sc.nextInt();
    polegadas = sc.nextInt();

    total_pol = polegadas + (pes * 12);
    altura_m = (total_pol * POL_CM) / 100;
    
    // IO.println(pes);
    // IO.println(polegadas);
    // IO.println(total_pol);
    // IO.println(altura_m);

    IO.println(altura_m);

    sc.close();
}

// void main() {
//     String entrada;
//     int pes, pol;
//     double metros;

//     entrada = IO.readln("Entre com os pés: ");
//     pes = Integer.parseInt(entrada);

//     entrada = IO.readln("Entre com as pol: ");
//     pol = Integer.parseInt(entrada);

//     pol = pes * 12 + pol;

//     metros = pol * 2.54 / 100.0;

//     IO.println("Sua altura em metros: " + metros);
// }