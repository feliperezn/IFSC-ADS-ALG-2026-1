import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  IO.print("Entre com o número de dias do mês (28,30 ou 31): ");
  int diasMes = sc.nextInt();

  IO.print("Entre com o primeiro dia da semana (1=Dom, 7=Sab): ");
  int primDiaSemana = sc.nextInt();

  sc.close();

  int diaSemana = primDiaSemana;

  IO.println(" D  S  T  Q  Q  S  S");

  while (primDiaSemana > 1) {
    IO.print("   ");
    primDiaSemana--;
  }

  for (int i = 1; i <= diasMes; i++) {

    IO.print(String.format("%2d", i) + " ");

    if (diaSemana == 7) {
      IO.println();
      diaSemana = 0;
    }

    diaSemana++;
  }
}