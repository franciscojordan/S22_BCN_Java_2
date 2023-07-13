/*
 * Programa que dependiendo del numero introducido, devuelve categoria de clima además del tipo de clima al que pertenece esa temperatura.
 */
public class Ejercicio13 {
    public static void main(String[] args) throws Exception{
        System.out.println("Introduce una temperatura en grados centigrados (solo numeros y admite decimales)");
        try {
            float temperatura = Float.parseFloat(Input.readLine());
            if (temperatura == 33){
                System.out.println("me repites ese numerin?");
            }
            if (temperatura >= 10 && temperatura < 20) {
                System.out.println("Climas templados");
                if (temperatura < 13.5) {
                    System.out.println("Oceanico");
                } else if (temperatura > 16.5) {
                    System.out.println("Continental");
                } else {
                    System.out.println("Mediterraneo");
                }

            } else if (temperatura >= 20) {
                System.out.println("Climas calidos");
                if (temperatura < 23.5) {
                    System.out.println("Ecuatorial");;
                } else if (temperatura > 26.5) {
                    System.out.println("Desertico");
                } else {
                    System.out.println("Tropical");
                }
            } else {
                System.out.println("Climas frios");
                if (temperatura < 5) {
                    System.out.println("Polar");;
                } else {
                    System.out.println("Alta montaña");
                }
            }
        } catch (Exception e) {
            System.out.print("Introduce un numero");
        }
    }
}
