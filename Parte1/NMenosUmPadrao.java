void main() {
    String buffer;
    String[] partes;

    // Entradas
    buffer = IO.readln("Entre com as notas das provas: ");
    partes = buffer.split(" ");

    Double p1 = Double.parseDouble(partes[0]);
    Double p2 = Double.parseDouble(partes[1]);
    Double p3 = Double.parseDouble(partes[2]);

    buffer = IO.readln("Entre com as notas dos trabalhos: ");
    partes = buffer.split(" ");

    Double t1 = Double.parseDouble(partes[0]);
    Double t2 = Double.parseDouble(partes[1]);
    Double t3 = Double.parseDouble(partes[2]);

    // Cálculo nota das provas
    Double pMin = p1;

    if (p2 < pMin) {
        pMin = p2;
    }
    if (p3 < pMin) {
        pMin = p3;
    }

    Double media_provas = (p1 + p2 + p3 - pMin) / 2;

    // Cálculo nota dos trabalhos
    Double tMin = t1;

    if (t2 < tMin) {
        tMin = t2;
    }
    if (t3 < tMin) {
        tMin = t3;
    }

    // Cálculo média final
    Double media_trabalhos = (t1 + t2 + t3 - tMin) / 2;
    Double media_final = (0.8 * media_provas) + (0.2 * media_trabalhos);

    IO.println("Média final: " + String.format("%.1f", media_final));

}