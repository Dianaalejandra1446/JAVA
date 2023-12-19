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
        
        double Nc =(c1 - c2) * 0.3;

        double Nf = (Nc * 0.7) + (Nl* 0.3);
        
        System.out.println("La nota necesaria en el tercer certamen es: "  );
    }
}
