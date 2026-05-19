import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in); // Não se preocupe com os detalhes dessa linha

    IO.print("Entre com sua nota: ");
    int nota = sc.nextInt();
    switch (nota) {
        case 4 -> IO.println("Excelente");
        case 3 -> IO.println("Bom");
        case 2 -> IO.println("Regular");
        case 1 -> IO.println("Ruim");
        default -> IO.println("Nota inválida");
    }

    sc.close();
}

// import java.util.Scanner;
// void main() {
// java.util.Scanner sc = new Scanner(System.in);
// sc.close();
// }