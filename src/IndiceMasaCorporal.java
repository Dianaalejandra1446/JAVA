import java.util.Scanner;

public class IndiceMasaCorporal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        int Peso = leer.nextInt();
        System.out.println("Ingrese su estatura");
        double Estatura = leer.nextDouble();
        System.out.println("Ingrese su edad");
        int Edad = leer.nextInt();
        double IMC = Peso / (Math.pow(Estatura, 2));
        if (Edad < 45 && IMC < 22.0) {
            System.out.println("Indice de Masa corporal Bajo");
        }else if (Edad < 45 && IMC >= 22.0) {
            System.out.println("Indice de Masa corporal Medio");
        }else if (Edad >= 45 && IMC < 22.0) {
            System.out.println("Indice de Masa corporal Medio");
        }else if (Edad >= 45 && IMC >= 22.0) {
             System.out.println("Indice de Masa corporal Alto");
        }else{
             System.out.println("Ingrese los valores adecuados");
        }
    }
}
