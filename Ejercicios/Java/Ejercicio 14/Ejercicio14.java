public class Ejercicio14 {
    public static void main (String[] args){
        System.out.println("Introduce un numero del 1 al 9: ");
        int numero = Integer.parseInt(Input.readLine());
        switch (numero){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            default:
                System.out.println("Introduce un numero valido");
                break;
        }
    }
}
