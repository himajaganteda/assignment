import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number less than 10 billion: ");
        long num = input.nextLong(); 
        
        if (num < 0 || num >= 10_000_000_000L) {
            System.out.println("Enter a valid input!");
        } 
        else {
            int digitCount = 0;
            if (num == 0) {
                digitCount = 1;
            } 
            else {
                long temp = num; 
                while (temp > 0) {
                    temp /= 10;
                    digitCount++;
                }
            }
            System.out.println("Number of digits in the number: " + digitCount);
        }

        input.close();
    }
}
