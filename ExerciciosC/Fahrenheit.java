void main() {
  String buffer;

  buffer = IO.readln("Entre com a temperatura em Fahrenheit: ");

  double temp_f = Double.parseDouble(buffer);

  double temp_c = ((temp_f - 32) * 5) / 9;

  IO.println("Temperatura em Celsius: " + String.format("%.1f", temp_c));
}