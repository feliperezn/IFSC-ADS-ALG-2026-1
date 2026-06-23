import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  IO.print("Entre com o número de alunos: ");
  int numAlunos = sc.nextInt();

  IO.print("Entre com o número de provas: ");
  int numProvas = sc.nextInt();

  double[] mediaAlunos = new double[numAlunos];

  for (int i = 0; i < numAlunos; i++) {
    double[] notas = new double[numProvas];
    for (int j = 0; j < numProvas; j++) {
      IO.print("Entre com a nota da prova " + (j + 1) + " do aluno " + (i + 1) + ": ");
      notas[j] = sc.nextDouble();
    }

    double somaNotas = 0;
    for (int n = 0; n < notas.length; n++) {
      somaNotas += notas[n];
    }

    double media = somaNotas / numProvas;
    if (media >= 6.0) {
      IO.println("Aluno " + (i + 1) + " APROVADO com média " + String.format("%.2f", media));
    } else {
      IO.println("Aluno " + (i + 1) + " REPROVADO com média " + String.format("%.2f", media));
    }

    mediaAlunos[i] = media;
  }

  sc.close();

  double somaNotasTurma = 0;
  for (int n = 0; n < mediaAlunos.length; n++) {
    somaNotasTurma += mediaAlunos[n];
  }

  IO.println("A média da turma foi: " + String.format("%.2f", (somaNotasTurma / numAlunos)));

}