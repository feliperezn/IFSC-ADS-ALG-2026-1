void main() {
  String buffer = IO.readln("Entre com n máximo: ");
  int n = Integer.parseInt(buffer);

  imprimePascal(n);

}

int potenciaFatorial(int base, int expoente) {
  int potFat = 1;

  for (int i = 1; i < expoente; i++) {
    potFat = potFat * (base - i);
  }
  potFat = potFat * base;

  return potFat;
  // Retorna a potência fatorial referente a uma dada base e a um dado expoente
}

int coeficienteBinomial(int n, int k) {
  return potenciaFatorial(n, k) / potenciaFatorial(k, k);
  // Retorna o coeficiente binomial de n na classe k
}

void imprimePascal(int nMax) {
  // Imprime o triângulo de Pascal até a linha nMax
  IO.println(coeficienteBinomial(1, 1));
  IO.println(coeficienteBinomial(1, 1) + " " + coeficienteBinomial(1, 1));
  IO.println(coeficienteBinomial(2, 1) + " " + coeficienteBinomial(2, 1) + " " + coeficienteBinomial(2, 2));
}