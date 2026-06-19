import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    String buffer = IO.readln("Entre com o número de itens: ");
    int numItens = Integer.parseInt(buffer);

    int[] itensQtd = new int[numItens + 1];
    double[] itensPreco = new double[numItens + 1];

    for (int i = 0; i < numItens; i++) {
        IO.print("Quantidade do item " + (i + 1) + ": ");
        itensQtd[i] = sc.nextInt();
        IO.print("Preço unitário do item " + (i + 1) + ": ");
        itensPreco[i] = sc.nextDouble();
    }

    IO.print("Desconto (%): ");
    double desconto = sc.nextDouble();

    IO.println("Total: R$ " + obtemSomaTotal(calculaSubtotais(itensQtd, itensPreco), desconto));

    sc.close();
}

double[] calculaSubtotais(int[] quantidades, double[] precos) {
    // recebe os arranjos de quantidades e de preços unitários
    // retorna um arranjo com subtotal de cada item
    double subtotal[] = new double[quantidades.length];

    for (int i = 0; i < quantidades.length; i++) {
        subtotal[i] = quantidades[i] * precos[i];
    }

    return subtotal;

}

double obtemSomaTotal(double[] valores, double desconto) {
    double soma = 0;

    for (int i = 0; i < valores.length; i++) {
        soma += valores[i];
    }

    return soma * (1 - desconto / 100.0);
}
