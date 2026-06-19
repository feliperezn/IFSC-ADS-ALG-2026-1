public class Rotaciona {
    void main() {

        String linha = IO.readln("Entre com os elementos: ");
        String[] partes = linha.split(" ");
        double[] elementos = new double[partes.length];

        String buffer = IO.readln("Entre com a rotação: ");
        int rotacao = Integer.parseInt(buffer);

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = Double.parseDouble(partes[i]);
        }

        IO.print("Antes: ");
        for (int i = 0; i < elementos.length; i++) {
            IO.print(elementos[i] + " ");
        }
        IO.println();

        rotaciona(elementos, rotacao);

        IO.print("Depois: ");
        for (int i = 0; i < elementos.length; i++) {
            IO.print(elementos[i] + " ");
        }
        IO.println();

        // rotacao 2
        // 3.2 6.5 3.1 8.9 2.4
        // 0 1 2 3 4

        // 8.9 2.4 3.2 6.5 3.1
        // 3 4 0 1 2

    }

    void rotaciona(double[] arranjo, int r) {

        int rotacao = r % arranjo.length;

        IO.println("Rotacao: " + rotacao);

        for (int i = 0; i < arranjo.length; i++) {
            if (arranjo[i] < rotacao) {
                arranjo[i] = arranjo[i + (rotacao + 1)];
            }
        }

        // 7 % 5 = 2;
        // -1 = 4
        // multiplo do numero de elementos não rotaciona

    }
}
