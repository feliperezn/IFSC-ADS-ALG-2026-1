void main() {
    final double VALOR_INICIAL = 10000.0;
    final double TAXA_INICIAL = 6.0;
    final double PASSO_TAXA = 0.5;
    final int NUM_TAXAS = 5;
    final int NUM_ANOS = 10;

    double[] taxa = new double[NUM_TAXAS];
    double[] valor = new double[NUM_TAXAS];

    IO.print("Ano ");

    for (int i = 0; i < NUM_TAXAS; i++) {
        valor[i] = VALOR_INICIAL;
        taxa[i] = (TAXA_INICIAL + i * PASSO_TAXA) / 100;

        IO.print("  " + String.format("%.1f", taxa[i] * 100.0) + "     ");
    }

    IO.println();

    for (int ano = 1; ano <= NUM_ANOS; ano++) {
        IO.print(ano + "   ");

        for (int i = 0; i < NUM_TAXAS; i++) {
            double rendimento = valor[i] * taxa[i];
            valor[i] += rendimento;

            IO.print("  " + String.format("%.1f", valor[i]) + " ");
        }

        IO.println();
    }

}