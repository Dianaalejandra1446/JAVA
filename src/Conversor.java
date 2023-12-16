import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longuitud: ");
        int longuitud = leer.nextInt();
        double pulgadas = 2.54;
        System.out.println(longuitud + " cm = "+ pulgadas +" in");
    }
}
