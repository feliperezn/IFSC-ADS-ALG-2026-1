import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com o valor negociado: ");
    double valor = sc.nextDouble();

    double comissao;

    // comissao = (valor < 2500) ? (valor*0.017)+30 : b;

    if (valor < 2500) {
        comissao = (valor * 0.017) + 30;
        comissao = comissao < 39 ? 39 : comissao;
    } else if (valor < 6250) {
        comissao = (valor * 0.0066) + 56;
    } else if (valor < 20000) {
        comissao = (valor * 0.0034) + 76;
    } else if (valor < 50000) {
        comissao = (valor * 0.0022) + 100;
    } else if (valor < 500000) {
        comissao = (valor * 0.0011) + 155;
    } else {
        comissao = (valor * 0.0009) + 255;
    }

    IO.println("Taxa de corretagem: $" + String.format("%.2f", comissao));

    sc.close();
}