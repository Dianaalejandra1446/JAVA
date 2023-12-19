import java.util.Scanner;

public class PalabraMaslarga {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Palabra1;
        String Palabra2;
        int contador;
        int contador2;
        System.out.println("Ingrese Palabra 1: ");
        Palabra1 = leer.nextLine();
        contador=Palabra1.length();

        System.out.println("Ingrese Palabra 2: ");
        Palabra2 = leer.nextLine();
        contador2=Palabra2.length();

        if (contador > contador2) {
            int resultado = contador2 - contador;
            System.out.println("La palabra "+Palabra1+" tiene "+resultado+" letras mas que "+Palabra2);
        }else if (contador2 > contador) {
            int resultado = contador - contador2;
            System.out.println("La palabra "+Palabra2+" tiene "+resultado+" letras mas que "+Palabra1);
        }else if (contador == contador2) {
            System.out.println("Las dos palabras tienen el mismo largo");
        }
        

    
    }
}
