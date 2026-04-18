import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);  // Não se preocupe com os detalhes dessa linha

    IO.print("Entre com nome: ");

    String nome = sc.next();

    IO.print("Entre com peso: ");
    double peso = sc.nextDouble();

    IO.print("Entre com sua altura: ");
    double altura = sc.nextDouble();

    double imc = peso / (altura * altura);
    
    IO.println("Seu nome: " + nome);
    IO.println("Seu IMC: " + imc);

    sc.close();
}