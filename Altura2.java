import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha
    
    double pes, polegadas, total_pol, altura_m;
    
    final double POL_CM = 2.54;

    IO.print("Entre com sua altura em metros: ");

    altura_m = sc.nextDouble();
    
    total_pol = Math.round((altura_m*100) / POL_CM);
    pes = (int)total_pol / 12;
    polegadas = total_pol % 12;

    IO.println("Altura em pés + polegadas: " + (int)pes + "'" + (int)polegadas + '"');

    // IO.println(pes);
    // IO.println(polegadas);
}