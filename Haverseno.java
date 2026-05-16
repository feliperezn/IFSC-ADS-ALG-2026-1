import java.util.Scanner;

void main() {
    java.util.Scanner sc = new Scanner(System.in);

    IO.print("Entre com lat e lon do ponto 1: ");
    double lat1R = Math.toRadians(sc.nextDouble());
    double lon1R = Math.toRadians(sc.nextDouble());

    IO.print("Entre com lat e lon do ponto 2: ");
    double lat2R = Math.toRadians(sc.nextDouble());
    double lon2R = Math.toRadians(sc.nextDouble());

    IO.println("Distância: " + String.format("%.2f", distanciaNaTerra(lat1R, lon1R, lat2R, lon2R)) + " km");

    sc.close();
}

// Calcular valor do haverseno
double hav(double theta) {
    return Math.pow(Math.sin(theta / 2), 2);
}

// Calcular distância
double distanciaNaTerra(double lat1, double lon1, double lat2, double lon2) {
    final double RAIO_TERRA = 6371.0;
    double radicando = hav(lat2 - lat1) + (Math.cos(lat1) * Math.cos(lat2) * hav(lon2 - lon1));
    double distancia_sqrt = Math.sqrt(radicando);
    double distancia = (RAIO_TERRA * 2) * Math.asin(distancia_sqrt);
    return distancia;
}