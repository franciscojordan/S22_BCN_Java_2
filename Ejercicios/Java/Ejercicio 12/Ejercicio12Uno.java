import java.lang.Math;

public class Ejercicio12Uno {
    public static void main(String[] args){
        tinyint numero = (tinyint) (Math.round(Math.random()));
        boolean resultado = numero==0?false:true;
        System.out.println(resultado + "\n" + (resultado?"rojo":"negro"));
    }
}
