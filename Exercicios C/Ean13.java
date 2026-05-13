import java.util.Scanner;

void main() {
  java.util.Scanner sc = new Scanner(System.in);

  IO.print("Entre com a primeira parte (1 dígito): ");
  int n1 = sc.nextInt();

  String buffer;
  String[] partes;
  buffer = IO.readln("Entre com a segunda parte (6 dígitos): ");
  partes = buffer.split("");

  int n2 = Integer.parseInt(partes[0]);
  int n3 = Integer.parseInt(partes[1]);
  int n4 = Integer.parseInt(partes[2]);
  int n5 = Integer.parseInt(partes[3]);
  int n6 = Integer.parseInt(partes[4]);
  int n7 = Integer.parseInt(partes[5]);

  buffer = IO.readln("Entre com a terceira parte, sem o dígito verificador (5 dígitos):");
  partes = buffer.split("");

  int n8 = Integer.parseInt(partes[0]);
  int n9 = Integer.parseInt(partes[1]);
  int n10 = Integer.parseInt(partes[2]);
  int n11 = Integer.parseInt(partes[3]);
  int n12 = Integer.parseInt(partes[4]);

  int passo1 = n1 + n3 + n5 + n7 + n9 + n11;
  int passo2 = n2 + n4 + n6 + n8 + n10 + n12;
  int passo3 = 3 * passo2 + passo1;
  int passo4 = passo3 - 1;
  int passo5 = passo4 % 10;
  int passo6 = 9 - passo5;

  IO.println("Dígito verificador: " + passo6);

  sc.close();
}