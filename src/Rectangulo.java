
// Definición de la clase Rectangulo
public class Rectangulo {

    // Atributos privados: base y altura del rectángulo
    private int base;
    private int altura;

    // Constructor: inicializa los valores de base y altura
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método getter: devuelve el valor de la base
    public int getBase() {
        return base;
    }

    // Método setter: permite modificar el valor de la base
    public void setBase(int base) {
        this.base = base;
    }

    // Método getter: devuelve el valor de la altura
    public int getAltura() {
        return altura;
    }

    // Método setter: permite modificar el valor de la altura
    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    // Fórmula: base * altura
    public double area() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    // Fórmula: 2 * (base + altura)
    public double perimetro() {
        return 2 * (base + altura);
    }
}