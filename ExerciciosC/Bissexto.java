void main() {

  // Um ano é bissexto se for divisível por 4. Mas essa regra tem uma exceção:
  // os anos divisíveis por 100, apesar de serem divisíveis por 4, não são
  // bissextos.
  // Porém, há uma exceção à exceção: os anos divisíveis por 400, apesar de serem
  // divisíveis por 100, são sim bissextos.

  int ano;
  boolean bissexto;
  String buffer;

  buffer = IO.readln("Entre com um ano: ");
  ano = Integer.parseInt(buffer);

  bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;

  IO.println("Ano bissexto: " + bissexto);

}