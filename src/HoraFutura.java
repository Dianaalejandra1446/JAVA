import java.util.Scanner;

public class HoraFutura{
    public static void main(String arg[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese hora actual: ");
        int hora_actual = leer.nextInt();
        System.out.println("Ingrese cantidad de horas: ");
        int cantidad_hora = leer.nextInt();

        int horaFutura = (hora_actual + cantidad_hora) % 12;

        System.out.println("En "+cantidad_hora+" horas, el reloj marcara las "+horaFutura);
    }
}