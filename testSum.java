import java.util.Scanner;

public class testSum{
    public int[] array = new int[100];
    public int len;
    public testSum(){
        Scanner input = new Scanner(System.in);
        len = 0;
        while (input.hasNextInt()){
            int temp = input.nextInt();
            array[len++] = temp;
        }
    }
    public static void main(String[] args){
        sum Calculator = new sum();
        testSum newTest = new testSum();
        for (int i = 0; i < newTest.len; i++) Calculator.add(newTest.array[i]);
        System.out.println(Calculator.getSum());
    }
}