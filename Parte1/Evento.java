void main() {
    String horarioInicio = IO.readln("Entre com o horário de início (HH:MM): ");
    String horarioTermino = IO.readln("Entre com o horário de término (HH:MM): ");
    String duracao = duracaoEvento(horarioInicio, horarioTermino);
    IO.println("Duração do evento: " + duracao);
}

int horarioParaMinutos(String horario) {
    String[] partes = horario.split(":");
    int hh = Integer.parseInt(partes[0]);
    int mm = Integer.parseInt(partes[1]);
    int minutos = hh * 60 + mm;
    return minutos;
}

String minutosParaHorario(int minutos) {
    int hh = minutos / 60;
    int mm = minutos % 60;
    String horario = String.format("%02d:%02d", hh, mm);
    return horario;
}

String duracaoEvento(String horarioInicio, String horarioTermino) {
    int minutosInicio = horarioParaMinutos(horarioInicio);
    int minutosTermino = horarioParaMinutos(horarioTermino);
    int delta = minutosTermino - minutosInicio;
    if (delta <= 0) {
        delta += 24 * 60; // Quantidade de minutos em um dia
    }
    String duracao = minutosParaHorario(delta);
    return duracao;
}