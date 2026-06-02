import java.util.Random;

void main() {
    Random rnd = new Random();
    int segredo = rnd.nextInt(100) + 1;
    int palpite, tentativas = 0;

    do {
        tentativas++;
        String buffer = IO.readln("Entre com seu palpite (1 a 100): ");
        palpite = Integer.parseInt(buffer);

        if (palpite > segredo) {
            IO.println("O segredo é menor!");
        } else if (palpite < segredo) {
            IO.println("O segredo é maior!");
        } else {
            IO.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
        }

    } while (palpite != segredo);
}