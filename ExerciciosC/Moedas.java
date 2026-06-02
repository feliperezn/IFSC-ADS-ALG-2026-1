void main() {
  String buffer;
  buffer = IO.readln("Entre com a quantidade de centavos: ");
  int centavos = Integer.parseInt(buffer);

  int moeda50 = centavos / 50;
  centavos = centavos - 50 * moeda50;
  int moeda25 = centavos / 25;
  centavos = centavos - 25 * moeda25;
  int moeda10 = centavos / 10;
  centavos = centavos - 10 * moeda10;
  int moeda5 = centavos / 5;
  centavos = centavos - 5 * moeda5;
  int moeda1 = centavos / 1;

  IO.println("Moedas de 50 centavos: " + (moeda50));
  IO.println("Moedas de 25 centavos: " + (moeda25));
  IO.println("Moedas de 10 centavos: " + (moeda10));
  IO.println("Moedas de 5 centavos: " + (moeda5));
  IO.println("Moedas de 1 centavo: " + (moeda1));

}