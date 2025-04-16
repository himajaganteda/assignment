import java.util.Scanner;
      public class Order{
            public static void main(String[] args){
            System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");
            
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the First Number: ");
            int a = input.nextInt();
            System.out.println("Enter the Second Number: ");
            int b = input.nextInt();
            System.out.println("Enter the Third Number: ");
            int c = input.nextInt();
            
            if(a>b && b>c){ 
            System.out.println("Decreasing Order.");
            }
            else if(a<b && b<c){
            System.out.println("Increasing Order.");
            }
            else{
            System.out.println("Neither increasing nor decreasing.");
            }
            input.close();
            }
}
