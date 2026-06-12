import java.util.Scanner;

void main() {
  Scanner sc = new Scanner(System.in);

  IO.print("Entre com o diâmetro interno (cm): ");
  double dInt = sc.nextDouble();
  IO.print("Entre com o diâmetro externo (cm): ");
  double dExt = sc.nextDouble();
  IO.print("Entre com a espessura (cm): ");
  double espe = sc.nextDouble();
  IO.print("Entre com a densidade (g/cm³): ");
  double dens = sc.nextDouble();
  IO.print("Entre com o número de arruelas: ");
  int nArr = sc.nextInt();

  double massaTotal = calc_massa_arruela(dInt, dExt, espe, dens) * nArr;
  IO.println("Massa total: " + String.format("%.2f", massaTotal) + " g");

  sc.close();
}

double calc_area_circulo(double raio) {
  return 3.14159 * (Math.pow(raio, 2));
}

double calc_area_anel(double rInt, double rExt) {
  return calc_area_circulo(rExt) - calc_area_circulo(rInt);
}

double calc_massa_arruela(double d1, double d2, double espe, double dens) {
  double volume = calc_area_anel(d1 / 2, d2 / 2) * espe;
  double massa = volume * dens;
  return massa;
}