void main() {
  String buffer = IO.readln("Entre com o CPF (somente números): ");
  String[] partes = buffer.split("");

  int d1 = Integer.parseInt(partes[0]);
  int d2 = Integer.parseInt(partes[1]);
  int d3 = Integer.parseInt(partes[2]);
  int d4 = Integer.parseInt(partes[3]);
  int d5 = Integer.parseInt(partes[4]);
  int d6 = Integer.parseInt(partes[5]);
  int d7 = Integer.parseInt(partes[6]);
  int d8 = Integer.parseInt(partes[7]);
  int d9 = Integer.parseInt(partes[8]);
  int d10 = Integer.parseInt(partes[9]);
  int d11 = Integer.parseInt(partes[10]);

  if (ehCpfValido(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11)) {
    IO.println("CPF válido");
    imprimeCpf(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11);
    imprimeUfs(d9);
  } else {
    IO.println("CPF inválido");
  }

}

boolean ehCpfValido(int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d8, int d9, int d10, int d11) {
  int valDigito10 = ((10 * d1) + (9 * d2) + (8 * d3) + (7 * d4) + (6 * d5) + (5 * d6) + (4 * d7) + (3 * d8) + (2 * d9))
      * 10;

  valDigito10 = (valDigito10 % 11) == 10 ? 0 : (valDigito10 % 11);

  if (valDigito10 == d10) {
    int valDigito11 = ((11 * d1) + (10 * d2) + (9 * d3) + (8 * d4) + (7 * d5) + (6 * d6) + (5 * d7) + (4 * d8)
        + (3 * d9)
        + (2 * d10)) * 10;

    valDigito11 = (valDigito11 % 11) == 10 ? 0 : (valDigito11 % 11);

    return (valDigito11 == d11);

  } else {
    return false;
  }
}

void imprimeCpf(int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d8, int d9, int d10, int d11) {
  IO.println("Formato padrão: " + d1 + d2 + d3 + "." + d4 + d5 + d6 + "." + d7 + d8 + d9 + "-" + d10 + d11);
}

void imprimeUfs(int numRegiao) {

  switch (numRegiao) {
    case 1 -> IO.println("Unidades federativas: DF, GO, MT, MS, TO");
    case 2 -> IO.println("Unidades federativas: AC, AP, AM, PA, RO, RR");
    case 3 -> IO.println("Unidades federativas: CE, MA, PI");
    case 4 -> IO.println("Unidades federativas: AL, PB, PE, RN");
    case 5 -> IO.println("Unidades federativas: BA, SE");
    case 6 -> IO.println("Unidades federativas: MG");
    case 7 -> IO.println("Unidades federativas: ES, RJ");
    case 8 -> IO.println("Unidades federativas: SP");
    case 9 -> IO.println("Unidades federativas: PR, SC");
    default -> IO.println("Unidades federativas: RS");
  }
}