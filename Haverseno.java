void main() {
    String buffer;
    String[] partes;

    buffer = IO.readln("Entre com lat e lon do ponto 1: ");
    partes = buffer.split(" ");

    double lat1 = Double.parseDouble(partes[0]);
    double lon1 = Double.parseDouble(partes[1]);

    buffer = IO.readln("Entre com lat e lon do ponto 2: ");
    partes = buffer.split(" ");

    double lat2 = Double.parseDouble(partes[0]);
    double lon2 = Double.parseDouble(partes[1]);

    double lat1R = Math.toRadians(lat1);
    double lon1R = Math.toRadians(lon1);
    double lat2R = Math.toRadians(lat2);
    double lon2R = Math.toRadians(lon2);

    double distancia = distanciaNaTerra(lat1R, lon1R, lat2R, lon2R);
    IO.println("Distância: " + String.format("%.1f", distancia) + " km");
}

// Calcular valor do haverseno
double hav(double theta) {
    double h = Math.pow(Math.sin(theta / 2), 2);
    return h;
}

// Calcular distância
double distanciaNaTerra(double lat1, double lon1, double lat2, double lon2) {
    double distancia_sqrt = Math.sqrt(hav(lat2 - lat1) + (Math.cos(lat1) * Math.cos(lat2) * hav(lon2 - lon1)));
    double distancia = (6371.0 * 2) * Math.asin(distancia_sqrt);
    return distancia;
}