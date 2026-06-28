void main() {
  Scanner sc = new Scanner(System.in);
  IO.println("Entre com um inteiro: ");
  int numeroDigitado = sc.nextInt();

  int[] arrayQtdPorDigito = new int[10];

  do {
    int digito = numeroDigitado % 10;
    arrayQtdPorDigito[digito] += 1;

    numeroDigitado /= 10;
  } while (numeroDigitado > 0);

  IO.println("Dígito:      [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
  IO.print("Ocorrências: ");
  IO.println(Arrays.toString(arrayQtdPorDigito));

  sc.close();
}