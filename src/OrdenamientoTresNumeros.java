import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoTresNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1,numero2,numero3;
        System.out.println("Ingrese numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese numero");
        numero2 = leer.nextInt();
        System.out.println("Ingrese numero");
        numero3 = leer.nextInt();
        int [] numeros = {numero1,numero2,numero3};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        
    }
}
