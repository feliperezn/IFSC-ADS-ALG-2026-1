void main() {
  Scanner sc = new Scanner(System.in);

  int qtdChuvaL = 0;

  for (int d = 1; d < 8; d++) {
    IO.print("Entre com a quantidade de chuva no dia " + d + " em litros: ");
    qtdChuvaL += sc.nextInt();

    if (qtdChuvaL > 400) {
      IO.println("O reservatório transbordou no dia " + d + ".");
      break;
    } else if (d == 7) {
      IO.println("O reservatório não transbordou. Espaço livre: " + (400 - qtdChuvaL) + " litros.");
    }
  }

  sc.close();
}