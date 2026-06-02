import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com um inteiro de 1 a 99: ");
    int num = sc.nextInt();

    // Calcular dezena

    String dezena = switch (num / 10) {
        case 2 -> "vinte";
        case 3 -> "trinta";
        case 4 -> "quarenta";
        case 5 -> "cinquenta";
        case 6 -> "sessenta";
        case 7 -> "setenta";
        case 8 -> "oitenta";
        case 9 -> "noventa";
        default -> "salve";
    };

    String unidade = switch (num % 10) {
        case 1 -> "um";
        case 2 -> "dois";
        case 3 -> "três";
        case 4 -> "quatro";
        case 5 -> "cinco";
        case 6 -> "seis";
        case 7 -> "sete";
        case 8 -> "oito";
        case 9 -> "nove";
        default -> "dez";
    };

    if (num < 11) {
        IO.println("Número por extenso: \"" + unidade + "\"");
    } else if (num < 20) {
        String numero = switch (num) {
            case 11 -> "onze";
            case 12 -> "doze";
            case 13 -> "treze";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "dezesseis";
            case 17 -> "dezessete";
            case 18 -> "dezoito";
            default -> "dezenove";
        };
        IO.println("Número por extenso: \"" + numero + "\"");
    } else {
        IO.println("Número por extenso: \"" + dezena + " e " + unidade + "\"");
    }

    sc.close();
}