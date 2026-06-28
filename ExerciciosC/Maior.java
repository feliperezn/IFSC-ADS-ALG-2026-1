import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);
  IO.println("Entre com inteiros positivos. Entre com 0 ou um inteiro negativo para terminar.");
  int numeroDigitado, maior = 0, quantidade = 0;

  do {
    numeroDigitado = sc.nextInt();

    if (numeroDigitado > maior) {
      maior = numeroDigitado;
      quantidade = 1;
    } else if (numeroDigitado == maior) {
      quantidade++;
    }

  } while (numeroDigitado > 0);

  if (maior > 0) {
    IO.print("O maior inteiro foi " + maior + ", que ocorreu " + quantidade);
    IO.print(quantidade == 1 ? " uma vez." : " vezes.");
    IO.println();
  } else {
    IO.println("Nenhum número inteiro foi inserido");
  }

  sc.close();
}