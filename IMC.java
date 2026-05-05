import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    double peso, altura, imc;

    IO.print("Digite seu peso (kg): ");
    peso = sc.nextDouble();
    IO.print("Digite sua altura (m): ");
    altura = sc.nextDouble();

    imc = peso / (altura * altura);

    IO.println("IMC: " + String.format("%.2f", imc) + " kg/m²");

    if (imc < 18.5) {
        IO.println("Classificação: Abaixo do peso");
    } else if (imc < 25) {
        IO.println("Classificação: Peso normal");
    } else if (imc < 30) {
        IO.println("Classificação: Sobrepeso");
    } else {
        IO.println("Classificação: Obesidade");
    }

    sc.close();
}