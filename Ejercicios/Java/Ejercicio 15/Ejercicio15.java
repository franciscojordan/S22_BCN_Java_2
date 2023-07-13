public class Ejercicio15 {
    public static void main (String[] args){
        int count = 10;
        for (int i = 0; i < 12; i++) {
            for (int n = 0; n <= 10; n++){
                if (i < 10){
                    if (count > n){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    count = 9;
                    if (count > n){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                
            }
            for (int n = 0; n <= i; n++){
                if (i < 10){
                    System.out.print("*");
                } else {
                    n = 12;
                    System.out.print("**");
                }
            }
            count -= 1;
            System.out.println("");
        }
    }
}
