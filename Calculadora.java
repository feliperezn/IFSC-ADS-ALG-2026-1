void main() {
    String buffer;
    String[] partes;
    buffer = IO.readln("Entre com a expressão: ");
    partes = buffer.split(" ");

    Double x = Double.parseDouble(partes[0]);
    String operador = partes[1];
    Double y = Double.parseDouble(partes[2]);

    if (operador.equals("/") && y == 0.0) {
        throw new RuntimeException("Divisão por zero");
    }

    Double resultado = switch (operador) {
        case "+" -> (x + y);
        case "-" -> (x - y);
        case "*" -> (x * y);
        case "/" -> (x / y);
        default -> throw new RuntimeException("Operador " + operador + " in");
    };

    IO.println("Resultado: " + resultado);

}

// void main() {
// Double n1, n2;
// String[] partes;

// String input = IO.readln("Entre com a expressão: ");
// partes = input.split(" ");

// n1 = Double.parseDouble(partes[0]);
// n2 = Double.parseDouble(partes[2]);
// String operacao = partes[1];

// Double resultado = switch (operacao) {
// case "+" -> (n1 + n2);
// case "-" -> (n1 - n2);
// case "*" -> (n1 * n2);
// case "/" -> (n1 / n2);
// default -> 0.0;
// };

// if (operacao == "/" && n2 == 0.0) {
// IO.println("Erro: Divisão por zero");
// }

// IO.println("Resultado: " + resultado);

// }