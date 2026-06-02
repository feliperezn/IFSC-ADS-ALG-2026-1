void main() {
    String buffer = IO.readln("Entre com a quantidade de centavos: ");
    int centavos = Integer.parseInt(buffer);

    int m50 = centavos / 50;
    centavos = centavos % 50;

    int m25 = centavos / 25;
    centavos %= 25;

    int m10 = centavos / 10;
    centavos %= 10;

    int m5 = centavos / 5;
    centavos %= 5;

    IO.println("Moedas de 50 centavos: " + m50);
    IO.println("Moedas de 25 centavos: " + m25);
    IO.println("Moedas de 10 centavos: " + m10);
    IO.println("Moedas de 5 centavos: " + m5);
    IO.println("Moedas de 1 centavo: " + centavos);

}