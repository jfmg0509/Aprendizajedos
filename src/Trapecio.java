
// Definición de la clase Trapecio
public class Trapecio {
    
    // Atributos privados: bases y altura del trapecio
    private int baseMayor;
    private int baseMenor;
    private int altura;

    // Constructor que inicializa los valores de base mayor, base menor y altura
    public Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    // Método getter: devuelve el valor de la base mayor
    public int getBaseMayor() {
        return baseMayor;
    }

    // Método setter: modifica el valor de la base mayor
    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    // Método getter: devuelve el valor de la base menor
    public int getBaseMenor() {
        return baseMenor;
    }

    // Método setter: modifica el valor de la base menor
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    // Método getter: devuelve el valor de la altura
    public int getAltura() {
        return altura;
    }

    // Método setter: modifica el valor de la altura
    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para calcular el área del trapecio
    // Fórmula: ((baseMayor + baseMenor) * altura) / 2
    public double area() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    // Método para calcular el perímetro del trapecio
    // Asume que los lados no paralelos (los inclinados) son iguales
    // Se usa el teorema de Pitágoras para calcular uno de los lados inclinados
    public double perimetro() {
        // Se calcula la mitad de la diferencia entre las bases para formar un triángulo rectángulo
        double lado = Math.sqrt(Math.pow((baseMayor - baseMenor) / 2.0, 2) + Math.pow(altura, 2));
        // El perímetro es la suma de las dos bases más dos veces el lado inclinado
        return baseMayor + baseMenor + 2 * lado;
    }
}