import java.util.Scanner;

public class QueNotaNecesito {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c1,c2;
        double c3;
        System.out.println("Ingrese nora certamen 1: ");
        c1 = leer.nextInt();
        System.out.println("Ingrese nora certamen 2: ");
        c2 = leer.nextInt();
        c3 = (c1 + c2) *33.3;
        double Nc;
        Nc = (c1 + c2 +c3 )/ 3;
        int Nl;
        System.out.println("Ingrese la nota del laboratorio: ");
        Nl = leer.nextInt();
        double Nf;
        Nf = (Nc * 0.7) + (Nl * 0.3); 
        if () {
            
        }
    }
}
