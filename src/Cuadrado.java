public class Cuadrado {
    private int  lado;

    public Cuadrado(int  lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double area() {
        return Math.pow(lado, 2);
    }

    public double perimetro() {
        return 4 * lado;
    }
}
