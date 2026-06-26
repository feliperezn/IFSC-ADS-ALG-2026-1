void main() {
    String buffer = IO.readln("Entre com um inteiro positivo: ");
    int num = Integer.parseInt(buffer);
    int pers = 0;

    IO.print(num);

    while (num >= 10) {
        num = somaDigitos(num);
        IO.print(" -> " + num);
        pers++;
    }
    IO.println();
    IO.println("Persistência aditiva: " + pers);
    IO.println("Raíz digital: " + num);

}

int somaDigitos(int num) {
    int soma = 0;

    while (num > 0) {
        int digito = num % 10;
        num = num / 10;
        soma += digito;
    }

    return soma;
}