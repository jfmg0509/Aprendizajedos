
// Definición de la clase Circulo
public class Circulo {

    // Atributo privado que representa el radio del círculo
    private int radio;

    // Constructor que recibe un valor inicial para el radio
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Método getter para obtener el valor del radio
    public int getRadio() {
        return radio;
    }

    // Método setter para modificar el valor del radio
    public void setRadio(int radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    // Fórmula: π * radio^2
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro (circunferencia) del círculo
    // Fórmula: 2 * π * radio
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
}