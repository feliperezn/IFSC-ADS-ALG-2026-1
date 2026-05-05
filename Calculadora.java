void main() {
    Double n1, n2;
    String[] partes;

    String input = IO.readln("Entre com a expressão: ");
    partes = input.split(" ");

    n1 = Double.parseDouble(partes[0]);
    n2 = Double.parseDouble(partes[2]);
    String operacao = partes[1];

    Double resultado = switch (operacao) {
        case "+" -> (n1 + n2);
        case "-" -> (n1 - n2);
        case "*" -> (n1 * n2);
        case "/" -> (n1 / n2);
        default -> 0.0;
    };

    if (operacao == "/" && n2 == 0.0) {
        IO.println("Erro: Divisão por zero");
    }

    IO.println("Resultado: " + resultado);

}