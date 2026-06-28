void main() {
  Scanner sc = new Scanner(System.in);

  IO.println("Entre com o tamanho dos arranjos: ");
  int tamanhoArray = sc.nextInt();

  int[] xArray = new int[tamanhoArray];
  int[] yArray = new int[tamanhoArray];

  IO.println("Entre com os elementos do primeiro arranjo: ");
  for (int i = 0; i < xArray.length; i++) {
    xArray[i] = sc.nextInt();
  }

  IO.println("Entre com os elementos do segundo arranjo: ");
  for (int i = 0; i < yArray.length; i++) {
    yArray[i] = sc.nextInt();
  }

  int resultadoComparacao = comparaArranjos(xArray, yArray);

  String retorno = switch (resultadoComparacao) {
    case -1 -> "O primeiro arranjo possui mais números pares";
    case 1 -> "O segundo arranjo possui mais números pares";
    default -> "Os dois arranjos possuem a mesma quantidade de números pares";
  };

  IO.println(retorno);

  sc.close();
}

int contaPares(int array[]) {
  int qtdPares = 0;

  for (int i = 0; i < array.length; i++) {
    if ((array[i] % 2) == 0) {
      qtdPares += 1;
    }
  }

  return qtdPares;
}

int comparaArranjos(int xArray[], int yArray[]) {
  int qtdParXArr = contaPares(xArray);
  int qtdParYArr = contaPares(yArray);

  if (qtdParXArr > qtdParYArr) {
    return -1;
  } else if (qtdParYArr > qtdParXArr) {
    return 1;
  } else {
    return 0;
  }

}