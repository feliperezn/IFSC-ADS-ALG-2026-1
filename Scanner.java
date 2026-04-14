import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha

    IO.print("Entre com seu peso e altura: ");

    String nome = sc.next();
    double peso = sc.nextDouble();
    double altura = sc.nextDouble();
    double imc = peso / (altura * altura);
    IO.println("Seu nome: " + nome);
    IO.println("Seu IMC: " + imc);
}