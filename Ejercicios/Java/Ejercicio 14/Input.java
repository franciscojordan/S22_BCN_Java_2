import java.util.Scanner; // import the Scanner class 


public class Input {
    public static String readLine(){
        Scanner input = new Scanner(System.in);
        
        // Read content written in console
        String inputString = input.nextLine();
        input.close();   
        return inputString;        
    }
}
