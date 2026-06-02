void main() {
  String buffer = IO.readln("Entre com um número inteiro não negativo: ");
  int n = Integer.parseInt(buffer);

  IO.println("Soma dos dígitos: " + somaDigitos(n));
}

int somaDigitos(int n) {
  int soma = 0;

  while (n > 0) {
    int digito = n % 10;
    soma += digito;
    n /= 10;
  }

  return soma;
}