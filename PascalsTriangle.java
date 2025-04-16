import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE24111");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows of Pascal's Triangle: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println(); 
        }

        input.close();
    }
}


            
            