
// Definición de la clase Cuadrado
public class Cuadrado {

    // Atributo privado que representa el lado del cuadrado
    private int lado;

    // Constructor que inicializa el valor del lado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Método getter: devuelve el valor actual del lado
    public int getLado() {
        return lado;
    }

    // Método setter: permite cambiar el valor del lado
    public void setLado(int lado) {
        this.lado = lado;
    }

    // Método que calcula el área del cuadrado
    // Fórmula: lado^2 (lado elevado al cuadrado)
    public double area() {
        return Math.pow(lado, 2);
    }

    // Método que calcula el perímetro del cuadrado
    // Fórmula: 4 * lado (la suma de los cuatro lados)
    public double perimetro() {
        return 4 * lado;
    }
}