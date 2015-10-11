import java.util.Scanner;

public class testLoop{
    public static void main(String args[]){
        int i, j = 0, k = 0;
        Scanner input = new Scanner(System.in);
        loop1:for (i = 0; i < 100; i++){
            loop2:for (j = 0; j < 100; j++){
                loop3:for (k = 0; k < 100; k++){
                    int t = input.nextInt();
                    if (t == 1) break loop1;
                    if (t == 2) break loop2;
                    if (t == 3) break loop3;
                    if (t == -1)  continue loop1;
                    if (t == -2)  continue loop2;
                    if (t == -3)  continue loop3;
                }
            }
        }
        System.out.println("The loop variable is: " + i + ":" + j + ":" + k);
    }
}