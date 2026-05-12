void main() {
    IO.println(hav(1.5));
}


// Calcular valor do haverseno
Double hav(Double theta) {
    Double h = Math.pow(Math.sin(theta / 2), 2);
    return h;
}
