void main() {

  int n = 123;

  IO.println("div:" + n / 10);
  IO.println("mod:" + n % 10); // ultimo
  IO.println("Soma:" + somaDigitos(n)); // ultimo

}

int somaDigitos(int n) {
  int soma = 0;

  while (n / 10 != 0) {
    int digitoFinal = n % 10;
    n /= 10;
    soma += digitoFinal;
  }

  return soma;
}