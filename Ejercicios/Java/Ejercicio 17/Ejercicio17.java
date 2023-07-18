public class Ejercicio17 {
    public static void main(String[] args){
        // Introducir en args los numeros a comprobar
        System.out.println("Introduce un divisor:");
        int divisor = Integer.parseInt(Input.readLine());
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) % divisor) == 0) {
                System.out.println(args[i]);
            }
        }
    }
}
