import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("Hola, como esta " +nombre);

        System.out.println("Ingrese el valor de A: ");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de B: ");
        int b = leer.nextInt();
        int rta = a + b;
        System.out.println("El resultado es: "+rta);
        leer.close();
    }
}
