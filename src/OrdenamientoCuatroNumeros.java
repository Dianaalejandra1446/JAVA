import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoCuatroNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1,numero2,numero3,numero4;
        System.out.println("Ingrese un numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = leer.nextInt();
        System.out.println("Ingrese un numero");
        numero3 = leer.nextInt();
        System.out.println("Ingrese un numero");
        numero4 = leer.nextInt();
        int numeros[] = {numero1,numero2,numero3,numero4};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
}
}