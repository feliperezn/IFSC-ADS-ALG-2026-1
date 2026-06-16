public class HorariosVoo {
  void main() {
    String horarioAtual = IO.readln("Entre com o horário atual (HH:MM): ");
    IO.println(horarioAtual);

    final String[] PARTIDA = { "08:00", "09:43", "11:19", "12:47", "14:00", "15:45", "19:00", "21:45" };
    final String[] CHEGADA = { "10:16", "11:52", "13:31", "15:00", "16:08", "17:55", "21:20", "23:58" };

    IO.println(PARTIDA[3]);
    IO.println(CHEGADA[CHEGADA.length - 1]);

  }

  int horarioParaMinutos(String horario) {
    String[] partes = horario.split(":");
    int hh = Integer.parseInt(partes[0]);
    int mm = Integer.parseInt(partes[1]);

    return (hh * 60) + mm;
  }

}
