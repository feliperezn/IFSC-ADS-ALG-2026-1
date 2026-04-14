void main() {
    String entrada;
    int n;
    // ler a entrada do teclado
    entrada = IO.readln("Entre com um inteiro: ");
    // n recebe o valor da entrada e altera para int
    n = Integer.parseInt(entrada);
    // Exibe o n
    IO.println("O dobro é " + 2 * n);
        
    // inicializando a variável
    entrada = IO.readln("Entre com seu peso: ");
    // peso recebe o valor da entrada e altera para double
    double peso = Double.parseDouble(entrada);
    // entrada recebe o valor da altura
    entrada = IO.readln("Entre com sua altura: ");
    // altura recebe o valor da entrada e altera para double
    double altura = Double.parseDouble(entrada);
    // variavel imc recebe o calculo do imc
    double imc = peso / (altura * altura);
    // exibe o imc
    IO.println("Seu IMC: " + imc);
}