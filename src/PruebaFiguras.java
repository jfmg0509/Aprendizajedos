public class PruebaFiguras {
    public static void main(String[] args){
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1, 2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
    Trapecio figura5 = new Trapecio(2, 3, 5);
    System.out.println("El área del círculo es = "+ figura1.area());
    System.out.println("El perímetro del círculo es = "+ figura1.perimetro());
    System.out.println();
    System.out.println("El área del rectángulo es = "+ figura2.area());
    System.out.println("El perímetro del rectángulo es = "+ figura2.perimetro());
    System.out.println();
    System.out.println("El área del cuadrado es = "+ figura3.area());
    System.out.println("El perímetro del cuadrado es = "+ figura3.perimetro());
    System.out.println();
    System.out.println("El área del triángulo rectángulo es = "+ figura4.area());
    System.out.println("El perímetro del triángulo rectángulo es = "+ figura4.perimetro());
    figura4.determinartipoTriangulo();
    System.out.println();
    System.out.println("El área del trapecio es = "+ figura5.area());
    System.out.println("El perímetro del trapecio es = "+ figura5.perimetro());
    }
}
