void main() {

    // IO.println(ehBissexto(ano));
    // IO.println(numDias(mes, ano));
    // IO.println(ehDataValida(dia, mes, ano));
    // IO.println(diasDecorridos(dia, mes, ano));

    String buffer = IO.readln("Entre com a data dd/mm/aaaa: ");
    String partes[] = buffer.split("/");

    int dia = Integer.parseInt(partes[0]);
    int mes = Integer.parseInt(partes[1]);
    int ano = Integer.parseInt(partes[2]);

    if (!ehDataValida(dia, mes, ano)) {
        throw new RuntimeException("Data inválida!");
    } else {
        IO.println("Dias decorridos: " + diasDecorridos(dia, mes, ano));
    }

}

boolean ehBissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
}

int numDias(int mes, int ano) {
    return switch (mes) {
        case 4, 6, 9, 11 -> 30;
        case 2 -> ehBissexto(ano) ? 29 : 28;
        default -> 31;
    };

}

boolean ehDataValida(int dia, int mes, int ano) {
    if (mes < 1 || mes > 12) {
        return false;
    }
    return (dia >= 1 && dia <= numDias(mes, ano));
}

int diasDecorridos(int dia, int mes, int ano) {
    int n = dia;

    if (mes > 1) {
        n += numDias(1, ano);
    }
    if (mes > 2) {
        n += numDias(2, ano);
    }
    if (mes > 3) {
        n += numDias(3, ano);
    }
    if (mes > 4) {
        n += numDias(4, ano);
    }
    if (mes > 5) {
        n += numDias(5, ano);
    }
    if (mes > 6) {
        n += numDias(6, ano);
    }
    if (mes > 7) {
        n += numDias(7, ano);
    }
    if (mes > 8) {
        n += numDias(8, ano);
    }
    if (mes > 9) {
        n += numDias(9, ano);
    }
    if (mes > 10) {
        n += numDias(10, ano);
    }
    if (mes > 11) {
        n += numDias(11, ano);
    }

    return n;
}
