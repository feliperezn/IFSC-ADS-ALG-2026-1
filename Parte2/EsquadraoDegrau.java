void main() {
    String buffer = IO.readln("Entre com um número inteiro não negativo: ");
    int n = Integer.parseInt(buffer);

    IO.println(ehDegrau(n) == true ? "É agente do esquadrão do degrau!" : "Não é agente do esquadrão do degrau.");
}

boolean ehDegrau(int n) {
    int i = 1;
    int soma = 0;

    while (soma < n) {
        soma += i;
        i += 1;
    }

    return soma == n;
}