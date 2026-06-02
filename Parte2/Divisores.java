void main() {
    String buffer = IO.readln("Entre com um inteiro positivo: ");
    int n = Integer.parseInt(buffer);

    IO.print("[1");

    int p = 0;

    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            IO.print(+i);
            p++;
        }

    }

    IO.print(", " + n + "]");
    IO.println();
    IO.println(p == 0 ? "É primo" : "Não é primo");
}

// Entre com um inteiro positivo: 4
// Divisores: [1, 2, 4]
// Não é primo