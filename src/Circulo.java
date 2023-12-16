public class Circulo {
    public static void main (String arg[]){
/*         System.out.println(arg[0]);
        System.out.println(arg[1]);
        System.out.println(arg[2]);
 */
        int radio=Integer.parseInt(arg[0]);
        double perimetro=2*Math.PI*radio;
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("Perimetro: "+perimetro+"Area: "+area);
    }
}
