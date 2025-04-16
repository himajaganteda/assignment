import java.util.Scanner;

public class Table{
    public  static void main(String[] args){
       System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE2411");
 
       Scanner input = new Scanner(System.in);

       System.out.println("Input the number (Table to be calculated): ");
       int num = input.nextInt();
       System.out.println("Input the number of terms: ");
       int terms = input.nextInt();

       for(int i = 0; i <= terms; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
       }
   
       input.close();
    }
}