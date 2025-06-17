
// Definición de la clase TrianguloRectangulo
public class TrianguloRectangulo {

    // Atributos privados: base y altura del triángulo
    private int base;
    private int altura;

    // Constructor: inicializa los valores de base y altura
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método getter: devuelve el valor de la base
    public int getBase() {
        return base;
    }

    // Método setter: modifica el valor de la base
    public void setBase(int base) {
        this.base = base;
    }

    // Método getter: devuelve el valor de la altura
    public int getAltura() {
        return altura;
    }

    // Método setter: modifica el valor de la altura
    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para calcular el área del triángulo rectángulo
    // Fórmula: (base * altura) / 2
    public double area() {
        return (base * altura) / 2.0;
    }

    // Método para calcular el perímetro del triángulo rectángulo
    // Suma de base, altura e hipotenusa (calculada con teorema de Pitágoras)
    public double perimetro() {
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return base + altura + hipotenusa;
    }

    // Método para determinar el tipo de triángulo según sus lados
    public void determinartipoTriangulo() {
        // Se calcula la hipotenusa como la raíz cuadrada de (base² + altura²)
        int hipotenusa = (int) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        // Se determina el tipo de triángulo comparando los lados
        if (base == altura && altura == hipotenusa) {
            // Todos los lados son iguales
            System.out.println("El triángulo es Equilátero.");
        } else if (base == altura || altura == hipotenusa || base == hipotenusa) {
            // Al menos dos lados son iguales
            System.out.println("El triángulo es Isósceles.");
        } else {
            // Todos los lados son diferentes
            System.out.println("El triángulo es Escaleno.");
        }
    }
}