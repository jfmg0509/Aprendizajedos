public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area() {
        return (base * altura) / 2.0;
    }

    public double perimetro() {
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
    }

    public void determinartipoTriangulo() {
    int hipotenusa = (int) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

    if (base == altura && altura == hipotenusa) {
        System.out.println("El triángulo es Equilátero.");
    } else if (base == altura || altura == hipotenusa || base == hipotenusa) {
        System.out.println("El triángulo es Isósceles.");
    } else {
        System.out.println("El triángulo es Escaleno.");
    }
}
}