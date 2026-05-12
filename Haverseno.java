void main() {
    String buffer;
    String[] partes;

    double lat1, lon1, lat2, lon2;

    buffer = IO.readln("Entre com lat e lon do ponto 1: ");
    partes = buffer.split(" ");

    lat1 = Double.parseDouble(partes[0]);
    lon1 = Double.parseDouble(partes[1]);

    buffer = IO.readln("Entre com lat e lon do ponto 2: ");
    partes = buffer.split(" ");

    lat2 = Double.parseDouble(partes[0]);
    lon2 = Double.parseDouble(partes[1]);

    double distancia = distanciaNaTerra(lat1, lon1, lat2, lon2);
    IO.println("Distancia: " + distancia);

}

// Calcular valor do haverseno
double hav(double theta) {
    double h = Math.pow(Math.sin(theta / 2), 2);
    return h;
}

// Calcular distância
double distanciaNaTerra(double lat1, double lon1, double lat2, double lon2) {
    double distancia_sqrt = Math.sqrt(hav(Math.toRadians(lat2) - Math.toRadians(lat1)) + (Math.cos(Math.toRadians(lat1))
            * Math.cos(Math.toRadians(lat2)) * hav(Math.toRadians(lon2) - Math.toRadians(lon1))));
    double distancia = (6371.0 * 2) * Math.asin(distancia_sqrt);
    return distancia;
}