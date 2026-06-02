void main() {
    String buffer;
    double salario, horas, pagamento, total = 0.0;
    int i = 1;
    while (i <= 3) {
        buffer = IO.readln("Entre com o salário do colaborador " + i + ": ");
        salario = Double.parseDouble(buffer);

        buffer = IO.readln("Entre com as horas trabalhadas pelo colaborador " + i + ": ");
        horas = Double.parseDouble(buffer);

        pagamento = salario * horas;

        IO.println("Pagamento do colaborador " + i + ": R$ " + pagamento);
        total += pagamento;

        i++;
    }

    IO.println("Total de pagamentos: R$ " + total);
}