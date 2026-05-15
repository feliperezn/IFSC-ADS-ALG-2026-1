void main() {
  String buffer;
  int horas, minutos, segundos;

  buffer = IO.readln("Entre com a quantidade de segundos: ");
  segundos = Integer.parseInt(buffer);

  horas = segundos / 3600;
  segundos = segundos - (horas * 3600);

  minutos = segundos / 60;
  segundos = segundos - (minutos * 60);

  if (horas > 0) { // ---------------- HORAS > 0 ----------------
    if (horas == 1) {
      IO.print("1 hora");
    } else {
      IO.print(horas + " horas");
    }
    if (minutos > 0 || segundos > 0) {
      IO.print(", ");
    }
  }

  if (minutos > 0) { // ---------------- MINUTOS > 0----------------
    if (minutos == 1) {
      IO.print("1 minuto");
    } else {
      IO.print(minutos + " minutos");
    }
    if (segundos > 0) {
      IO.print(", ");
    }
  }

  if (segundos > 0) { // ---------------- SEGUNDOS > 0----------------
    if (segundos == 1) {
      IO.print("1 segundo");
    } else {
      IO.print(segundos + " segundos");
    }
  }
}