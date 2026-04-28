void main() {
    String buffer;
    int n;
    buffer = IO.readln("Entre com um número inteiro: ");
    n = Integer.parseInt(buffer);
    if (n > 0) {
        IO.println("Positivo");
    } else if (n < 0) {
        IO.println("Negativo");
    } else {
        IO.println("Zero");
    }
}