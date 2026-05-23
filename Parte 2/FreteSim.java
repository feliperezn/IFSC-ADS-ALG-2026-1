import java.util.Scanner;

void main() {

    java.util.Scanner sc = new Scanner(System.in);

    String regiao = IO.readln("Entre com a região (S/E/0): ");
    int peso, prazo;
    double valorFrete;

    IO.print("Entre com o peso (g): ");
    peso = sc.nextInt();

    IO.print("Entre com o prazo (1/3/7): ");
    prazo = sc.nextInt();

    sc.close();

    valorFrete = switch (regiao) {
        case "S" -> 60;
        case "E" -> 50;
        case "0" -> 80;
        default -> throw new RuntimeException("Região inválida!");
    };

    if (peso >= 500 && peso <= 2000) {
        valorFrete += 15;
    } else if (peso > 2000 && peso <= 10000) {
        valorFrete += 25;
    } else if (peso > 10000) {
        valorFrete += 50 + (0.01 * (peso - 10000));
    }

    valorFrete = switch (prazo) {
        case 1 -> valorFrete = valorFrete * 2;
        case 3 -> valorFrete;
        case 7 -> valorFrete -= (valorFrete / 100 * 15);
        default -> throw new RuntimeException("Prazo inválido!");
    };

    IO.println("Valor do frete: R$ " + String.format("%.2f", valorFrete));

}

// regiao
// sul = 60
// sudeste = 50
// centro-oeste = 80

// peso
// 500 = sem
// 501-2000 = +15
// 2001-10000=25
// >10001=50 + (0,01*adicional)

// prazo
// express (1dia): dobro do preço
// rápido: preço normal
// normal: desconto de 15%

// pacote de 300g pro sul com entrega normal:
// 60 + 0 - 15%
