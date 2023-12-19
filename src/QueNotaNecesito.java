import java.util.Scanner;

public class QueNotaNecesito {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese nota certamen 1: ");
        int c1 = leer.nextInt();
        
        System.out.println("Ingrese nota certamen 2: ");
        int c2 = leer.nextInt();
        
        System.out.println("Ingrese nota laboratorio: ");
        int Nl = leer.nextInt();
        
        double Nc = (c1 + c2 + 3 * (60 - 0.3 * Nl)) / 3;

        double Nf = 0.7 * Nc + 0.3 * Nl;
        
        System.out.println("La nota necesaria en el tercer certamen es: " + ((60 - 0.7 * Nc) / 0.3));
    }
}
