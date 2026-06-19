import java.util.Random;

public class Histograma {
    void main() {
        Random rnd = new Random();

        int[] histograma = new int[13];

        String buffer = IO.readln("Entre com o número de rolagens: ");
        int numRolagens = Integer.parseInt(buffer);

        for (int i = 1; i <= numRolagens; i++) {
            int dado1 = rnd.nextInt(1, 7);
            int dado2 = rnd.nextInt(1, 7);

            int soma = dado1 + dado2;

            histograma[soma] += 1;
        }

        for (int soma = 2; soma <= 12; soma++) {
            IO.println(String.format("%2d", soma)
                    + " : "
                    + String.format("%5.2f%%", (100.0 * histograma[soma] / numRolagens)));
        }
    }
}
