void main() {
  int tentativas = 3;

  while (tentativas > 0) {
    String entrada = IO.readln("Entre com senha: ");
    int senhaDigitada = Integer.parseInt(entrada);

    if (validaSenha(senhaDigitada)) {
      IO.println("Acesso autorizado");
      break;
    } else {
      IO.println("Acesso negado (senha incorreta)");
      tentativas--;

      if (tentativas == 0) {
        IO.println("Sistema bloqueado");
      }

    }
  }
}

boolean validaSenha(int senhaDigitada) {
  final int SENHA = 314159;
  return senhaDigitada == SENHA;
}