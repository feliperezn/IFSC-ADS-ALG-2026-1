import java.util.Scanner;

void main() {
  java.util.Scanner sc = new Scanner(System.in);

  double a, b, c;

  IO.print("Entre com os lados do triângulo: ");
  a = sc.nextDouble();
  b = sc.nextDouble();
  c = sc.nextDouble();

  if ((a + b) > c && (a + c) > b && (b + c) > a) {
    if (a == b && a == c && b == c) {
      IO.println("Triângulo Equilátero");
    } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
      IO.println("Triângulo Isósceles");
    } else {
      IO.println("Triângulo escaleno");
    }
  } else {
    IO.println("Triângulo inválido");
  }

  sc.close();
}