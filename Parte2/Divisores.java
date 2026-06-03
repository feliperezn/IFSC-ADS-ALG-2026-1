void main() {
    String buffer = IO.readln("Entre com um inteiro positivo: ");
    int num = Integer.parseInt(buffer);

    int divCount = 0;

    IO.print("Divisores: [1");

    for (int i = 1; num >= i; i++) {
        if (num % i == 0 && i > 1) {
            IO.print("," + i);
            divCount++;
        }
    }

    IO.print("]");
    IO.println();
    IO.println(divCount == 0 ? "É primo" : "Não é primo");
}

// Entre com um inteiro positivo: 4
// Divisores: [1, 2, 4]
// Não é primo