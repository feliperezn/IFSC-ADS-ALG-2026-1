import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com a quantidade de segundos: ");
    int segundos = sc.nextInt();
    sc.close();

    int minutos_h = segundos / 60;
    int horas = minutos_h / 60;

    segundos -= horas * 60 * 60;
    int minutos = segundos / 60;

    segundos -= minutos * 60;

    String horasString = horas > 1 ? "horas" : "hora";
    String minString = minutos > 1 ? "minutos" : "minuto";
    String segString = segundos > 1 ? "segundos" : "segundo";

    segString = segundos + " " + segString;
    minString = minutos + " " + minString;
    horasString = horas + " " + horasString;

    if (horas == 0 && minutos == 0) { // Apenas segundos
        IO.println(segString);
    } else if (horas == 0 && minutos != 0 && segundos == 0) { // Apenas Minutos
        IO.println(minString);
    } else if (horas != 0 && minutos == 0 && segundos == 0) { // Apenas horas
        IO.println(horasString);
    } else if (horas == 0 && minutos != 0 && segundos != 0) { // Minutos e segundos
        IO.println(minString + ", " + segString);
    } else if (horas != 0 && minutos == 0 && segundos != 0) { // Horas e segundos
        IO.println(horasString + " " + segString);
    } else if (horas != 0 && minutos != 0 && segundos == 0) { // Horas e minutos
        IO.println(horasString + ", " + minString);
    } else {
        IO.println(horasString + ", " + minString + ", " + segString);
    }
}