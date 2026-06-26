void main() {
    String buffer = IO.readln("Entre com um inteiro positivo: ");
    int num = Integer.parseInt(buffer);

    IO.println(ehCapicua(num) ? "É capicua" : "Não é capicua");
}

int inverteNumero(int num) {
    int numeroInvertido = 0;
    while (num > 0) {
        int digito = num % 10;
        num /= 10;
        // numeroInvertido *= 10;
        // numeroInvertido += digito;
        numeroInvertido = (numeroInvertido * 10) + digito;
    }
    return numeroInvertido;
}

boolean ehCapicua(int num) {
    return num == inverteNumero(num);
}