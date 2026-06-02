// Responsabilidade Única

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

    Double media_provas = calcularMediaNMenosUm(p1, p2, p3);
    Double media_trabalhos = calcularMediaNMenosUm(t1, t2, t3);

    // Cálculo média final
    Double media_final = (0.8 * media_provas) + (0.2 * media_trabalhos);

    IO.println("Média final: " + String.format("%.1f", media_final));
}

Double calcularMediaNMenosUm(Double n1, Double n2, Double n3) {
    Double nMin = menor(n1, n2, n3);
    Double media = (n1 + n2 + n3 - nMin) / 2;
    return media;
}

Double menor(Double a, Double b, Double c) {
    Double min = a;

    if (b < min) {
        min = b;
    }
    if (c < min) {
        min = c;
    }

    return min;
}