import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    String regiao = IO.readln("Entre com a região (S/SE/CO): ");
    IO.print("Entre com o peso (kg) e prazo (1/3/7): ");
    double peso = sc.nextDouble();
    int prazo = sc.nextInt();

    sc.close();
    IO.println("Valor do Frete: R$ " + calculaFrete(regiao, peso, prazo));

}

double obtemPrecoBase(String regiao) {
    return switch (regiao) {
        case "S" -> 60;
        case "SE" -> 50;
        case "CO" -> 80;
        default -> throw new RuntimeException("Região inválida!");
    };
}

double calculaAdicional(double peso) {

    peso *= 1000;

    if (peso > 0 && peso <= 500) {
        return 0;
    } else if (peso > 500 && peso <= 2000) {
        return 15;
    } else if (peso > 2000 && peso <= 10000) {
        return 25;
    } else if (peso > 10000) {
        return 50 + ((peso - 10000) * 0.01);
    } else {
        throw new RuntimeException("Peso inválido!");
    }
}

double aplicaPrazo(double valorPadrao, int prazo) {

    return switch (prazo) {
        case 1 -> valorPadrao *= 2;
        case 3 -> valorPadrao += 0;
        case 7 -> valorPadrao *= 0.85; // Desconto de 15%
        default -> throw new RuntimeException("Prazo inválido!");
    };
}

double calculaFrete(String regiao, double peso, int prazo) {
    double valorFinal = obtemPrecoBase(regiao) + calculaAdicional(peso);
    return aplicaPrazo(valorFinal, prazo);
}