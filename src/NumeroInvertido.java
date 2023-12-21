import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        int invertido = 0;
        int resto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        while (numero > 0) {
             resto = numero % 10;
             invertido = ( invertido * 10) + resto;
            numero /= 10;
        }
        System.out.println("Numero invertido: "+ invertido);
    }
}