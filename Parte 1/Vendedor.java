import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in); // Não se preocupe com os detalhes dessa linha

    double remuneracao, salarioFixo, comissao, vendas;
    int avaliacao;

    IO.print("Entre com o total de vendas (R$): ");
    vendas = sc.nextDouble();
    IO.print("Entre com a avaliação de desempenho (1-10): ");
    avaliacao = sc.nextInt();

    salarioFixo = 2000;

    if (vendas >= 10000) {
        comissao = (vendas * 7) / 100;
    } else {
        comissao = (vendas * 5) / 100;
    }

    remuneracao = salarioFixo + comissao;

    if (avaliacao >= 8) {
        remuneracao += 500;
    }

    IO.println("Remuneração: R$ " + remuneracao);

    sc.close();
}

// final double SALARIO_FIXO = 2000;
// final double META = 10000;
// final double BONUS = 500;

// void main() {
// String buffer;
// double remuneracao, vendas;
// int avaliacao;

// buffer = IO.readln("Entre com o total de vendas (R$): ");
// vendas = Double.parseDouble(buffer);
// buffer = IO.readln("Entre com a avaliação de desempenho (1-10): ");
// avaliacao = Integer.parseInt(buffer);

// remuneracao = SALARIO_FIXO;

// if (vendas > META) {
// remuneracao += 0.07 * vendas;
// } else {
// remuneracao += 0.05 * vendas;
// }

// if (avaliacao >= 8) {
// remuneracao += BONUS;
// }

// IO.println("Remuneração: R$ " + String.format("%.2f", remuneracao));
// }