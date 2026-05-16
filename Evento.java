void main() {
    // String buffer;
    // String[] partes;

    // buffer = IO.readln("Entre com o horário de início (HH:MM): ");
    // partes = buffer.split(":");

    // int horaInicio = Integer.parseInt(partes[0]);
    // int minInicio = Integer.parseInt(partes[1]);

    // buffer = IO.readln("Entre com o horário de início (HH:MM): ");
    // partes = buffer.split(":");

    // int horaFim = Integer.parseInt(partes[0]);
    // int minFim = Integer.parseInt(partes[1]);

    IO.println(minutosParaHorarios(580));
    IO.println(minutosParaHorarios(690));
    IO.println(duracaoDoEvento("09:40", "11:30"));

}

int horarioParaMinutos(String horario) {
    String[] partes = horario.split(":");
    int hh = Integer.parseInt(partes[0]);
    int mm = Integer.parseInt(partes[1]);

    return (hh * 60) + mm;
}

String minutosParaHorarios(int x) {
    return String.format("%02d:%02d", x / 60, x % 60);
}

String duracaoDoEvento(String horarioInicio, String horarioTermino) {
    int duracaoMin = horarioParaMinutos(horarioTermino) - horarioParaMinutos(horarioInicio);
    String duracao = minutosParaHorarios(duracaoMin);
    return duracao;
}