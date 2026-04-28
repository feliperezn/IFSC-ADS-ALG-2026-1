void main() {
    String buffer;
    double horas, pagamento;
    
    buffer = IO.readln("Entre com as horas trabalhadas: ");
    horas = Double.parseDouble(buffer);
    
    pagamento = 50.0 * horas;
    
    if (horas > 8.0) {
        pagamento += 25.0 * (horas - 8.0);
    }
    
    IO.println(String.format("Pagamento: R$ %.2f", pagamento));
}