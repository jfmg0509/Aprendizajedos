public class Trapecio {
    private int baseMayor;
    private int baseMenor;
    private int altura;

    public Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public int getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    public double perimetro() {
        // Asumimos que las longitudes de los lados no paralelos son iguales
        double lado = Math.sqrt(Math.pow((baseMayor - baseMenor) / 2.0, 2) + Math.pow(altura, 2));
        return baseMayor + baseMenor + 2 * lado;
    }
}
