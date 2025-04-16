import java.util.Scanner;

public class Rombus{
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA \nROLL.NO: AV.SC.U4CSE24111");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        input.close();
   
        //upper half of the rombus
        for(int i = 1; i <= n; i++){
              for(int s = 1; s <= n - i; s++){    //space
                     System.out.print(" "); 
              }
              for(int j = 0; j < i; j++){   //increasing characters
                     System.out.print((char) ('A' + j));
              }
              for(int j = i - 2; j >= 0; j--){      //decreasing characters
                     System.out.print((char) ('A' + j));
              }
        System.out.println();
        }
          
        //lower half of the rombus
        for(int i = n - 1; i >= 1; i--){
              for(int s = 1; s <= n - i; s++){    //space
                     System.out.print(" "); 
              }
              for(int j = 0; j < i; j++){   //increasing characters
                     System.out.print((char) ('A' + j));
              }
              for(int j = i - 2; j >= 0; j--){      //decreasing characters
                     System.out.print((char) ('A' + j));
              }
        System.out.println();
        }
        
    }
}
