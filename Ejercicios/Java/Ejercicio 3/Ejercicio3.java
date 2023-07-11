public class Ejercicio3 {
    public static void main (String[] args) {
        byte valorByte = (byte) (Byte.MAX_VALUE + 5);
        short valorShort = (short) (Short.MAX_VALUE + 25);
        int valorInt = Integer.MAX_VALUE + 10000;
        long valorLong = Long.MAX_VALUE + 20000;
        System.out.println("Byte: " + (valorByte) +
                            "\nShort: " + (valorShort)+
                            "\nInteger: " + (valorInt) +
                            "\nLong: " + (valorLong));
    }
}
	