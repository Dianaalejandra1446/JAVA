import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Anno: ");
        int anno = leer.nextInt();
        /*Periodo de tiempo entre la fecha ingresada y la de ahora */
        /*Period.between diferencia entre dos fechas */
        Period edad = Period.between(LocalDate.of(anno, mes,dia), LocalDate.now());
        System.out.printf("Usted tiene %d años%n", edad.getYears());
    }
}
