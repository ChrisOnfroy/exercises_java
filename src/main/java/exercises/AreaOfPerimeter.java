package exercises;

import java.util.Scanner;

public class AreaOfPerimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite el ancho del rectangulo: ");
        double Ancho = input.nextDouble();

        System.out.println("Digite la Altura del rectangulo: ");
        double Alto = input.nextDouble();

        double Area = (Ancho*Alto);

        double Perimetro = 2*(Ancho+Alto);

        System.out.println("El area de un rectangulo es: "+ Area);
        System.out.println("El perimetro de un rectangulo es: "+ Perimetro);

    }
}
