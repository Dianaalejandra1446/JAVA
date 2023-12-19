import java.util.Scanner;

public class ParteDecimal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        double numero = leer.nextDouble();
        double parte_decimal;
        if (numero < 0) {
            parte_decimal  = (numero - (int) numero)*-1;
        }else{
            parte_decimal  = numero - (int) numero;
        }
        System.out.print("Parte decimal: "+parte_decimal);
    }
}
