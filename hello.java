import java.util.Scanner;

public class hello{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
        }
    }
}