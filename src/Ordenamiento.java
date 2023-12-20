import java.util.Scanner;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("Ingrese numero: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese numero: ");
        numero2 = leer.nextInt();
        if (numero1 < numero2) {
            System.out.println(numero1+" "+ numero2);
        }else if (numero2 < numero1) {
            System.out.println(numero2+ " "+ numero1);
        }else{
            System.out.println("Ingrese un numero entero");
        }
    }
}
