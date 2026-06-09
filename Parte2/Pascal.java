void main() {
  String buffer = IO.readln("Entre com n máximo: ");
  int n = Integer.parseInt(buffer);

  imprimePascal(n);
}

int potenciaFatorial(int base, int expoente) {
  int potFat = 1;

  while (expoente > 0) {
    potFat *= base;
    expoente -= 1;
    base -= 1;
  }

  return potFat;
  // Retorna a potência fatorial referente a uma dada base e a um dado expoente
}

int coeficienteBinomial(int n, int k) {
  return potenciaFatorial(n, k) / potenciaFatorial(k, k);
  // Retorna o coeficiente binomial de n na classe k
}

void imprimePascal(int nMax) {
  // Imprime o triângulo de Pascal até a linha nMax
  for (int n = 0; n <= nMax; n++) {
    for (int k = 0; k <= n; k++) { // enquanto a coluna for menor igual a linha, imprima coluna
      IO.print(coeficienteBinomial(n, k) + " ");
    }
    IO.println();
  }
}