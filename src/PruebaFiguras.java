
// Clase principal que contiene el método main para probar diferentes figuras geométricas
public class PruebaFiguras {
    
    // Método principal donde se ejecuta el programa
    public static void main(String[] args){
        
        // Se crea un objeto de tipo Circulo con radio 2
        Circulo figura1 = new Circulo(2);
        
        // Se crea un objeto de tipo Rectangulo con base 1 y altura 2
        Rectangulo figura2 = new Rectangulo(1, 2);
        
        // Se crea un objeto de tipo Cuadrado con lado 3
        Cuadrado figura3 = new Cuadrado(3);
        
        // Se crea un objeto de tipo TrianguloRectangulo con base 3 y altura 5
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        
        // Se crea un objeto de tipo Trapecio con base mayor 2, base menor 3 y altura 5
        Trapecio figura5 = new Trapecio(2, 3, 5);

        // Se imprime el área y el perímetro del círculo
        System.out.println("El área del círculo es = " + figura1.area());
        System.out.println("El perímetro del círculo es = " + figura1.perimetro());
        System.out.println(); // Línea en blanco para separar salidas

        // Se imprime el área y el perímetro del rectángulo
        System.out.println("El área del rectángulo es = " + figura2.area());
        System.out.println("El perímetro del rectángulo es = " + figura2.perimetro());
        System.out.println();

        // Se imprime el área y el perímetro del cuadrado
        System.out.println("El área del cuadrado es = " + figura3.area());
        System.out.println("El perímetro del cuadrado es = " + figura3.perimetro());
        System.out.println();

        // Se imprime el área y el perímetro del triángulo rectángulo
        System.out.println("El área del triángulo rectángulo es = " + figura4.area());
        System.out.println("El perímetro del triángulo rectángulo es = " + figura4.perimetro());

        // Se determina el tipo de triángulo (equilátero, isósceles o escaleno)
        figura4.determinartipoTriangulo();
        System.out.println();

        // Se imprime el área y el perímetro del trapecio
        System.out.println("El área del trapecio es = " + figura5.area());
        System.out.println("El perímetro del trapecio es = " + figura5.perimetro());
    }
}
