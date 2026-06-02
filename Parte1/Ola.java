void main() { /*
               * isso
               * é um comentário
               */
    // isso tbm é um comentário

    String nome = "Romário", nomeEscrito;
    int anoNascimento = 1983, mesNascimento = 10;
    double peso = 79.2;
    char caractere = '9';
    boolean estuda = true;

    IO.println(nome);
    IO.println(anoNascimento + " " + mesNascimento);
    IO.println(peso);
    IO.println(caractere);
    IO.println(estuda == false);

    IO.println("Olá, mundo!");

    /*
     * primitivo + primitivo = soma numérica
     * string + string = concatenação
     * string + primitivo:
     * - Primeiro , o primitivo é convertido para string
     * - Depois, ocorre a concatenação
     * 
     * O operator + é associativo à esquerda
     */

    IO.println("Há " + 1 + 2 + 3 + 4 + " pinos de boliche");
    IO.println("Há " + (1 + 2 + 3 + 4) + " pinos de boliche");

    nomeEscrito = IO.readln("Digite seu nome: ");
    IO.println(nomeEscrito);
}