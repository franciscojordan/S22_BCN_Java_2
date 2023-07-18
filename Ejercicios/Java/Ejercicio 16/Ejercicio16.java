public class Ejercicio16 {
    public static void main (String[] args){
        System.out.println("Introduce un numero:");
        int numero = Integer.parseInt(Input.readLine());
        int suma = numero;
        while (numero <= 100){
            numero += suma;
            if (numero < 100) {
                System.out.println(numero);
            }
        }
    }
}
