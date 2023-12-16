import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el cateto A: ");
        int catetoA = leer.nextInt();
        System.out.println("Ingrese el cateto B");
        int catetoB = leer.nextInt();
        double hipotenusa = Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));
        System.out.println("Su hipotenusa es: "+hipotenusa);
    }
}
