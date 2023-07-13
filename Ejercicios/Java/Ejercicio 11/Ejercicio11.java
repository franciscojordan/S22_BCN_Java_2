import java.lang.Math;

public class Ejercicio11 {
    public static void blancoONegro() {
        byte numero = (byte) (Math.round(Math.random()));
        if (numero != 0) {
            System.out.println("Negro");
        } else {
            System.out.println("Blanco");
        }
    }
    public static void main (String[] args){
        int numero = Integer.parseInt(args[0]);
        System.out.println((numero % 2 == 0)?"par":"impar");

        blancoONegro();
    }
}
