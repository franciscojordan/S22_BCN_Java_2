public class Ejercicio7 {
    static int numero = 0;

    public static void incrementar(){numero++;}
    public static void decrementar(){numero--; numero--;}
    public static void main (String[] args){
        incrementar();
        System.out.println(numero);
        incrementar();
        incrementar();
        System.out.println(numero);
        decrementar();
        System.out.println(numero);
    }
}
