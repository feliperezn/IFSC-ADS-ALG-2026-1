void main() {
    String linha;
    double peso;

    do {
        linha = IO.readln("Seu peso: ");
        peso = Double.parseDouble(linha);
    } while (peso <= 0.0);

    // Nesse ponto, peso > 0
}