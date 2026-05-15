void main() {
  String buffer;
  int horas, minutos, segundos;

  buffer = IO.readln("Entre com a quantidade de segundos: ");
  segundos = Integer.parseInt(buffer);

  horas = segundos / 3600;
  segundos = segundos % 3600;
  minutos = segundos / 60;
  segundos = segundos % 60;

  if (horas > 0) {
    IO.print(horas + " " + (horas == 1 ? "hora" : "horas"));
    if (minutos > 0 || segundos > 0) {
      IO.print(", ");
    }
  }

  if (minutos > 0) {
    IO.print(minutos + " " + (minutos == 1 ? "minuto" : "minutos"));
    if (segundos > 0) {
      IO.print(", ");
    }
  }

  if (segundos > 0) {
    IO.print(segundos + " " + (segundos == 1 ? "segundo" : "segundos"));
  }

  IO.println();
}